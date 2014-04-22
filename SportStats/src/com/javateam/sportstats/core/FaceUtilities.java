package com.javateam.sportstats.core;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;


public class FaceUtilities {
	public static HttpServletRequest getRequest(){
		return (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
	public static long getRequestId(String idName){
		String string=getRequest().getParameter(idName);
		if(string==null || string.equals("")){
			return 0L;
		}
		return Long.parseLong(string);
	}
}
