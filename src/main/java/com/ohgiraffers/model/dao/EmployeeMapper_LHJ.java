package com.ohgiraffers.model.dao;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper_LHJ {
    EmployeeDTO idEmployee(int id);

    List<EmployeeDTO> allEmployee();

    int insertEmployee(EmployeeDTO empDTO);
}
