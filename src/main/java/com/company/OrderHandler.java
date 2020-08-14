package com.company;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/"})
public class OrderHandler extends HttpServlet {

    /**
     * perfom transaction request
     * @param request
     * @param response
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
       /*
       02004200040000000002161234567890123456060
        9173030123456789ABC1000123456789012345678
        90123456789012345678901234567890123456789
        0123456789012345678901234567890123456789
        */


    }
}












