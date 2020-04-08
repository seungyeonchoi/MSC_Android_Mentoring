package class3;

public class ConditionalExpressionsExample1 {
    /*
    * 3주차 - 조건 연산자 예제1
    * 삼항연산자
    * */
    public static void main(String[] args) {
        int num1,num2;
        num1=5;
        num2=10;
        String str = (num1>num2) ? "num1>num2 는 참입니다." : "num1<num2는 거짓입니다.";
        System.out.println(str);
    }
}
