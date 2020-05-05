package com.lili.library.repository.Impl;

import com.lili.library.repository.RegisterRepository;
import com.lili.library.utils.JDBCTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class RegisterRepositoryImpl implements RegisterRepository {

    @Override
    public int addReader(String username, String password, String name, String telephone, String major, String grade) {
        Connection connection = JDBCTool.getConnect();
        PreparedStatement preparedStatement = null;
        String uuid = UUID.randomUUID().toString();
        int result = 0;
        String sql = "insert into reader (id,username,password,name,major,grade,telephone) values (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,uuid);
            preparedStatement.setString(2,username);
            preparedStatement.setString(3,password);
            preparedStatement.setString(4,name);
            preparedStatement.setString(5,major);
            preparedStatement.setString(6,grade);
            preparedStatement.setString(7,telephone);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTool.release(connection,preparedStatement,null);
        }
        return result;
    }
}
