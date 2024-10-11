package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_LHJ;

import java.util.List;
import java.util.Map;

public class EmployeeController_LHJ {


    private final PrintResult_LHJ printResult;
    private final EmployeeService_LHJ empService;

    public EmployeeController_LHJ() {
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

    public void idEmployee(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO emp = empService.idEmployee(id);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectEmp");
        }
    }

    public void insertEmployee(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName =parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO empDTO = new EmployeeDTO();
        empDTO.setEmpId(empId);
        empDTO.setEmpName(empName);
        empDTO.setEmpNo(empNo);
        empDTO.setEmail(email);
        empDTO.setPhone(phone);

        if(empService.insertEmployee(empDTO)) {
            printResult.printSuccessMessage("addEmployee");
        } else {
            printResult.printErrorMessage("addEmployee");
        }


    }
}
