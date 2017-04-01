package com.library.interfaces;

import com.library.basic.BasicServiceInter;
import com.library.domain.Student;


public interface StudentServiceInter extends BasicServiceInter
{
	public Student checkStudent(Student student);
}
