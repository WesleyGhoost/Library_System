package models;

public class Book {
    private String title;
    private int id;
    private String actor;
    private int publiYear;
    private boolean status;

    public Book(String title, int id, String actor, int publiYear, boolean status) {
        this.title = title;
        this.id = id;
        this.actor = actor;
        this.publiYear = publiYear;
        this.status = false;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getActor() {
        return this.actor;
    }
    
    public void setActor(String actor) {
        this.actor = actor;
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
        " Autor: " + actor + " Ano de publicação: " + publiYear + " Disponível: " + 
        (status ? "Sim" : "Não");
    }
}