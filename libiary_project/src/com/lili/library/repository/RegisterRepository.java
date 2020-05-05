package com.lili.library.repository;

public interface RegisterRepository {
    public int addReader(String username, String password, String name, String telephone, String major, String grade);
}
