package com.library.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.transaction.annotation.Transactional;

import com.library.interfaces.StudentServiceInter;
public class bookAction extends DispatchAction {

	private StudentServiceInter ss;
	public void setSs(StudentServiceInter ss)
	{
		this.ss = ss;
	}

	public ActionForward conBook(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		int conNum=ss.getConBook(Integer.parseInt(arg2.getParameter("opId")));
		if(conNum==0){
			String hql="update Borrowinfo set conNum=? where opId=?";
			Object []parameters={1,Integer.parseInt(arg2.getParameter("opId"))};
			ss.excuteUpdate(hql, parameters);
			return arg0.findForward("ok");
		}else{
			return arg0.findForward("err");
		}
	}
}
