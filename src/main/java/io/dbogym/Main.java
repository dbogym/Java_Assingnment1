// 단계 1 - 2.a
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
            System.out.println(s);
        }
    }
}