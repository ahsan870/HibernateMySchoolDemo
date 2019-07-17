package com.ahsan.main;

import java.util.ArrayList;
import java.util.List;
import com.ahsan.entities.DepartmentsEntity;
import com.ahsan.entities.StudentsEntity;
import com.ahsan.repositories.DepartmentsRepository;


public class OneToManyMappedByMain {
	
	public static  void  main(String []args) {
	
	DepartmentsRepository departmentsRepository = new DepartmentsRepository();

	
	DepartmentsEntity departmentsEntity = new DepartmentsEntity();
	
	departmentsEntity.setName("Medicine");
	departmentsEntity.setPhone("3475051212");
	
	StudentsEntity s1 = new StudentsEntity();
	s1.setName("Paul");
	s1.setPhone("9173335060");
	s1.setEmail("paul@gmail");
	s1.setDepartments(departmentsEntity);
	
	
	StudentsEntity s2 = new StudentsEntity();
	s2.setName("Smith");
	s2.setPhone("3473335060");
	s2.setEmail("smith@gmail");
	s2.setDepartments(departmentsEntity);
	
	List<StudentsEntity> students = new ArrayList<StudentsEntity>();
	students.add(s1);
	students.add(s2);
	
	
	departmentsEntity.setStudent(students);
	departmentsRepository.save(departmentsEntity);
	
	}

}
