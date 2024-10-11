package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult_LES {
    public void printEmpList(List<EmployeeDTO> empList) {
        for (EmployeeDTO emp : empList){
            System.out.println(emp);
        }
    }

    public void printerror(String error) {
        String errorMessage = "";
        switch (error){
            case "selectAllEmp" : errorMessage ="전제 조회에 실패했습니다";
        }
    }
}
