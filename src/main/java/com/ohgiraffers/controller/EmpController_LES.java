package com.ohgiraffers.controller;

import com.ohgiraffers.model.service.EmployeeService_LES;
import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class EmpController_LES {

    private final PrintResult_LES printResultLes;

    private final EmployeeService_LES employeeServiceLes;

public EmpController_LES(){
    printResultLes = new PrintResult_LES();
    employeeServiceLes = new EmployeeService_LES();
}
    public void selectAllEmp() {
    EmployeeService_LES employeeServiceLES = new EmployeeService_LES();
        List<EmployeeDTO> empList = employeeServiceLES.selectAllEmp();

        if (empList != null){
            printResultLes.printEmpList(empList);
        }else {
            printResultLes.printerror("selectAllEmp");
        }
    }
}
