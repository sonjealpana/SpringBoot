package com.example.springdemo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student get(Integer rollno)
	{
			return repo.findById(rollno).get();
	}
	public void save(Student s)
	{
		repo.save(s);		
	}
	public void delete(Integer rollno)
	{
		repo.deleteById(rollno);
	}
	public List<Student> listAll()
	{
		return repo.findAll();
	}
}
