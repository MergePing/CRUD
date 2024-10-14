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
            case "selectEmp" : errorMessage = "직원의 아이디 조회에 실패했습니다."; break;
            case "addEmloyee" : errorMessage = "직원 정보 추가를 실패했습니다."; break;
            case "updateEmployee" : errorMessage = "직원 정보 변경에 성공했습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "addEmployee" : successMessage = "직원 정보 추가에 성공했습니다."; break;
            case "updateEmloyee" : successMessage = "직원 정보 변경에 성공했습니다."; break;
        }
        System.out.println(successMessage);
    }
}
