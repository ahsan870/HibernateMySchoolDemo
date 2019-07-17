package com.ahsan.main;

import java.util.ArrayList;
import java.util.List;

import com.ahsan.entities.BookEntity;
import com.ahsan.entities.StudentsEntity;
import com.ahsan.repositories.BooksRepository;
import com.ahsan.repositories.StudentsRepository;

public class OneToOneJoinTableMain {

	public static void main(String[] args) {
		
		//StudentsRepository studentsRepository = new StudentsRepository();
		BooksRepository booksRepository = new BooksRepository();
		// insert
		
		BookEntity book = new BookEntity();
		book.setName("Gen mind the begginer mind");
		book.setWriterName("Shunryu Suzuki");
		
		
		booksRepository.save(book);
	/*	
//		StudentsEntity Diju =  studentsRepository.getStudentByName("Diju");
//		StudentsEntity Ahsan =  studentsRepository.getStudentByName("Ahsan");
//	
		StudentsEntity Diju =  studentsRepository.getByID(1l);
		StudentsEntity Ahsan =  studentsRepository.getByID(2l);
		
	List<StudentsEntity> students = new ArrayList<StudentsEntity>();
		students.add(Diju);
	    students.add(Ahsan);
		
		
		
		book.setStudents(students);
		booksRepository.save(book);
	   
	    
      StudentsEntity c1 = studentsRepository.getByID(1l);
      if(c1 != null) {
    	  System.out.println(" student get by Id "+ c1.toString());
      }
		 */
		

	}

}
