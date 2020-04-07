package class3;

public class VariableExample2 {
    /*
    * 3주차 - 변수와 상수 예제2
    * 계산기
    * */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //덧셈
        int sum = num1+num2;
        System.out.println("sum: "+sum);
        //뺄셈
        int sub= num2-num1;
        System.out.println("sub: "+sub);
        //곱셈
        int mul = num1*num2;
        System.out.println("mul: "+mul);
        //나눗셈의 몫
        int div = num2/num1;
        System.out.println("div: "+div);
        //나눗셈의 나머지
        int mod = num2 % num1;
        System.out.println("mod: "+mod);

    }
}
