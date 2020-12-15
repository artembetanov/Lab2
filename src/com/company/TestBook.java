package com.company;

public class TestBook
{

    public static void main(String[] args) {
        Book b1 = new Book("War and peace","Tolstoy",1000,1863);
        Book b2 = new Book("The master and Margarita","Bulgakov",1200,1920);
        System.out.println(b1);
        System.out.println(b2);
        b1.setName("1");
        b1.setAuthor("2");
        b1.setPages(3);
        b1.setYear(4);
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPages());
        System.out.println(b1.getYear());
    }
}