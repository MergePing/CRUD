package com.ohgiraffers.controller;



import com.ohgiraffers.model.dto.EmployeeDTO;
import com.ohgiraffers.model.service.EmployeeService;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class EmployeeController_JYS {

    private final EmployeeService employeeService;

    public EmployeeController_JYS(SqlSessionFactory sqlSessionFactory) {
        this.employeeService = new EmployeeService(sqlSessionFactory);
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
}