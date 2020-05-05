package com.lili.library.service.Impl;

import com.lili.library.repository.AdminRepository;
import com.lili.library.repository.Impl.AdminRepositoryImpl;
import com.lili.library.repository.Impl.ReaderRepositoryImpl;
import com.lili.library.repository.ReaderRepository;
import com.lili.library.service.LoginService;

public class LoginServiceImpl implements LoginService {
    private AdminRepository adminRepository = new AdminRepositoryImpl();
    private ReaderRepository readerRepository = new ReaderRepositoryImpl();
    @Override
    public Object login(String username, String password, String role) {
        Object object = null;
        switch (role){
            case "admin":
                object = adminRepository.login(username,password);
                break;
            case "reader":
                object = readerRepository.login(username,password);
                break;
        }
        return object;
    }
}
