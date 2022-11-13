package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.bean.Employee;
import com.mgnrega.dao.GpmDao;
import com.mgnrega.dao.GpmDaoImpl;

public class GetEmployeebyPhone {

public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employee Mobile NUmber");
		
		String cname= sc.next();

		
		GpmDao dao = new GpmDaoImpl();
		
		try {
		List<Employee> dtos= dao.getEmployeeByMobile(cname);
		
		dtos.forEach(dto -> System.out.println(dto));
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}
}
