package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult_JYS {

    public void printMemberList(List<EmployeeDTO> memberList) {

        for (EmployeeDTO member : memberList) {
            System.out.println(member);
        }
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "멤버 목록 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신규 직원 등록에 실패하셨습니다."; break;
            case "modify" : errorMessage = "직원 삭제를 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 직원 등록에 성공하셨습니다."; break;
            case "modify" : successMessage = "직원 삭제를 성공했습니다."; break;
        }
        System.out.println(successMessage);
    }
}
