package com.lili.library.repository.Impl;

import com.lili.library.entity.Admin;
import com.lili.library.repository.AdminRepository;
import com.lili.library.utils.JDBCTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepositoryImpl implements AdminRepository {
    @Override
    public Admin login(String username, String password) {
        Connection connection = JDBCTool.getConnect();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from admin where username = ? and password = ?";
        Admin admin = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                admin = new Admin(
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTool.release(connection,preparedStatement,resultSet);
        }
        return admin;
    }
}
