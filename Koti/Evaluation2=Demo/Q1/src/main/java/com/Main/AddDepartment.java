package com.Main;

import java.util.Scanner;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Model.Department;

public class AddDepartment {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Department Details");
	EmpDao dao=new EmpDaoImpl();
	
	Department dep=new Department();
	System.out.println("Enter Dept Name: ");
	dep.setDeptName(sc.next());
	System.out.println("Enter Dept Location: ");
	dep.setLocation(sc.next());
	
	dao.addDepartment(dep);
}
}
