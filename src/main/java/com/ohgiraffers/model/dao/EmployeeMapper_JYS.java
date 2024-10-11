package com.ohgiraffers.model.dao;


import com.ohgiraffers.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper_JYS {

    List<EmployeeDTO> selectAllMember();

    void updateMember(String empId, String newName, String newNo, String newMail, String newPhone);
}
