package class3;

public class ConditionalExpressionsExample4 {
    /*
     * 3주차 - 조건 연산자 예제4
     * 조건 연산자를 이용한 연령층 구하기(if, else if, else 문)
     * */
    public static void main(String[] args) {
        int age = 25;
        if(age>=20 && age<30){ // a&&b : a와 b가 둘 다 충족되어야 조건문이 참이 됨, a||b : a 또는 b 둘 중 하나만 참이어도 조건문이 참이 됨
            System.out.println("20대");
        }else if(age<20){
            System.out.println("10대 이하");
        }else{
            System.out.println("30대 이상");
        }
    }
}
