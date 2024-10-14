package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService_HSB;
import com.ohgiraffers.model.service.EmployeeService_JYS;

import java.util.List;
import java.util.Map;

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

    public void addEmp(Map<String, String> parameter) {
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

        if (employeeService.insertMenu(employeeDTO)){
            printResult.printSuccessMessage("insert");
        }else{
            printResult.printErrorMessage("insert");

        }
    }

    public void modifyEmp(Map<String, String> parameter) {
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
}



