package com.bbs.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor {

	//�����������Ҫ������Դ�ͷ�
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
    //����������ɺ���ʾҳ��ǰ
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	//��������ǰ
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		
		     HttpSession session = request.getSession();
		   /* if (session.getAttribute("user") == null) {
		    	  request.getRequestDispatcher("/WEB-INF/houtai/page/login.jsp").forward(request, response);  
		    	return false;
		    } else {
		        return true;
		    }*/
		     return true;
	}

}
