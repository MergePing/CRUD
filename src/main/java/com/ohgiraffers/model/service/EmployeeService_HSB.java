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

    public boolean insertMenu(EmployeeDTO employeeDTO) {

        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_HSB employeeMapper = sqlSession.getMapper(EmployeeMapper_HSB.class);

        int result = employeeMapper.insertEmployee(employeeDTO);

        if (result >0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyEmployee(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_HSB employeeMapper = sqlSession.getMapper(EmployeeMapper_HSB.class);
        int result = employeeMapper.updateEmployee(employeeDTO);

        if (result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean deleteEmployeeById(String id) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_HSB employeeMapper = sqlSession.getMapper(EmployeeMapper_HSB.class);

        int result = employeeMapper.deleteEmployee(id);
        if (result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }
}
