//Question 1 and 2 :
// 1.Create a class Database with 2 instance variables port and name.
// Configure Database class bean in spring container through Spring XML.
// Initialize instance variables using setter method.
//2.Get the bean of the class from spring container and print the values of the instance variable.


package com.ttn.spring.session;

public class Database {

    Integer port;
    String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
