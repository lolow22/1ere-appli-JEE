package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello","/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname= request.getParameter("lastname");
        int hour1 = Integer.parseInt(request.getParameter("hour"));

        PrintWriter out = response.getWriter();
        String hour = "";
        if (hour1 < 10 && hour1 >= 4) {
            hour = "Good Morning";
        }
        if (hour1 > 10 && hour1 < 16 ) {
            hour = "Good Afternoon";
        }
        if (hour1 >= 16) {
            hour = "Good Night";
        }

        String message = firstname + " " + lastname + " " + hour;
        request.setAttribute("sample", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
