package models;

public class Book {
    private int id;
    private String title;
    private String author;
    private int publiYear;
    private boolean status;

    public Book(int id, String title, String author, int publiYear, boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publiYear = publiYear;
        this.status = false;
    }

    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getPubliYear() {
        return this.publiYear;
    }
    
    public void setPubliYear(int publiYear) {
        this.publiYear = publiYear;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Livro " + "{" + "id: " + id + " Título: " + title +
        " Autor: " + author + " Ano de publicação: " + publiYear + " Disponível: " + 
        (status ? "Sim" : "Não");
    }
}