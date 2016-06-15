package com.uacity.admin.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1383011893689968879L;

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)arg0;     
        HttpServletResponse response  =(HttpServletResponse) arg1; 
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();  
        if(session.getAttribute("username") == null){
//        	System.out.println(request.getRequestURI());
        	String uri = request.getRequestURI();	
        	String ctxPath = request.getContextPath();
        	String signinPath = ctxPath + "/signin.jsp";
        	String loginPath = ctxPath + "/login/login.do";
        	if(uri.startsWith(signinPath) || uri.startsWith(loginPath)){
        		arg2.doFilter(arg0, arg1); 
        		return;
        	}
        	response.sendRedirect(request.getContextPath() + "/signin.jsp");
        	return;
//        	String usercode = (String) request.getRemoteUser();
//            String url=request.getRequestURI();
//            if(usercode==null || "".equals(usercode)) {        
//                 if(url!=null && !url.equals("") && ( url.indexOf("signin")<0 && url.indexOf("login")<0 )) {     
//                     response.sendRedirect(request.getContextPath() + "/signin.jsp?backurl=" + url);     
//                     return ;     
//                 }                
//             }     
        }else{
        	//TODO login logic
        	if("true".equals(session.getAttribute("login"))){
        		
        	}else{
        		response.sendRedirect(request.getContextPath() + "/signin.jsp");
            	return;
        	}
        }
        arg2.doFilter(arg0, arg1);     
        return;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
