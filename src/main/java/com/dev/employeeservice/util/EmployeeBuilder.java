package com.dev.employeeservice.util;

import com.dev.employeeservice.dto.EmployeeDTO;
import com.dev.employeeservice.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {
    public static List<EmployeeDTO> getListDTO() {
        return Arrays.asList(new EmployeeDTO(1, "Jasmine", "DEV", 100000),
                             new EmployeeDTO(2, "Jasmine2", "DEV", 200000));
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(1, "Jasmine", "DEV", 100000),
                new Employee(2, "Jasmine2", "DEV", 200000));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(1, "Jasmine", "DEV", 100000);
    }

    public static Employee getEntity() {
        return new Employee(1, "Jasmine", "DEV", 100000);
    }
}
