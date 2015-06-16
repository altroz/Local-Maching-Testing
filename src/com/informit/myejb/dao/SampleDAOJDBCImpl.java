package com.informit.myejb.dao;
import java.sql.*;

public class SampleDAOJDBCImpl implements SampleDAO {
	sampleDAOException{
		try{
			Connection conn = getConnection();
			PrepareStatement ps = conn.prepareStatement("INSERT INTO sample VALUES(?,?,?)");
			ps.setLong(1,id);
			ps.setString(2,name);
			ps.setString(3,data);
			ps.executeUpdate();
			return new SampleModel(id, name, data);
		}
		catch(SQLException e){
			throw new SampleDAOException(e);
		}
	}
	public void delete(long id, SampleModel model) throws SampleDAOException {
		//Similar: DELETE FROM sample WHERE id = ? 
	}
	public void update(long id, SampleModel model) throws SampleDAOException {
		//Similar: UPDATE sample SET name = ?, data=?, WHERE id = ?
	}
	public SampleModel[] findByName(String name) throw SampleDAOException {
		//Similar: SELECT FROM sample WHERE id = ?
	}
}
