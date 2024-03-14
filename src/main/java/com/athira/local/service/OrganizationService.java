package com.athira.local.service;

import com.athira.local.model.EmployeeHealthInsurance;
import com.athira.local.model.Employee;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
