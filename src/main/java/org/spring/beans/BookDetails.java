package org.spring.beans;

import org.spring.interfaces.Book;
import org.springframework.stereotype.Component;

@Component(value = "bookDetails")
public class BookDetails implements Book {

    private String name;

    private String type;

    private String author;

    private String price;

    public BookDetails() {
        this.name = "Avatar";
        this.type = "Sci-Fi";
        this.author = "James Cameron";
        this.price = "29.99";
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
