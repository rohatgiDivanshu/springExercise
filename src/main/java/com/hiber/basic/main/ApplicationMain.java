package com.hiber.basic.main;

import com.hiber.basic.model.Address;
import com.hiber.basic.model.Author;
import com.hiber.basic.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;

public class ApplicationMain {
    public static void main(String[] args) {

        //Transient
        Author author = new Author();
        author.setFirstName("Divanshu");
        author.setAge(23);
        author.setDob(new Date(2001 - 02 - 12));
        author.setMobileNumber(979731981);

//        Address address = new Address();
//        address.setLocation("Delhi");
//        address.setState("Delhi");
//        author.setAddress(address);

//        author.setListOfSubjects(Arrays.asList("Physics", "Chemistry", "Biology"));

        Book book = new Book();
        book.setBookName("Shiva Triology");

        author.getBookList().add(book);
        book.setAuthor(author);
//        author.setBookName(book.getBookName());

//        Book book1 = new Book();
//        book1.setBookName("Shiva 2");
//
//        book.setAuthor(author);


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
        Transaction transaction = session.beginTransaction();
        //Persistant
        session.persist(author);
//        session.save(book);
//        session.getTransaction().commit();
        transaction.commit();


        /*author.setMobileNumber(46732647);
        session.update(author);*/
//        session.close();
//        sessionFactory.close();

//        author = session.get(Author.class,1L);
//        author.setAge(25);
//        session.update(author);
//        transaction.commit();
//        session.getTransaction().commit();
//        session.save(author);
//        session.close();


//        author = session.get(Author.class,1L);
//        session.delete(author);
//        transaction.commit();
//        session.getTransaction().commit();
//        session.save(author);
//        session.close();


    }
}
