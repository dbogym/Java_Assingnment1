// 단계 1 - 2.b
package io.dbogym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true ){
            System.out.print("명령어 > ");
            String s = sc.nextLine().trim();
            if(s.equals("종료") || s.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            System.out.println("존재하지 않는 명령어 입니다.");
        }
    }
}