package com.ohgiraffers.model.service;


import com.ohgiraffers.model.dao.EmployeeMapper_JYS;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService_JYS {

    public List<EmployeeDTO> selectAllEmp() {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_JYS employeeMapper = sqlSession.getMapper(EmployeeMapper_JYS.class);

        List<EmployeeDTO> employeeList = employeeMapper.selectAllMember();

        sqlSession.close();
        return employeeList;
    }


    }
