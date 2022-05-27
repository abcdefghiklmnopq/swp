/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CourseDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Course;

/**
 *
 * @author pv
 */
public class CourseDetailController extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = "1";
        id = request.getParameter("id");
        int a =1;
        if( id!=null && !id.isEmpty() ){
            a = Integer.parseInt(id);
        }
        //adadajn
        CourseDBContext cdb = new CourseDBContext();
        Course Course = cdb.getCourse(a);
        request.setAttribute("Course", Course);
        request.setAttribute("now", java.time.LocalDate.now()); 
        request.getRequestDispatcher("../view/courseDetail.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
