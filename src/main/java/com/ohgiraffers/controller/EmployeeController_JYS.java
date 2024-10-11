package com.ohgiraffers.controller;



import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Scanner;

public class EmployeeController_JYS {

    private final com.ohgiraffers.model.service.EmployeeService_JYS employeeService;

    public EmployeeController_JYS(SqlSessionFactory sqlSessionFactory) {
        this.employeeService = new com.ohgiraffers.model.service.EmployeeService_JYS(sqlSessionFactory);
    }

    public void selectAllMembers() {
        List<EmployeeDTO> members = employeeService.getAllMembers();
        members.forEach(member -> {
            System.out.println("ID: " + member.getEmpId());
            System.out.println("Name: " + member.getEmpName());
            System.out.println("Number: " + member.getEmpNo());
            System.out.println("Email: " + member.getEmail());
            System.out.println("Phone: " + member.getPhone());
            System.out.println("-----------------------------");
        });
    }

//    public void updateMember() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수정할 직원의 ID를 입력하세요 : ");
//        String empId = sc.nextLine();
//
//
//        System.out.print("수정할 이름을 입력하세요 : ");
//        String newName = sc.nextLine();
//
//        System.out.print("수정할 주민번호를 입력하세요 : ");
//        String newNo = sc.nextLine();
//
//        System.out.print("수정할 이메일을 입력하세요 : ");
//        String newMail = sc.nextLine();
//
//        System.out.print("수정할 전화번호를 입력하세요 : ");
//        String newPhone = sc.nextLine();

   // Map에

    }
