package utils;

import javax.swing.*;

public class Inputs {
    public int idInput() {
        String bookId = JOptionPane.showInputDialog("Digite o ID");
        int convertedBookId = Integer.parseInt(bookId);
        return convertedBookId;
    } 

    public String titleInput() {
        String bookTitle = JOptionPane.showInputDialog("Digite o título");
        return bookTitle;
    } 

    public String authorInput() {
        String bookAuthor = JOptionPane.showInputDialog("Digite o nome do/a autor/a");
        return bookAuthor;
    } 

    public int publiYearInput() {
        String bookPubliYear = JOptionPane.showInputDialog("Digite o ano de publicação");
        int convertedBookId = Integer.parseInt(bookPubliYear);
        return convertedBookId;
    } 

    public boolean statusInput() {
        String bookStatus = JOptionPane.showInputDialog("Digite o status atual do livro");
        boolean convertedBookStatus = Boolean.parseBoolean(bookStatus);
        return convertedBookStatus;
    }
}
