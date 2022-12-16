package com.CustomGenerate;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class Serial_Cust_Id_Gen implements IdentifierGenerator {
	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {


		Connection connection = session.connection();

		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select count(Stu_id) as Id from hibernatedemo.studentcustomgen");

			if (rs.next()) {
				int id = rs.getInt(1) + 1;
				String generatedId = String.valueOf(id);
				System.out.println("Generated Id: " + generatedId);
				Calendar cal = Calendar.getInstance();
				return "Stu_" + generatedId + "_" + cal.get(cal.YEAR);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
}
