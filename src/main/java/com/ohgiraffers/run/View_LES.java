package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmpController_LES;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View_LES {
    public static void View_LES() {

        Scanner sc = new Scanner(System.in);
        EmpController_LES menuControllerLES = new EmpController_LES();
        do{
            System.out.println();
            System.out.println("===== 사원 정보 관리 =====");
            System.out.println("1. 사원 정보 전체 조회");
            System.out.println("2. 사원 정보 추가");
            System.out.println("3. 사원 정보 수정");
            System.out.println("4. 사원 정보 삭제");
            System.out.print("메뉴 번호를 입력해 주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: menuControllerLES.selectAllEmp();break;
//                case 2: menuControllerLES.insertEmpInfo(inputInsertinfo()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
            }
        }while (true);

    }

    public static Map<String,String> inputInsertinfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("====== * 표시는 필수 입력사항 입니다 ======");
        System.out.print("* 추가할 사원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("* 추가할 사원의 주민등록번호를 입력하세요(ex - 111111-222222) : ");
        sc.nextLine();
        String num = sc.nextLine();
        System.out.print("추가할 사원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("추가할 사원의 이메일 주소를 입력하세요 : ");
        String email = sc.nextLine();

        Map<String,String> criteria = new HashMap<>();

        criteria.put("name",name);
        criteria.put("num",num);
        criteria.put("phone",phone);
        criteria.put("email",email);

        return criteria;
    }
}
