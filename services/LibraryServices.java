package services;

import java.util.ArrayList;
import java.util.List;

import models.Book;

public class LibraryServices {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void listBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public void lendBook(int id, boolean status) {
       for(Book book : books) {
        if(book.getId() == id && book.getStatus() == false) {
            status = true;
            book.setStatus(status);
            System.out.println("O livro foi emprestado!");
        } else {
            System.out.println("Este livro já foi emprestado e não está disponivel");
        }
       }
    }

    public void returnBook(int id, boolean status) {
        for(Book book : books) {
         if(book.getId() == id && book.getStatus() == true) {
             status = false;
             book.setStatus(status);
             System.out.println("O livro foi devolvido!");
         } else {
             System.out.println("Este livro já foi devolvido");
         }
        }
    }

    public Book searchBook(String title, String author) {
        for(Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) || book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }

        return null;
    }
}
