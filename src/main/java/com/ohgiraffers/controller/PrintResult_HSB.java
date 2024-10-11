package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult_HSB {

    public void printEmployeeList(List<EmployeeDTO> employeeList){
        for (EmployeeDTO employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "직원 목록 조회를 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }
}
