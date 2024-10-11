package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeController empControl = new EmployeeController();

        do {
            System.out.println("========== 직원 데이터베이스 옵션 ==========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 아이디 조회");
            System.out.println("3. 신규 직원 추가");
            System.out.print("사용할 메뉴의 번호를 입력해주세요 : ");
            int noAnswer = sc.nextInt();

            switch (noAnswer) {
                case 1 : empControl.allEmployee(); break;
                case 2 : empControl.idEmployee(inputCode()); break;
                case 3 : empControl.importEmployee(inputEmployee()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택했습니다."); break;
            }
        } while (true);
    }

    private static Map<String, String> inputCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 직원의 아이디를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("추가할 직원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("추가할 직원의 주민등록번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("추가할 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("추가할 직원의 휴대폰 번호를 입력하세요 :  ");
        String phone = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);

        return parameter;
    }


}
