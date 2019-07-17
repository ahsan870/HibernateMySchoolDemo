package com.ahsan.main;

import com.ahsan.entities.DepartmentsEntity;
import com.ahsan.entities.StudentsEntity;
import com.ahsan.repositories.DepartmentsRepository;
import com.ahsan.repositories.StudentsRepository;

public class OneToOneMain {

	public static void main(String[] args) {
		DepartmentsRepository departmentsRepository = new DepartmentsRepository();
		StudentsRepository studentsRepository = new StudentsRepository();
		
		StudentsEntity s = new StudentsEntity();
		
		s.setName("Ahsan");
		s.setPhone("6461234567");
		s.setEmail("ahsan@gmail.com");
		
		DepartmentsEntity departmentsEntity = departmentsRepository.getDeptByName("IT");
		
		s.setDepartments(departmentsEntity);
		
		studentsRepository.save(s);
	

	}

}
