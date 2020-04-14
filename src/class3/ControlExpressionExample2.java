package class3;

public class ControlExpressionExample2 {
     /*
     * 3주차 - 제어문 구조 예제2
     * do - while문(2단 ~ 9단까지 구구단 구하기)
     * */
    public static void main(String[] args) {
        int i=2;
        do {
            int j = 1; // 곱하기 초기값 설정
            do {
                System.out.print(i+"*"+j+"="+i*j+"\t");
                j++; // j 증감식
            } while (j<=9); // j 조건식
            i++; // i 증감식
            System.out.println();
        } while (i<=9); // i 조건식
    }
}
