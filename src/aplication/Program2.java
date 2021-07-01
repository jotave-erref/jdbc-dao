package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department();

		Scanner sc = new Scanner(System.in);
		 /* 
		System.out.println("\n=== Test 1: department insert === ");
		Department dep = new Department(7, "Sport");
		departmentDao.insert(dep);
		System.out.println(dep);
		*/
		
		/*
		System.out.println("\n=== Test 2: department update === ");
		Department dep = new Department(3, "Skateboard");
		departmentDao.update(dep);
		System.out.println(dep);
		*/

		/*
		System.out.println("\n=== Test 3: department deleteById === ");
		System.out.print("Enter with Id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed! ");
		*/
		
		/*
		System.out.println("\n=== Test 4: department findById === ");
		dep = departmentDao.findById(2);
		System.out.println(dep);
		*/
		
		System.out.println("\n=== Test 5: department findAll === ");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department department : list) {
			System.out.println(department);
		}
		
		sc.close();
	}

}
