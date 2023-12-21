package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

        int result = 0;

        if ("add".equals(operation)) {
            result = num1 + num2;
        } else if ("multiply".equals(operation)) {
            result = num1 * num2;
        }

        PrintWriter out = res.getWriter();
        out.println("Result: " + result);
    }
}
