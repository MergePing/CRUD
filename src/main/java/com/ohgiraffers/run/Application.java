package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeController empControl = new EmployeeController();

        do {
            System.out.println("========== 직원 데이터베이스 옵션 ==========");
            System.out.println("1. 직원 전체 조회");
            int noAnswer = sc.nextInt();

            switch (noAnswer) {
                case 1 : empControl.allEmployee(); break;
                default:
                    System.out.println("잘못된 메뉴를 선택했습니다."); break;
            }
        } while (true);
    }
}
