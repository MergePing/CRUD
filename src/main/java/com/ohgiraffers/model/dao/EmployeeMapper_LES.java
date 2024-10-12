package com.ohgiraffers.model.dao;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper_LES {

    List<EmployeeDTO> selectAllEmp();

    int insertEmpInfo(EmployeeDTO employeeDTO);

    int changeEmpInfo(EmployeeDTO employeeDTO);

    int deleteEmpInfo(String id);
}
