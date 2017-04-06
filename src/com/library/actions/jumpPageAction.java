package com.library.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.transaction.annotation.Transactional;

import com.library.domain.Borrowinfo;
import com.library.domain.Student;
import com.library.interfaces.StudentServiceInter;
public class jumpPageAction extends DispatchAction {
	
	private StudentServiceInter ss;
	public void setSs(StudentServiceInter ss)
	{
		this.ss = ss;
	}

	public ActionForward goToBookBorrowed(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		String hql="from Borrowinfo where student=? and isReturn=1";
		Student s=(Student) arg2.getSession().getAttribute("student");
		Object [] parameters={s};
		List<Borrowinfo> l=ss.excuteQuery(hql, parameters);
		arg2.setAttribute("borrowinfo", l);
		return arg0.findForward("go");
	}

	public ActionForward goUser(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		// TODO Auto-generated method stub
		return arg0.findForward("goUser");
	}
}
