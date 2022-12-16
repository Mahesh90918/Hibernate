package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class Demojdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedemo", "root",
					"root");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?)");
			ps.setInt(1, 01);
			ps.setString(2, "siva");
			ps.setDouble(3, 1234.00);
			ps.addBatch();
			Student s = new Student(02, "shankar", 4321.00);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setDouble(3, s.getFee());
			ps.addBatch();

			int[] i = ps.executeBatch();
			for (int j : i) {
				System.out.println(j);
			}
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
