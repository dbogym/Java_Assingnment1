// 단계 1 - 3
package io.dbogym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int id= 0;

        while ( status ){
            System.out.print("명령어> ");
            String s = sc.nextLine().trim();

            switch ( s ){
                case "종료":
                    System.out.println("프로그램이 종료됩니다.");
                    status = false;
                    break;

                case "작성":
                    System.out.println("게시글을 작성합니다.");

                    System.out.print("제목: ");
                    String title = sc.nextLine().trim();

                    System.out.print("내용: ");
                    String body = sc.nextLine().trim();

                    id++;
                    Post newPost = new Post(id, title, body);

                    System.out.println("newPost = " + newPost);
                    break;

                default:
                    System.out.println("존재하지 않는 명령어 입니다.");

            }
        }
    }
}