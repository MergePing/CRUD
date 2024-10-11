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
        }
        System.out.println(errorMessage);
    }
}
