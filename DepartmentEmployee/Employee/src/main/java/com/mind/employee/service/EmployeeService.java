package com.mind.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mind.employee.VO.ResponseTemplate;
import com.mind.employee.entity.Employee;

@Service
public interface EmployeeService {
	
	Employee add(Employee emp);
	List<Employee> list();
	Employee searchById(long id);
	ResponseTemplate empWithDept(long empId);
	Employee assignDepartment(long empId, long deptId);
	List<Employee> getByDeptId(long dept_id);
	List<Employee> getEmployeeByDepartmentWithDescAge(long dept_id);
}
