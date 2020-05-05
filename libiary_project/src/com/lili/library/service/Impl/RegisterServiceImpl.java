package com.lili.library.service.Impl;

import com.lili.library.repository.Impl.RegisterRepositoryImpl;
import com.lili.library.repository.RegisterRepository;
import com.lili.library.service.RegisterReaderService;

public class RegisterServiceImpl implements RegisterReaderService {
    private RegisterRepository registerRepository = new RegisterRepositoryImpl();
    @Override
    public int register(String username, String password, String name, String telephone, String major, String grade) {
        return registerRepository.addReader(username,password,name,telephone,major,grade);
    }
}
