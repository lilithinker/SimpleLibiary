package com.lili.library.repository;

import com.lili.library.entity.Reader;

public interface ReaderRepository {
    public Reader login(String username,String password);
}
