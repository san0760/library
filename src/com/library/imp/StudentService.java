package com.library.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.library.basic.BasicService;
import com.library.domain.Borrowinfo;
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

	@Override
	public int getConBook(int opId)
	{
		// TODO Auto-generated method stub
		String hql="select conNum from Borrowinfo where opId=?";
		Object []parameters={opId};
		return (Integer) uniqueQuery(hql, parameters);
	}
	public void editPassword(int studentId,String password){
		String hql="update Student set password=? where studentId=?";
		Object []parameters={password,studentId};
		excuteUpdate(hql, parameters);
	}
	public void editEmail(int studentId,String email){
		String hql="update Student set email=? where studentId=?";
		Object []parameters={email,studentId};
		excuteUpdate(hql, parameters);
	}
	
}
