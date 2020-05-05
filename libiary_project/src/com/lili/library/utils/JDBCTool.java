package com.lili.library.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTool {
    private static DataSource dataSource = null;

    static {
        dataSource = new ComboPooledDataSource("library");
    }

    public static Connection getConnect(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void release(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }

            if(preparedStatement != null){
                preparedStatement.close();
            }

            if(resultSet != null){
                resultSet.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
