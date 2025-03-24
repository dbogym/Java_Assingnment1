// 단계 1 - 3 (게시글 삭제)
package io.dbogym;

import io.dbogym.data.Post;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int id= 0;
        Post newPost = null;

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
                    newPost = new Post(id, title, body);

                    break;

                case "조회":
                    System.out.println("마지막 게시을 조회합니다.");
                    System.out.println("제목: " + newPost.getTitle());
                    System.out.println("내용: " + newPost.getBody());

                    break;

                case "삭제":
                    newPost = null;
                    System.out.println("마지막 게시글이 삭제되었습니다.");

                    break;

                default:
                    System.out.println("존재하지 않는 명령어 입니다.");

            }
        }
    }
}