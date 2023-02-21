package org.spring;

import org.spring.beans.BookDetailsSec;
import org.spring.beans.MyBean;
import org.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationConfiguration = new AnnotationConfigApplicationContext();
        applicationConfiguration.register(ApplicationConfiguration.class);
        applicationConfiguration.refresh();

        System.out.println("First Book");
        MyBean myBean = applicationConfiguration.getBean(MyBean.class);
        System.out.println(myBean.bookName());
        System.out.println(myBean.bookType());
        System.out.println(myBean.bookAuthor());
        System.out.println(myBean.bookPrice());

        System.out.println();
        System.out.println("Second Book");
        myBean.setName(new BookDetailsSec());
        System.out.println(myBean.bookName());

        myBean.setType(new BookDetailsSec());
        System.out.println(myBean.bookType());

        myBean.setAuthor(new BookDetailsSec());
        System.out.println(myBean.bookAuthor());

        myBean.setPrice(new BookDetailsSec());
        System.out.println(myBean.bookPrice());

    }
}