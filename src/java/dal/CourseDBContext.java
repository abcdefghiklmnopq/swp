/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Course;
import model.PricePackage;
import model.Status;

/**
 *
 * @author thand
 */
public class CourseDBContext extends DBContext {
    public Course getCourse(int id) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "SELECT [CourseId]\n"
                + "      ,[createdate]\n"
                + "      ,[briefinfo]\n"
                + "      ,[thumnaiURL]\n"
                + "      ,[title]\n"
                + "      ,[featured]\n"
                + "      ,[Categoryid]\n"
                + "      ,[statusid]\n"
                +",[tagline]"
                + "  FROM [Courses] c\n"
                + "  where c.CourseId = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);

            stm.executeQuery();
            rs = stm.executeQuery();
            if (rs.next()) {
                Course Course = new Course();
                Course.setCourseId(id);
                Course.setCreatedate(rs.getDate("createdate"));
                Course.setBriefinfo(rs.getString("briefinfo"));
                Course.setThumnailURL(rs.getString("thumnaiURL"));
                Course.setTitle(rs.getString("title"));
                Course.setFeature(rs.getBoolean("featured"));
                Category category = new Category();
                
                category.setCategoryId(rs.getInt("Categoryid"));
                
                Course.setCategory(category);
                Status a = new Status();
                Course.setStatus(a);
                return Course;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
            }
        }
        return null;
    }
}
