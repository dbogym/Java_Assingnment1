// 과제1 - 단계 1 - 1
package io.dbogym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("명령어 > ");
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}