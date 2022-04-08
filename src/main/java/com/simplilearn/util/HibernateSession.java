package com.simplilearn.util;
import org.hibernate.SessionFactory;




import org.hibernate.cfg.Configuration;

import com.simplilearn.phase2_project.Classes;
import com.simplilearn.phase2_project.Students;
import com.simplilearn.phase2_project.Subjects;
import com.simplilearn.phase2_project.Teacher;
public class HibernateSession {

	private static SessionFactory factory;

	public static SessionFactory buildSessionFactory() {		
		// load configuration
		factory = new Configuration().configure("hibernate.cfg.xml")
				//add mapping
				.addAnnotatedClass(Students.class)
				.addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(Classes.class)
			.addAnnotatedClass(Subjects.class)

				.buildSessionFactory();

		return factory;
	}
} 
}
