package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChooseOperationServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Calculator</title></head>");
        out.println("<body>");
        out.println("<h2>Choose Operation</h2>");
        out.println("<form action='result' method='GET'>");
        out.println("Enter first number: <input type='text' name='num1'><br/>");
        out.println("Enter second number: <input type='text' name='num2'><br/>");
        out.println("Choose operation: ");
        out.println("<select name='operation'>");
        out.println("   <option value='add'>Add</option>");
        out.println("   <option value='multiply'>Multiply</option>");
        out.println("</select><br/>");
        out.println("<input type='submit'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
