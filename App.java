import models.Book;
import services.LibraryServices;
import utils.Inputs;
import java.util.Scanner;
import javax.swing.*;

public class App {
    public static void main(String args[]) {
        LibraryServices libraryServices = new LibraryServices();
        Inputs inputs = new Inputs();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Excluir livro");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Listar livros");

            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    int inputedIdFirstCase = inputs.idInput();
                    String inputedTitle = inputs.titleInput();
                    String inputedAuthor = inputs.authorInput();
                    int inputedPubliYear = inputs.publiYearInput();
                    boolean inputedStatus = inputs.statusInput();

                    Book newBook = new Book(inputedIdFirstCase, inputedTitle, inputedAuthor, inputedPubliYear, inputedStatus);
                    libraryServices.addBook(newBook);
                    break;

                case 2:
                    int inputedIdSecondCase = inputs.idInput();
                    libraryServices.deleteBook(inputedIdSecondCase);
                    break;

                case 3:
                    int inputedIdThirdCase = inputs.idInput();
                    boolean inputedStatusThirdCase = inputs.statusInput();
                    libraryServices.lendBook(inputedIdThirdCase, inputedStatusThirdCase);
                    break;
                
                case 4:
                    int inputedIdFourthCase = inputs.idInput();
                    boolean inputedStatusFourthCase = inputs.statusInput();
                    libraryServices.returnBook(inputedIdFourthCase, inputedStatusFourthCase);
                
                case 5:
                    String inputedTitleFifthCase = inputs.titleInput();
                    String inputedAuthorFifthCase = inputs.authorInput();
                    libraryServices.searchBook(inputedTitleFifthCase, inputedAuthorFifthCase);
            }
        }
    }
}