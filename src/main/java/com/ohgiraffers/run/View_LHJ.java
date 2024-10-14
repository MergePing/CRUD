package com.ohgiraffers.run;

import com.ohgiraffers.controller.EmployeeController_LHJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View_LHJ {

        public void viewLHJ() {
            Scanner sc = new Scanner(System.in);

            EmployeeController_LHJ empControl = new EmployeeController_LHJ();

            do {
                System.out.println("========== 직원 데이터베이스 옵션 ==========");
                System.out.println("1. 직원 전체 조회");
                System.out.println("2. 직원 아이디 조회");
                System.out.println("3. 신규 직원 추가");
                System.out.println("4. 직원 정보 변경");
                System.out.println("5. 직원 정보 제거");
                System.out.println("0. 종료");
                System.out.print("사용할 메뉴의 번호를 입력해주세요 : ");
                int noAnswer = sc.nextInt();

                switch (noAnswer) {
                    case 1 : empControl.allEmployee(); break;
                    case 2 : empControl.idEmployee(inputCode()); break;
                    case 3 : empControl.insertEmployee(inputEmployee()); break;
                    case 4 : empControl.updateEmployee(inputId()); break;
                    case 5 : empControl.deleteEmployee(inputCode()); break;
                    case 0 : System.exit(0);
                    default:
                        System.out.println("잘못된 메뉴를 선택했습니다."); break;
                }
            } while (true);
        }

        private static Map<String, String> inputCode() {
            Scanner sc = new Scanner(System.in);
            System.out.print("직원의 아이디를 입력하세요 : ");
            String id = sc.nextLine();

            Map<String, String> parameter = new HashMap<>();
            parameter.put("id", id);

            return parameter;
        }

        private static Map<String, String> inputEmployee() {
            Scanner sc = new Scanner(System.in);
            System.out.print("추가할 직원의 아이디를 입력하세요 : ");
            String empId = sc.nextLine();
            System.out.print("추가할 직원의 이름을 입력하세요 : ");
            String empName = sc.nextLine();
            System.out.print("추가할 직원의 주민등록번호를 입력하세요 : ");
            String empNo = sc.nextLine();
            System.out.print("추가할 직원의 이메일을 입력하세요 : ");
            String email = sc.nextLine();
            System.out.print("추가할 직원의 휴대폰 번호를 입력하세요 :  ");
            String phone = sc.nextLine();

            Map<String, String> parameter = new HashMap<>();
            parameter.put("empId", empId);
            parameter.put("empName", empName);
            parameter.put("empNo", empNo);
            parameter.put("email", email);
            parameter.put("phone", phone);

            return parameter;
        }

        private static Map<String, String> inputId() {
            Scanner sc = new Scanner(System.in);
            System.out.print("수정할 직원의 아이디를 입력하세요 : ");
            String id = sc.nextLine();
            System.out.print("선택한 직원의 변경할 이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("선택한 직원의 변경할 주민등록번호를 입력하세요.");
            String no = sc.nextLine();
            System.out.print("선택한 직원의 변경할 이메일을 입력하세요 : ");
            String email = sc.nextLine();
            System.out.print("선택한 직원의 변경할 전화번호를 입력하세요 : ");
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
