package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_HSB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View_HSB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeController_HSB hsb = new EmployeeController_HSB();

        do {
            System.out.println("========= 직원 관리 ========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 신규 직원 추가");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int no  = sc.nextInt();

            switch (no) {
                case 1 : hsb.selectAllEmployee(); break;
                case 2 : hsb.insertEmployee(inputEmployee()); break;
                default :
                    System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }
        }while (true);
    }

    private static Map<String, String> inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("직원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("직원의 주민번호를 입력하세요 :");
        String no = sc.nextLine();
        System.out.print("직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("직원의 핸드폰번호를 입력하세요 : ");
        String phone = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);

        return parameter;

    }
}
