package application;

import model.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 2: department insert =====");
        Department newDepartment = new Department(null, "Support");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 3: department update =====");
        department = departmentDao.findById(7);
        department.setDepartmentName("Music");
        departmentDao.update(department);
        System.out.println("Update Completed!");

        System.out.println("\n=== TEST 4: department delete =====");
        System.out.println("Enter id for delete test: ");
        int id = scan.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Successfully Deleted! ");

    }
}
