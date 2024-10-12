package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_JYS;

import java.util.Scanner;

public class View_JYS {

    public static void View_JYS() {

        Scanner sc = new Scanner(System.in);
        EmployeeController_JYS jys = new EmployeeController_JYS();


        do {
            System.out.println();
            System.out.println("======= 사원 정보 관리 =======");
            System.out.println("1. 사원 정보 전체 조회");
            System.out.println("2. 사원 정보 추가");
            System.out.println("3. 사원 정보 수정");
            System.out.println("4. 사원 정보 삭제");
            System.out.print("메뉴 번호를 입력해 주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : jys.selectAll(); break;
            }

        } while (true);

    }
}