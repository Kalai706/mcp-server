package com.demo.mcpserver;


import jakarta.annotation.PostConstruct;
import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();


    @PostConstruct
    public void init(){
        employees.addAll(List.of(
                new Employee("Kalai","IT","kalai@gmail.com","111111111", "Thiruvottiyur", "20000"),
                new Employee("vani","Finance","vani@gmail.com","222222222", "CRP", "10000")
        ));
    }

    @McpTool(name="get-all-employee-details", description = "Get all employee details")
    public List<Employee> getEmployees(){
        return employees;
    }

    @McpTool(name="get-employee-by-name", description = "Get employee details by name")
    public Employee getEmployeeByName(String name){
        return employees.stream().filter(e->e.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
