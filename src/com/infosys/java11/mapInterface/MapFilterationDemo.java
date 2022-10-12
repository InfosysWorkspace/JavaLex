package com.infosys.java11.mapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class MapFiltrationDemo {

    public static void main(String[] args) {
        Map<Book, Authors> bookAuthorMap = new HashMap<Book, Authors>();
        Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone", "Fantasy");
        Book book2 = new Book(2, "War and Peace", "History");
        Book book3 = new Book(3, "A Game of Thrones", "Epic fantasy");
        Book book4 = new Book(4, "A Clash of Kings", "Epic fantasy");
        Book book5 = new Book(5, "Ninteen Eight-Four", "Science fiction");


        Authors author1 = new Authors(1, "J K Rowling");
        Authors author2 = new Authors(2, "George R R Martin");
        Authors author3 = new Authors(3, "George Orwell");
        Authors author4 = new Authors(4, "Leo Tolstoy");

        bookAuthorMap.put(book1, author1);
        bookAuthorMap.put(book2, author4);
        bookAuthorMap.put(book3, author2);
        bookAuthorMap.put(book4, author2);
        bookAuthorMap.put(book5, author3);

        //Filtering books based on genre and populating a list of such books
        List<FantasyBook> fantasyBooksList = new ArrayList<FantasyBook>();

        Set<Entry<Book, Authors>> bookAuthorEntries = bookAuthorMap.entrySet();
        Iterator<Entry<Book, Authors>> bookAuthorEntryIterator = bookAuthorEntries.iterator();
        while(bookAuthorEntryIterator.hasNext()) {
            Entry<Book, Authors> bookAuthorEntry = bookAuthorEntryIterator.next();
            Book book = bookAuthorEntry.getKey();
            Authors author = bookAuthorEntry.getValue();

            if(book.getGenre().toLowerCase().contains("fantasy")){
                FantasyBook fantasyBook = new FantasyBook();
                fantasyBook.setBookName(book.getBookName());
                fantasyBook.setGenre(book.getGenre());
                fantasyBook.setAuthorName(author.getAuthorName());
                fantasyBooksList.add(fantasyBook);
            }
        }

        System.out.println("The books that belongs to the genre fantasy are :");
        for (FantasyBook fantasyBook : fantasyBooksList) {
            System.out.println(fantasyBook.getBookName()+" written by "+fantasyBook.getAuthorName());
        }
        System.out.println();
    }
}

class Book {
    private Integer bookId;
    private String bookName;
    private String genre;

    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Book(Integer bookId, String bookName, String genre) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.genre = genre;
    }
}

class Authors {
    private Integer authorId;
    private String authorName;
    public Integer getAuthorId() {
        return authorId;
    }
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Authors(Integer authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }
}

class FantasyBook {
    private String bookName;
    private String genre;
    private String authorName;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
