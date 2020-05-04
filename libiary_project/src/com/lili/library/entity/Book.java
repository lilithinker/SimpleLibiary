package com.lili.library.entity;

import java.util.Date;
import java.util.UUID;

public class Book {
    private UUID id;
    private String name;
    private String author;
    private String press;
    private float price;
    private int pages;
    private Date tomeToLibrary;
    private int counts;
    private long bookTypeId;

    public Book(UUID id, String name, String author, String press, float price, int pages, Date tomeToLibrary, int counts, long bookTypeId) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.price = price;
        this.pages = pages;
        this.tomeToLibrary = tomeToLibrary;
        this.counts = counts;
        this.bookTypeId = bookTypeId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getTomeToLibrary() {
        return tomeToLibrary;
    }

    public void setTomeToLibrary(Date tomeToLibrary) {
        this.tomeToLibrary = tomeToLibrary;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public long getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(long bookTypeId) {
        this.bookTypeId = bookTypeId;
    }
}
