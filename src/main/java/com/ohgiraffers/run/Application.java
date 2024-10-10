package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_LHJ;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeController_LHJ empCon = new EmployeeController_LHJ();

        do {
            System.out.println("========== 이호준 : 마이바티스 기본 구현 실습 ==========");
            System.out.println("1. 전체 조회");
            int numAnswer = sc.nextInt();

            switch (numAnswer) {
                case 1 : empCon.allEmployee();
            }
        }while(true);
    }





}
