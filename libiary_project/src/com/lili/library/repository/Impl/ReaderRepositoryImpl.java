package com.lili.library.repository.Impl;

import com.lili.library.entity.Reader;
import com.lili.library.repository.ReaderRepository;
import com.lili.library.utils.JDBCTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReaderRepositoryImpl implements ReaderRepository {
    @Override
    public Reader login(String username, String password) {
        Connection connection = JDBCTool.getConnect();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from reader where username = ? and password = ?";
        Reader reader = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                reader = new Reader(
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reader;
    }
}
