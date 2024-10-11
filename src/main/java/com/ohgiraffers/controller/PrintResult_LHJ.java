package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult_LHJ {
    public void printEmployeeList(List<EmployeeDTO> empList) {

        for(EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }

    public void printEmployee(EmployeeDTO emp) {
        System.out.println(emp);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "allEmp" : errorMessage = "전체 직원 조회에 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }

}
