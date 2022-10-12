package com.infosys.java11.mapInterface;


import com.infosys.java11.staticKeyword.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
    Problem Statement

    * The code given below demonstrates how to initialize and iterate map values in
    * different ways. Below code uses entrySet, ketSet(), values() methods to iterate
    * the map values.
*/
public class MapIterationDemo {
    public static void main(String[] args) {
        Map<Books, Author> bookAuthorMap = new HashMap<>();
        Books book1 = new Books(1, "Harry Potter and the Philosopher's Stone");
        Books book2 = new Books(2, "A Game of Throne");
        Books book3 = new Books(3, "A Clash of Kings");

        Author author1 = new Author(1, "J K Rowlings");
        Author author2 = new Author(2, "George R R Martins");

        bookAuthorMap.put(book1, author1);
        bookAuthorMap.put(book2, author2);
        bookAuthorMap.put(book3, author2);

        //Iterating over value column of the Map using map.values()
        Collection<Author> authorsList = bookAuthorMap.values();
        System.out.println("The different authors are: ");
        for (Author author : authorsList) {
            System.out.println(author.authorName);
        }
        System.out.println();

        // Iterating over keys column of the Map using map.keySet()
        Set<Books> bookSet = bookAuthorMap.keySet();
        System.out.println("The difference books with their respective authors are (using KeySet): ");
        for (Books book : bookSet){
            Author author = bookAuthorMap.get(book);
            System.out.println(book.getBookName() + ": " +author.authorName);
        }

        System.out.println();

        // Iterating over key and value of the Map using Set<Entry>
        Set<Entry<Books, Author>> bookAuthorEntries = bookAuthorMap.entrySet();
        System.out.println("The different books with their respective authors are (using EntrySet): ");
        for(Entry<Books, Author> bookAuthorEntry : bookAuthorEntries){
            Books book = bookAuthorEntry.getKey();
            Author author = bookAuthorEntry.getValue();
            System.out.println(book.getBookName() + ": "+author.authorName);
        }
    }
}

class Books{
    private Integer bookId;
    private String bookName;

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

    public Books(Integer bookId, String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Author{
    Integer authorId;
    String authorName;

    public Author(Integer authorId, String authorName){
        this.authorId = authorId;
        this.authorName = authorName;
    }


}