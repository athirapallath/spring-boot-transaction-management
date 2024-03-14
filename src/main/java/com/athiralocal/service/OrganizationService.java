package com.athiralocal.service;

import com.athiralocal.model.Employee;
import com.athiralocal.model.EmployeeHealthInsurance;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
