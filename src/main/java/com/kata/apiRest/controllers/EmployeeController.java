package com.kata.apiRest.controllers;

import com.kata.apiRest.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public String getEmployee(){
        return "Return the employee details";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String addEmployee(@RequestBody Employee employee){
        return "Create a new employee";
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public String updateEmployee(@RequestBody Employee employee){
        return "Update employee details";
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@RequestBody Employee employee){
        return "Delete an employee";
    }

    @PatchMapping()
    @ResponseStatus(HttpStatus.OK)
    public String patchEmployee(@RequestBody Employee employee){
        return "Update a specific detail of an employee";
    }
}
