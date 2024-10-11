package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_HSB;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeController_HSB hsb = new EmployeeController_HSB();

        do {
            System.out.println("========= 직원 관리 ========");
            System.out.println("1. 직원 전체 조회");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int no  = sc.nextInt();

            switch (no) {
                case 1 : hsb.selectAllEmployee(); break;
                default :
                    System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }
        }while (true);
    }
}
