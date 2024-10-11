package com.ohgiraffers.model.service;

import com.ohgiraffers.model.dao.EmployeeMapper_LES;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService_LES {

    public List<EmployeeDTO> selectAllEmp() {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper_LES employeeMapperLes =sqlSession.getMapper(EmployeeMapper_LES.class);

        List<EmployeeDTO> empList = employeeMapperLes.selectAllEmp();

        sqlSession.close();

        return empList;
    }

    public boolean insertEmpInfo(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper_LES employeeMapperLes = sqlSession.getMapper(EmployeeMapper_LES.class);

        int result = employeeMapperLes.insertEmpInfo(employeeDTO);
        if (result>0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true:false;
    }
}
