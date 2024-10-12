package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_HSB;
import com.ohgiraffers.model.service.EmployeeService_JYS;

import java.util.List;

public class EmployeeController_JYS {

    private final PrintResult_JYS printResult;

    private final EmployeeService_JYS employeeService;

    public EmployeeController_JYS() {
        printResult = new PrintResult_JYS();
        employeeService = new EmployeeService_JYS();
    }


    public void selectAll() {
        List<EmployeeDTO> employeeList = employeeService.selectAllEmp();

        if (employeeList != null) {
            printResult.printMemberList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
}



