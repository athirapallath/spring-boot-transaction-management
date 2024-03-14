package com.athiralocal.service;

import com.athiralocal.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}