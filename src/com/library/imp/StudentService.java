package com.library.imp;

import java.util.List;

import com.library.basic.BasicService;
import com.library.domain.Student;
import com.library.interfaces.StudentServiceInter;

public class StudentService extends BasicService implements StudentServiceInter
{

	@Override
	public Student checkStudent(Student student)
	{
		// TODO Auto-generated method stub
		String hql="from Student where studentId=? and password=? ";
		Object [] parameters={student.getStudentId(),student.getPassword()};
		List<Student> l=excuteQuery(hql, parameters);
		if(l.size()==1){
			return l.get(0);
		}else{
			return null;
		}
	}

}
