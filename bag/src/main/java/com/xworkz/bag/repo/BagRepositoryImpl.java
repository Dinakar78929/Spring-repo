package com.xworkz.bag.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.bag.dto.BagDTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class BagRepositoryImpl implements BagRepository{
	String url="jdbc:mysql://localhost:3306/bag";
	String userName="root";
	String password="system";
	@Override
	public boolean save(BagDTO dto) throws ClassNotFoundException{
		System.out.println("running save method");
		int count=0;
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection(url, userName, password)){
			String query="insert into details values(?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,dto.getBrand());
			preparedStatement.setString(2,dto.getColor());
			preparedStatement.setString(3,dto.getType());
			count=preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(count!=0) {
			return true;
		}else {
		return false;
		}
	}
	}
//if(dto!=null){
//System.out.println("DTO is not null");
//return this.save(dto);
//}else {
//return false;

