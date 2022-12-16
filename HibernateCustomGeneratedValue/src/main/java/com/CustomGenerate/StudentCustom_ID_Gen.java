package com.CustomGenerate;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentCustom_ID_Gen implements IdentifierGenerator {
// Custom StudentCustom_ID_Gen
	public int generatedStuId() {
		Random ran = new Random();
		return ran.nextInt(100);

	}

	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

		Calendar cal = Calendar.getInstance();

		return "STU_" + this.generatedStuId() + "_" + cal.get(cal.YEAR);
	}

}
