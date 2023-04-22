package oops;
/*
* The Book class should have the following attributes:
title (String)
author (String)
publication year (int)
availability (boolean)*/
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean availability;

    public Book(String title, String author,int publicationYear,boolean availability) {
        this.author=author;
        this.title=title;
        this.availability=availability;
        this.publicationYear=publicationYear;
    }
    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String toString(){
        String toReturn = this.title+" is written by "+this.author+" published in "+this.publicationYear;
        return toReturn;
    }

    public boolean checkout(){
        return availability ? true : false;
    }
}
