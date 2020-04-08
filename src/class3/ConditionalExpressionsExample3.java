package class3;

public class ConditionalExpressionsExample3 {
    /*
     * 3주차 - 조건 연산자 예제3
     * 조건 연산자를 이용한 최댓값 구하기
     * */
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int max;
        if (a > b && a > c) {
            max = a;  //a가 b보다 크고, a가 c보다 클 때 실행(a가 최댓값)
        } else {  // 위의 조건식이 false일때 실행
            if (b > c) {
                max = b; //(a가 b보다 크고, a가 c보다 크다) 상황이 아닐 때, b가 c보다 크다면 실행(b가 최댓값)
            } else {
                max = c; //c가 최댓값
            }
        }
        System.out.println("max = " + max);
    }
}
