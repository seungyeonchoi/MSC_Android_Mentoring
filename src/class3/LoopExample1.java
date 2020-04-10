package class3;

public class LoopExample1 {
    /*
     * 3주차 - for문 예제1
     * 1부터 10까지의 합 구하기
     * */
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1; i<=10;i++){ //for(변수 초기화 ; 조건 ; 증감식)
            /*
            * int i =1 로 초기화
            * i가 10보다 작거나 같을 때까지만 반복문 실행
            * i를 1씩 증가
            * */
            sum+=i;
        }
        System.out.println("sum: "+sum);
    }
}
