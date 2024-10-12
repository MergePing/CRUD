package com.ohgiraffers.controller;

import com.ohgiraffers.model.service.EmployeeService_LES;
import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;
import java.util.Map;

public class EmployeeController_LES {

    private final PrintResult_LES printResultLes;

    private final EmployeeService_LES employeeServiceLes;



public EmployeeController_LES(){
    printResultLes = new PrintResult_LES();
    employeeServiceLes = new EmployeeService_LES();
}
    public void selectAllEmp() {
        List<EmployeeDTO> empList = employeeServiceLes.selectAllEmp();

        if (empList != null){
            printResultLes.printEmpList(empList);
        }else {
            printResultLes.printerror("selectAllEmp");
        }
    }

    public void insertEmpInfo(Map<String, String> criteria) {

    String id = criteria.get("id");
    String name = criteria.get("name");
    String num = criteria.get("num");
    String phone = criteria.get("phone");
    String email = criteria.get("email");

    EmployeeDTO employeeDTO = new EmployeeDTO();
    employeeDTO.setEmpId(id);
    employeeDTO.setEmpName(name);
    employeeDTO.setEmpNo(num);
    employeeDTO.setPhone(phone);
    employeeDTO.setEmail(email);

        if (employeeServiceLes.insertEmpInfo(employeeDTO)){
            printResultLes.printSuccessMessage("insertEmpInfo");
        }else {
            printResultLes.printerror("insertEmpInfo");
        }

    }


    public void changeEmpInfo(Map<String, Object> criteria) {
        if (employeeServiceLes.changeEmpInfo(criteria)){
            printResultLes.printSuccessMessage("changeEmpInfo");
        }else {
            printResultLes.printerror("changeEmpInfo");
        }

    }
}
