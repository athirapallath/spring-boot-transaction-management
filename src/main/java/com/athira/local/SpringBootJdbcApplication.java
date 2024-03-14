package com.athira.local;

import com.athira.local.model.EmployeeHealthInsurance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.athira.local.model.Employee;
import com.athira.local.service.OrganizationService;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		Employee emp2 = new Employee();
		emp.setEmpId("emp2");
		emp.setEmpName("emp2");

		EmployeeHealthInsurance employeeHealthInsurance2 = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp2");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(40000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);

	}
}