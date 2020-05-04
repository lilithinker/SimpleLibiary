package com.lili.library.entity;

import java.util.UUID;

public class Borrow {
    private UUID id;
    private Reader reader;
    private Admin admin;
    private Book book;
    private BorrowStatus borrowStatus;

    public Borrow(UUID id, Reader reader, Admin admin, Book book, BorrowStatus borrowStatus) {
        this.id = id;
        this.reader = reader;
        this.admin = admin;
        this.book = book;
        this.borrowStatus = borrowStatus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BorrowStatus getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(BorrowStatus borrowStatus) {
        this.borrowStatus = borrowStatus;
    }
}
