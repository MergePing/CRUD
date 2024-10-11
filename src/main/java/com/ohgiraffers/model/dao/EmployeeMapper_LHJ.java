package com.ohgiraffers.model.dao;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper_LHJ {
    EmployeeDTO codeEmployee(int code);

    List<EmployeeDTO> allEmployee();
}
