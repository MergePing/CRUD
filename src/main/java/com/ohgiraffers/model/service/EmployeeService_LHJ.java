package com.ohgiraffers.model.service;

import com.ohgiraffers.model.dao.EmployeeMapper_LHJ;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService_LHJ {
    public List<EmployeeDTO> allEmployee() {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper_LHJ empMapper = sqlSession.getMapper(EmployeeMapper_LHJ.class); // class가 붙으면 원래는 인터페이스를 지칭하다가 resource에 있는 mapper를 지칭하는 것과 동일해진다.

        List<EmployeeDTO> empList = empMapper.allEmployee();

        sqlSession.close();

        return empList;
    }

    public EmployeeDTO idEmployee(int id) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper_LHJ empMapper = sqlSession.getMapper(EmployeeMapper_LHJ.class);

        EmployeeDTO emp = empMapper.idEmployee(id);

        sqlSession.close();

        return emp;
    }
}
