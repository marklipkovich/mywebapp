package org;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class KathyServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException  {
        PrintWriter out;
        String title = "PhraseOMatic has generated the following phrase.";
        response.setContentType("text/html");
        out = response.getWriter();

        out.println("<HTML><HEAD><TITLE>");
        out.println("PhraseOmatic");
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<P>" + PhraseOMatic2.makePhrase());
        //out.println("<P><a href=\"KathyServlet\">make another phrase</a></p>");
        out.println("<P><a href=\"servlet\">make another phrase</a></p>");
        out.println("</BODY></HTML>");

        out.close();
    }

}
