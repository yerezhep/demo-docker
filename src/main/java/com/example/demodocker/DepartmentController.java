package com.example.demodocker;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll() {
        List<Department>  departments = departmentService.showAll();
        return departments;
    }

    @PostMapping
    public String create(@RequestBody Department department) {
        departmentService.create(department);
        return "success";
    }
}
