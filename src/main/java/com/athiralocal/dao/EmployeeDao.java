package com.athiralocal.dao;

import com.athiralocal.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);

	void deleteEmployeeById(String empid);
}