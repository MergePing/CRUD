package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_LHJ;

import java.util.List;
import java.util.Map;

public class EmployeeController {


    private final PrintResult_LHJ printResult;
    private final EmployeeService_LHJ empService;

    public EmployeeController() {
        printResult = new PrintResult_LHJ();
        empService = new EmployeeService_LHJ();
    }


    public void allEmployee() {
        List<EmployeeDTO> empList = empService.allEmployee();

        if(empList != null) {
            printResult.printEmployeeList(empList);
        } else {
            printResult.printErrorMessage("allEmp");
        }
    }

    public void codeEmployee(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));

        EmployeeDTO emp = empService.codeEmployee(code);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectEmp");
        }
    }
}
