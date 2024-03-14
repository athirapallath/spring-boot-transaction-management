package com.athiralocal.dao;

import com.athiralocal.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}