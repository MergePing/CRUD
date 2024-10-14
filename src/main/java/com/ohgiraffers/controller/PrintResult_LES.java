package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult_LES {
    public void printEmpList(List<EmployeeDTO> empList) {
        for (EmployeeDTO emp : empList){
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("전체조회를 완료했습니다");
    }

    public void printerror(String error) {
        String errorMessage = "";
        switch (error){
            case "selectAllEmp" : errorMessage ="직원 전제 조회에 실패했습니다";break;
            case "insertEmpInfo" : errorMessage ="직원 정보 등록에 실패했습니다";break;
            case "changeEmpInfo" : errorMessage = "직원 정보 수정에 실패했습니다";break;
            case "deleteEmpInfo" : errorMessage = "직원 정보 삭제에 실패했습니다";break;
        }
        System.out.println();
        System.out.println(errorMessage);
    }


    public void printSuccessMessage(String successCode) {
        String successMessage ="";
        switch (successCode){
            case "insertEmpInfo" : successMessage = "직원 정보 추가에 성공했습니다";break;
            case "changeEmpInfo" : successMessage = "직원 정보 수정에 성공했습니다";break;
            case "deleteEmpInfo" : successMessage = "직원 정보 삭제에 성공했습니다";break;
        }
        System.out.println();
        System.out.println(successMessage);
    }
}
