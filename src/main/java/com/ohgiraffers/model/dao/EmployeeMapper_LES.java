package com.ohgiraffers.model.dao;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper_LES {

    List<EmployeeDTO> selectAllEmp();

    int insertEmpInfo(EmployeeDTO employeeDTO);
}
