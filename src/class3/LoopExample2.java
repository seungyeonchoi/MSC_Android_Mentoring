package class3;

public class LoopExample2 {
    /*
     * 3주차 - for문 예제2
     * 1부터 100까지의 수 가운데 3의 배수가 몇 개인지 세보기
     * */
    public static void main(String[] args) {
        int count = 0 ; // 3의 배수인 숫자가 발견되면 1씩 증가
        for(int i=1;i<101;i++){
            if(i%3==0){
                count++;
            }
        }
        System.out.println("1 ~ 100 중 3의 배수는 "+count +"개가 있다.");
    }
}
