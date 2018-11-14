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
public class UserSelect {
	//查找所有用户
	 public List<Teacher> findAllPets() throws Exception {
	        Connection conn=MySQLConnect.getConnection();
	        String sql="select * from pet";
	        PreparedStatement stmt= conn.prepareStatement(sql);
	        ResultSet rs=    stmt.executeQuery();
	        List<Teacher> petList=new ArrayList<Teacher>();
	        while(rs.next()) {
	            Teacher pet=new Teacher(/**
	                    rs.getInt("id"),
	                    rs.getInt("owner_id"),
	                    rs.getInt("store_id"),
	                    rs.getString("name"),
	                    rs.getString("type_name"),
	                    rs.getInt("health"),
	                    rs.getInt("love"),
	                    rs.getDate("birthday")**/
	                    );
	                petList.add(pet);
	        }
	        MySQLConnect.closeAll(conn, stmt, rs);
	        return petList;
	    }
}
