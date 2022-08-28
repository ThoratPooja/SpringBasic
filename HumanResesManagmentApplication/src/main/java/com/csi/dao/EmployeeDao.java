package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public  void signUp(Employee employee);

    public  void  saveBulkOfData(List<Employee> employees);

    public  boolean singIn(String empEmailId,String empPassword);

    public  Employee getDataById(int empId);

    public  List<Employee> getAllData();

    public  List<Employee> getDataByName(String empName);

    public  Employee getDataByContactNumber(long empContactNumber);

    public  Employee getDataByEmailId(String empEmailId);

    public  List<Employee> filterDataBySalary(double empSalary);

    public  List<Employee> sortByName();

}
