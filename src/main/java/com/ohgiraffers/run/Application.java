package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmpController_LES;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpController_LES menuControllerLES = new EmpController_LES();
        do{
            System.out.println("===== 사원 정보 관리 =====");
            System.out.println("1. 사원 정보 전체 조회");
            System.out.print("메뉴 번호를 입력해 주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: menuControllerLES.selectAllEmp();break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
            }
        }while (true);
    }
}
