package com.ohgiraffers.controller;

import com.ohgiraffers.model.service.EmployeeService_LES;
import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;
import java.util.Map;

public class EmpController_LES {

    private final PrintResult_LES printResultLes;

    private final EmployeeService_LES employeeServiceLes;



public EmpController_LES(){
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

//    public void insertEmpInfo(Map<String, String> criteria) {
//    List<EmployeeDTO> empList = employeeServiceLes.insertEmpInfo(criteria);
//    String name = criteria.get("name");
//    String num = criteria.get("num");
//    String phone = criteria.get("phone");
//    String email = criteria.get("email");
//
//    EmployeeDTO employeeDTO = new EmployeeDTO();
//    employeeDTO.setEmpName(name);
//    employeeDTO.setEmpName(num);
//    employeeDTO.setEmpName(phone);
//    employeeDTO.setEmpName(email);
//
//        if (employeeServiceLes.insertEmpInfo(employeeDTO)){
//            printResultLes.printSuccessMessage("insertEmpInfo");
//        }else {
//            printResultLes.printerror("insertEmpInfo");
//        }
//
//    }
}
