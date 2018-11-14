package io.gcplus.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import io.gcplus.DBconnect.MySQLConnect;
import io.gcplus.entity.Teacher;

/**
 * 该类实现用户的查找
 * 
 * @author Acer
 *
 */
public class UserDao {
	//查找所有用户
	 public List<Teacher> findAllTeachers() throws Exception {
	        Connection conn=MySQLConnect.getConnection();
	        /**
	         * *代表所有的意思
	         * where表示限制条件
	         * 
	         */
	        String sql="select * from teacher";
	        PreparedStatement stmt= conn.prepareStatement(sql);
	        ResultSet rs= stmt.executeQuery();
	        List<Teacher> teacherList=new ArrayList<Teacher>();
	        while(rs.next()) {
	            Teacher teacher=new Teacher(
	            		rs.getString("name"),
	            		rs.getInt("age"),
	            		rs.getByte("sex"),
	            		rs.getString("type"),
	            		rs.getString("post"),
	            		rs.getString("title"),
	            		rs.getString("education"),
	            		rs.getString("politic"),
	            		rs.getDate("collegetime"),
	            		rs.getDate("worktime")
	                    );
	                teacherList.add(teacher);
	        }
	        MySQLConnect.closeAll(conn, stmt, rs);
	        return teacherList;
	    }
}
