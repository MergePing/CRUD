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
            System.out.println("2. 직원 코드 조회");
            int noAnswer = sc.nextInt();

            switch (noAnswer) {
                case 1 : empControl.allEmployee(); break;
                case 2 : empControl.codeEmployee(inputCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택했습니다."); break;
            }
        } while (true);
    }

    private static Map<String, String> inputCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 직원의 코드를 입력하세요.");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }


}
