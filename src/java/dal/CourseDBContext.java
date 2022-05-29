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

    public Course getCourseDetail(int CourseId) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "SELECT [CourseId]\n"
                + "      ,[createdate]\n"
                + "      ,[briefinfo]\n"
                + "      ,[thumnaiURL]\n"
                + "      ,[title]\n"
                + "      ,[featured]\n"
                + "      ,[Categoryid]\n"
                + ",[tagline]\n"
                + "      ,[statusid]\n"
                + ",[tagline]"
                + "  FROM [Courses] c\n"
                + "  where c.CourseId = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, CourseId);
            stm.executeQuery();
            rs = stm.executeQuery();
            if (rs.next()) {
                Course Course = new Course();
                Course.setCourseId(CourseId);
                Course.setCreatedate(rs.getDate("createdate"));
                Course.setBriefinfo(rs.getString("briefinfo"));
                Course.setThumnailURL(rs.getString("thumnaiURL"));
                Course.setTitle(rs.getString("title"));
                Course.setFeature(rs.getBoolean("featured"));
                Course.setTagline(rs.getString("tagline"));
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

    public ArrayList<Course> getMyCourse(int UserId, int pageindex, int pagesize) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "	select * from\n"
                + "	(select c.CourseId,\n"
                + "     c.title,\n"
                + "     c.briefinfo,\n"
                + "     c.createdate,\n"
                + "     c.Categoryid,\n"
                + "     c.featured,\n"
                + "     c.statusid,\n"
                + "     c.tagline,\n"
                + "     c.thumnaiURL,\n"
                + "	u.Userid,\n"
                + "	ROW_NUMBER() over (order by c.CourseId asc ) as row_index\n"
                + "     from \n"
                + "     [User] u inner join User_Course uc on u.Userid=uc.Userid\n"
                + "              inner join Courses c on uc.Courseid = c.CourseId) u\n"
                + "     where u.Userid = ? \n"
                + "		and row_index >= (?-1)*?+1 and row_index<= ?*?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, UserId);
            stm.setInt(2, pageindex);
            stm.setInt(3, pagesize);
            stm.setInt(4, pageindex);
            stm.setInt(5, pagesize);
            stm.executeQuery();
            rs = stm.executeQuery();
            ArrayList<Course> Courses = new ArrayList<>();
            while (rs.next()) {
                Course Course = new Course();
                Course.setCourseId(rs.getInt("CourseId"));
                Course.setCreatedate(rs.getDate("createdate"));
                Course.setBriefinfo(rs.getString("briefinfo"));
                Course.setThumnailURL(rs.getString("thumnaiURL"));
                Course.setTitle(rs.getString("title"));
                Course.setFeature(rs.getBoolean("featured"));
                Course.setTagline(rs.getString("tagline"));
                Category category = new Category();
                category.setCategoryId(rs.getInt("Categoryid"));
                Course.setCategory(category);
                Status a = new Status();
                Course.setStatus(a);
                Courses.add(Course);
            }
            return Courses;
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

    public static void main(String[] args) {
        CourseDBContext cdbc = new CourseDBContext();
        System.out.println(cdbc.getMyCourse(1,1,8).get(7).getCourseId());
    }
}
