package com.lili.library.controller;

import com.alibaba.fastjson.JSONObject;
import com.lili.library.service.Impl.RegisterServiceImpl;
import com.lili.library.service.RegisterReaderService;
import com.lili.library.utils.GetBodyParams;
import com.mysql.jdbc.StringUtils;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/register-reader")
public class RegisterReaderController extends HttpServlet {
    private RegisterReaderService registerReaderService = new RegisterServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String telephone = req.getParameter("telephone");
        String major = req.getParameter("major");
        String grade = req.getParameter("grade");
        int result = registerReaderService.register(username,password,name,telephone,major,grade);
        System.out.println(result);
    }
}


