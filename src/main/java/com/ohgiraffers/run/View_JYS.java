package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_JYS;

import java.util.HashMap;
import java.util.Map;
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

            switch (no) {
                case 1:
                    jys.selectAll();
                    break;
                case 2:
                    jys.addEmp(insertEmp());
                    break;
                case 3:
                    jys.modifyEmp(updateEmp());
            }

        } while (true);

    }


    public static Map<String, String> insertEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.print("새로운 직원의 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("새로운 직원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("새로운 직원의 주민번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("새로운 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("새로운 직원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);

        return parameter;
    }

    private static Map<String, String> updateEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 직원 코드를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 직원 주민번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("수정할 직원 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("수정할 직원 핸드폰번호를 입력하세요 : ");
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