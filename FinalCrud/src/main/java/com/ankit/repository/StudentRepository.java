package com.ankit.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankit.bean.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> 
{
	
}
	
	
	



