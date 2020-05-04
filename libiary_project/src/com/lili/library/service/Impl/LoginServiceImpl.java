package com.lili.library.service.Impl;

import com.lili.library.service.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public Object Login(String username, String password, String role) {
        Object object = null;
        switch (role){
            case "admin":
                object = null;
            case "reader":
                object = null;
        }
        return object;
    }
}
