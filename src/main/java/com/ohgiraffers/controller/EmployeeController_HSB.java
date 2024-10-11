package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_HSB;

import java.util.List;

public class EmployeeController_HSB {

    private final PrintResult_HSB printResult;

    private final EmployeeService_HSB employeeService;

    public EmployeeController_HSB() {
        printResult = new PrintResult_HSB();
        employeeService = new EmployeeService_HSB();
    }

    public void selectAllEmployee() {
        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null ) {
            printResult.printEmployeeList(employeeList);
        }else{
            printResult.printErrorMessage("selectList");
        }
    }
}
