package com.ohgiraffers.run;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View_HSB vHSB = new View_HSB();
        View_JYS vJYS = new View_JYS();
        View_LES vLES = new View_LES();
        View_LHJ vLHJ = new View_LHJ();

        while (true) {
            System.out.println("확인할 수강생의 이름을 선택하세요.");
            System.out.println("1. 황순빈, 2. 조영석, 3. 이은서, 4. 이호준");
            int answer = sc.nextInt();
            switch (answer) {
                case 1 : vHSB.View_HSB(); break;
                case 2 : vJYS.View_JYS(); break;
                case 3 : vLES.View_LES(); break;
                case 4 : vLHJ.viewLHJ(); break;
                case 5 : System.exit(0); break;
            }
        }
    }
}
