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

    public void updateEmployee(Map<String, String> parameter) {
        String id = parameter.get("id"); // 실수로 이걸 안넣으면 변경됐다고 떠도 id로는 인식되지 않아 변경이 아무것도 되지 않으니 주의
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO empDTO = new EmployeeDTO();
        empDTO.setEmpId(id); // 마찬가지
        empDTO.setEmpName(name);
        empDTO.setEmpNo(no);
        empDTO.setEmail(email);
        empDTO.setPhone(phone);

        if(empService.updateEmployee(empDTO)) {
            printResult.printSuccessMessage("updateEmployee");
        } else {
            printResult.printErrorMessage("updateEmployee");
        }
    }
}
