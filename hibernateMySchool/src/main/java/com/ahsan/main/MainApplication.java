package com.ahsan.main;

import com.ahsan.entities.DepartmentsEntity;
import com.ahsan.repositories.DepartmentsRepository;

public class MainApplication {

	public static void main(String[] args) {
		
		DepartmentsRepository departmentsRepository = new DepartmentsRepository();
		
		
		DepartmentsEntity  departmentsEntity = new DepartmentsEntity();
		
		departmentsEntity.setName("Networking");
		departmentsEntity.setPhone("1238354801");
		
		departmentsRepository.save(departmentsEntity);

		/*

System.out.println("Hello calling from Dept name");


	DepartmentsEntity c1 = departmentsRepository.getDeptByName("Law");
	if (c1 != null) {
		System.out.println(c1.toString());
	}
	*/
	}
	
}
