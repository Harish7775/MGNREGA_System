package com.mgnrega.dao;

import java.util.List;

import com.mgnrega.bean.Employee;
import com.mgnrega.bean.Gpm;
import com.mgnrega.exception.EmployeeException;
import com.mgnrega.exception.GpmException;
import com.mgnrega.exception.ProjectException;

public interface GpmDao {

	public Gpm loginGPM(String username, String password) throws GpmException;

	public String registerEmployee(int eid, String ename, String emobile, String eaddress, int etotaldaywork,
			String ewages);

	public List<Employee> getAllEmp() throws EmployeeException;

	public String registerEmployeeToProject(int pid, int eid) throws ProjectException, EmployeeException;

	public List<Employee> getEmployeeByMobile(String emobile) throws ProjectException, EmployeeException;

}
