package com.lili.library.repository;

import com.lili.library.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
