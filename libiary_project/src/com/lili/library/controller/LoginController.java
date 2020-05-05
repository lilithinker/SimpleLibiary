package com.lili.library.controller;

import com.lili.library.entity.Admin;
import com.lili.library.entity.Reader;
import com.lili.library.service.Impl.LoginServiceImpl;
import com.lili.library.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private LoginService loginService = new LoginServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        Object object = loginService.login(username,password,role);
        HttpSession session = req.getSession();
        if(object != null){
            switch (role){
                case "admin":
                    Admin admin = (Admin)object;
                    session.setAttribute("user",admin);
                    resp.sendRedirect("approve.jsp");
                    break;
                case "reader":
                    Reader reader = (Reader)object;
                    session.setAttribute("user",reader);
                    resp.sendRedirect("index.jsp");
                    break;
            }
        }else{
            resp.sendRedirect("login.jsp");
        }

    }
}
