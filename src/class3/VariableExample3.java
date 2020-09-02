package class3;

public class VariableExample3 {
    /*
     * 3주차 - 변수와 상수 예제3
     * 상수를 이용한 계산기
     * */
    public static void main(String[] args) {
        final int num = 10; //final은 상수를  나타냅니다. final로 정의된 변수는 값이 변경될 수 없습니다.
        //num=20; //상수 num에 값을 대입하려하면 오류가 나타납니다.
        //덧셈
        int sum = num+5;
        System.out.println("sum: "+sum);
        //뺄셈
        int sub= num-5;
        System.out.println("sub: "+sub);
        //곱셈
        int mul = num*5;
        System.out.println("mul: "+mul);
        //나눗셈의 몫
        int div = num/5;
        System.out.println("div: "+div);
        //나눗셈의 나머지
        int mod = num % 2;
        System.out.println("mod: "+mod);
    }
}
