package com.ohgiraffers.model.dao;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper_HSB {
    List<EmployeeDTO> selectAllEmployee();

    int insertEmployee(EmployeeDTO employeeDTO);

    int updateEmployee(EmployeeDTO employeeDTO);

    int deleteEmployee(String id);
}
