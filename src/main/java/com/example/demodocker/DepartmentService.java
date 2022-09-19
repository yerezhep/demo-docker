package com.example.demodocker;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public void create(Department department) {
        departmentRepository.save(department);
    }

    public List<Department> showAll() {
        List<Department> department = departmentRepository.findAll();
        return department;
    }
}
