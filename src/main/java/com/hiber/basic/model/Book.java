package com.hiber.basic.model;

import javax.persistence.*;

@Entity
public class Book {

    //    @OneToOne
    @ManyToOne
//    @ManyToMany(mappedBy = "bookList")
            Author author;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bookName;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
