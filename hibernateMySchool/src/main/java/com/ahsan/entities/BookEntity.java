package com.ahsan.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "books")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="bname")
	private String name;
	
	@Column(name ="writerName")
	private String writerName;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "students_books", joinColumns = @JoinColumn(name ="book_id"),
	inverseJoinColumns  = @JoinColumn(name = "student_id"))
	private List<StudentsEntity> students;
//	private StudentsEntity st;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public List<StudentsEntity> getStudents() {
		return students;
	}

	public void setStudents(List<StudentsEntity> students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", writerName=" + writerName + ", students=" + students
				+ "]";
	}
	
	
	
}
