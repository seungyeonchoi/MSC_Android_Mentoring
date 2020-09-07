
package class3;

public class LoopExample4 {
    /*
     * 3주차 - for문 예제4
     * 1부터 10까지 홀수의 합 구하기
     * */
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1; i<=10;i++){ //for(변수 초기화 ; 조건 ; 증감식)
            if(i%2 != 0) //i를 2로 나눈 나머지가 0이 아니라면
                sum+=i;
        }
        System.out.println("sum: "+sum); //25
    }
}
