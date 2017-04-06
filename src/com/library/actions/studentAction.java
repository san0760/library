package com.library.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.library.domain.Student;
import com.library.forms.EditForm;
import com.library.interfaces.StudentServiceInter;

public class studentAction extends DispatchAction
{
	private StudentServiceInter ss;
	public void setSs(StudentServiceInter ss)
	{
		this.ss = ss;
	}
	public ActionForward editInfo(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		EditForm ef=(EditForm)arg1;
		Student s=(Student)arg2.getSession().getAttribute("student");
		int studentId=s.getStudentId();
		System.out.println("ps"+ef.getPsw2());
		System.out.println("em"+ef.getEmail());
		if(ef.getPsw2()==""&ef.getEmail()!=""){
			ss.editEmail(studentId, ef.getEmail());
			return arg0.findForward("ok");
		}else if(ef.getEmail()==""&ef.getPsw2()!=""){
			ss.editPassword(studentId, ef.getPsw2());
			return arg0.findForward("ok");
		}else if(ef.getEmail()!=""&ef.getPsw2()!=""){
			ss.editEmail(studentId, ef.getEmail());
			ss.editPassword(studentId, ef.getPsw2());
			return arg0.findForward("ok");
		}else{
			return arg0.findForward("err");
		}
	}
}
