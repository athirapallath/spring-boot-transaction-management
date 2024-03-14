package com.athira.local.service;

import com.athira.local.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}