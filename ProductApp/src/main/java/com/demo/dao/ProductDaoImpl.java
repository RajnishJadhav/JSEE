package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.models.MyProduct;

public class ProductDaoImpl implements ProductDao{

	static Connection conn;
	static PreparedStatement selpro,delpro,inspro;
	static {
		conn = DBUtil.MyConnectionOpen();
		try {
			selpro=conn.prepareStatement("select * from prroduct");
			delpro=conn.prepareStatement("delete from prroduct where pid=?");
			inspro=conn.prepareStatement("insert into prroduct values(?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<MyProduct> getAllProducts() {
		
		List<MyProduct> lst=new ArrayList();
		try {
			
			ResultSet rs=selpro.executeQuery();
			while(rs.next()) {
				MyProduct p = new MyProduct(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				lst.add(p);
			}          
				
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lst;


}
	@Override
	public void deleteProduct(int id) {
		try {
			delpro.setInt(1, id);
			delpro.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void addNewProduct(MyProduct p) {
		try {
			inspro.setInt(1,p.getId());
			inspro.setString(2,p.getName());
			inspro.setDouble(3,p.getPrice());
			inspro.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
	
