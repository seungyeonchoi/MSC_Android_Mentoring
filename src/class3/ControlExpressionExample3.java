package class3;

import java.util.Scanner;

public class ControlExpressionExample3 {
    /*
     * 3주차 - 제어문 구조 예제3
     * switch - case (입력한 월의 날수 구하기)
     * */
    public static void main(String[] args) {
        int month = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력해 주세요 : ");
        month = scan.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일 까지 입니다.");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("30일 까지 입니다.");
                break;
            default:
                System.out.println("28일 까지 입니다.");
                break;
        }
    }
}
