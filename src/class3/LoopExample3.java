package class3;

public class LoopExample3 {
    /*
     * 3주차 - for문 예제3
     * 이중 for문 사용해보기 - 주사위 2개를 던져서 합이 6이 되는 경우의 수 구하기
     * */
    public static void main(String[] args) {
        for(int i =1; i<7;i++){
            for(int j =1; j<7;j++){
                if (i+j == 6){
                    System.out.println("("+i +", "+j+")");
                }
            }
        }
    }
}
