package com.example.movieplexproject.dao;

import com.example.movieplexproject.pojo.Employee;

import java.util.ArrayList;

public interface EmployeeDAO {
    public ArrayList<Employee> getAllEmployees();
    public Employee getEmployee(int id);
}
