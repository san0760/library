package com.library.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.transaction.annotation.Transactional;

import com.library.domain.Student;
import com.library.forms.LoginForm;
import com.library.interfaces.StudentServiceInter;
public class loginAction extends DispatchAction
{
	private StudentServiceInter ss;
	public void setSs(StudentServiceInter ss)
	{
		this.ss = ss;
	}
	public ActionForward login(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		LoginForm loginForm=(LoginForm)arg1;
		Student s=new Student();
		s.setStudentId(loginForm.getId());
		s.setPassword(loginForm.getPassword());
		s=ss.checkStudent(s);
		if(s!=null){
			arg2.getSession().setAttribute("student",ss.findById(Student.class, s.getStudentId()));
			return arg0.findForward("ok");
		}else{
			return arg0.findForward("err");
		}
	}
	
	public ActionForward logout(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		arg2.getSession().invalidate();
		return arg0.findForward("err");
	}
}
