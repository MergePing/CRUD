package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_JYS;
import com.ohgiraffers.common.Template; // SqlSessionFactory를 제공하는 클래스
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        SqlSessionFactory sqlSessionFactory = Template.getSqlSessionFactory();

        // EmployeeController_JYS 인스턴스 생성
        EmployeeController_JYS employeeController = new EmployeeController_JYS(sqlSessionFactory);

        do {
            System.out.println("======= 직원 관리 ======== ");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 추가");
            System.out.println("3. 직원 수정");
            System.out.println("4. 직원 삭제");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    employeeController.selectAllMembers();
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }

        } while (true);
    }
}