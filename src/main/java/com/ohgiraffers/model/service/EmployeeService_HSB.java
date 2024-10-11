package com.ohgiraffers.model.service;

import com.ohgiraffers.controller.EmployeeController_HSB;
import com.ohgiraffers.model.dao.EmployeeMapper_HSB;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService_HSB {

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_HSB employeeMapper = sqlSession.getMapper(EmployeeMapper_HSB.class);

        List<EmployeeDTO> employeeList = employeeMapper.selectAllEmployee();

        sqlSession.close();
        return employeeList;

    }
}
