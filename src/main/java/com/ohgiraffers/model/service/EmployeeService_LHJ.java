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

    public boolean insertEmployee(EmployeeDTO empDTO) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper_LHJ empMapper = sqlSession.getMapper(EmployeeMapper_LHJ.class);

        int result = empMapper.insertEmployee(empDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean updateEmployee(EmployeeDTO empDTO) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper_LHJ empMapper = sqlSession.getMapper(EmployeeMapper_LHJ.class);

        int result = empMapper.updateEmployee(empDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteEmployee(String id) { // boolean 직원 삭제 정보 확인
        SqlSession sqlSession = getSqlSession(); // 연결 객체를 통한 데이터베이스와의 연결 관리

        EmployeeMapper_LHJ empMapper = sqlSession.getMapper(EmployeeMapper_LHJ.class); // 매퍼 인터페이스를 가져오고 xml 매퍼를 불러온다?

        int result = empMapper.deleteEmployee(id); // empMapper를 통해 deleteEmployee 메소드를 호출하고 id를 매개변수로 넘기며 삭제된 행의 수를 result 변수에 저장

        if(result > 0) { // 삭제된 행의 수가 0보다 크면 제거가 된 것이므로 commit
            sqlSession.commit();
        } else { // 그렇지 않으면 제거가 안됨이 명확하여 rollback
            sqlSession.rollback();
        }
        sqlSession.close(); // 사용했으니 데이터 누수 방지를 위해 연결해제

        return result > 0? true : false; // 사용 이유 : 리턴 타입이 boolean이므로 없으면 컴파일 에러가 뜸 / 성공 : true / 실패 : false
        // Controller 쪽과 연결을 확인하면 이해하기 쉬웠다.
    }
}
