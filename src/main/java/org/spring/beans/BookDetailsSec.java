package org.spring.beans;

import org.spring.interfaces.Book;
import org.springframework.stereotype.Component;

@Component(value = "bookDetailsSec")
public class BookDetailsSec implements Book {

    private String name;

    private String type;

    private String author;

    private String price;

    public BookDetailsSec() {
        this.name = "Rich Dad, Poor Dad";
        this.type = "Personal finance";
        this.author = "Robert Kiyosaki";
        this.price = "35.10";
    }
    @Override
    public String getTitle() {
        return this.name;
    }
    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public String getAuthor() {
        return this.author;
    }
    @Override
    public String getPrice() {
        return this.price;
    }
}
