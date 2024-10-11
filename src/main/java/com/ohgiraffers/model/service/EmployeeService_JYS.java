package com.ohgiraffers.model.service;

import com.ohgiraffers.model.dao.EmployeeMapper_JYS;
import com.ohgiraffers.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

public class EmployeeService_JYS {



    public EmployeeService_JYS() {

    }

//    public List<EmployeeDTO> getAllMembers() {
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper_JYS mapper = session.getMapper(EmployeeMapper_JYS.class);
//            return mapper.selectAllMember(); // EmployeeMapper_JYS에 정의된 selectAllMember() 메서드 호출
//        }
    }

//    public void updateMember(String empId, String newName, String newNo, String newMail, String newPhone) {
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper_JYS mapper = session.getMapper(EmployeeMapper_JYS.class);
//            mapper.updateMember(empId, newName, newNo, newMail, newPhone);
//            session.commit(); // 수동 커밋


