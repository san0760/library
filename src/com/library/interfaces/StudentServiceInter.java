package com.library.interfaces;

import org.springframework.transaction.annotation.Transactional;

import com.library.basic.BasicServiceInter;
import com.library.domain.Borrowinfo;
import com.library.domain.Student;

public interface StudentServiceInter extends BasicServiceInter
{
	public Student checkStudent(Student student);
	public int getConBook(int opid);
	public void editPassword(int studentId,String password);
	public void editEmail(int studentId,String email);
}
