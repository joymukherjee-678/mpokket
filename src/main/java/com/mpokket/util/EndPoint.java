package com.mpokket.util;
/**
 * 
 * @author author
 *
 */
public interface EndPoint {
	
	String CREATE_EMPLOYEE="/create";
	
	String GET_SINGLE_EMPLOYEE="/employee/{empid}";
	
	String DELETE_SINGLE_EMPLOYEE="/delete/{empid}";
}
