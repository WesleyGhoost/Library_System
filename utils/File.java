package utils;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Book;

public class File {
    public static void saveBooksToFile(List<Book> books, String filename) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for(Book book : books) {
                writer.write(book.getId() + ", " + book.getTitle() + ", " + book.getAuthor() + ", " +
                             book.getPubliYear() + ", " + book.getStatus());
                writer.newLine();
            }
        } catch(IOException e) {
            System.out.println("Erro ao salvar o arquivo de livros: " + e.getMessage());
        }
    }

    public static List<Book> loadBooksToFile(String filename) {
        List<Book> books = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                books.add(new Book(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    Integer.parseInt(parts[3]),
                    Boolean.parseBoolean(parts[4])
                    ));
            }
        } catch(IOException e) {
            System.out.println("Erro ao carregar o arquivo de livros: " + e.getMessage());
        }

        return null;
    }
}
