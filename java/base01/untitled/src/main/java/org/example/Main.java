package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        int id = 1;
        while (true){
            System.out.printf("명령을 입력하세요) ");
            String se = sc.nextLine();
            if (se.equals("종료")){
                break;
            } else if (se.equals("등록")) {
                명언 ment = new 명언();
                System.out.printf("명언 : ");
                String coments = sc.nextLine();
                ment.set명언(coments);

                System.out.printf("작가 : ");
                String author = sc.nextLine();
                ment.set작가(author);
                System.out.println(id + "번 명언이 등록되었습니다.");
                id++;
            }


        }
    }
}

class 명언{
    int id;
    private String 명언;
    private String 작가;

    public String get명언() {
        return 명언;
    }

    public void set명언(String 명언) {
        this.명언 = 명언;
    }

    public String get작가() {
        return 작가;
    }

    public void set작가(String 작가) {
        this.작가 = 작가;
    }
}