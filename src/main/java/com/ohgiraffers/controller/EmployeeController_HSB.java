package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_HSB;

import java.util.List;
import java.util.Map;

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


    public void insertEmployee(Map<String, String> parameter) {
        String id = parameter.get("id");
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(id);
        employeeDTO.setEmpName(name);
        employeeDTO.setEmpNo(no);
        employeeDTO.setEmail(email);
        employeeDTO.setPhone(phone);

        if(employeeService.insertMenu(employeeDTO)){
            printResult.printSuccessMessage("insert");
        }else{
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {
        String id = parameter.get("id");
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(id);
        employeeDTO.setEmpName(name);
        employeeDTO.setEmpNo(no);
        employeeDTO.setEmail(email);
        employeeDTO.setPhone(phone);

        if(employeeService.modifyEmployee(employeeDTO)){
            printResult.printSuccessMessage("modify");
        }else{
            printResult.printErrorMessage("modify");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {
        String id = parameter.get("id");

        if(employeeService.deleteEmployeeById(id)){
            printResult.printSuccessMessage("delete");
        }else{
            printResult.printErrorMessage("delete");
        }
    }
}
