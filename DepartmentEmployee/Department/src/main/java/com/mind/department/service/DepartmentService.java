package com.mind.department.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mind.department.VO.RequestTemplate;
import com.mind.department.entity.Department;

@Service
public interface DepartmentService {
	Department add(Department dept);
	List<Department> list();
	Department update(long id,String name);
	Department searchById(long id);
	List<RequestTemplate> listWithEmp();
	RequestTemplate specificDeptEmployee(long dept_id);
}
