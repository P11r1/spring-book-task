package org.spring.beans;

import lombok.Setter;
import org.spring.Main;
import org.spring.interfaces.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyBean {
    private Book name;
    private Book type;
    private Book author;
    private Book price;

    public MyBean(@Qualifier("bookDetails") Book name,
                  @Qualifier("bookDetails") Book type,
                  @Qualifier("bookDetails") Book author,
                  @Qualifier("bookDetails") Book price) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String bookName() {
        return "Book title is: " + name.getTitle();
    }

    public String bookType() {
        return "Book type is: " + type.getType();
    }

    public String bookAuthor() {
        return "Book author: " + author.getAuthor();
    }

    public String bookPrice() {
        return "Price of the book: " + price.getPrice();
    }

}
