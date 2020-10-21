import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //예제문제 2

        //문제 1
        int [] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money = "+ money);
        for(int i =0;i<coinUnit.length; i++){
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]); //최대로 지불하는 화폐 갯수 구하기
            money %= coinUnit[i]; //이미 지불한 돈 뺌
        }
        //문제 2
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        for(int i = 0; i< ballArr.length;i++){
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0 ;
            //ballArr배열 자리 바꾸기
            tmp = ballArr[i]; //복사 당하는 위치에 원래 있던 값 tmp에 복사
            ballArr[i] = ballArr[j]; //j 위치에 있는 값 넣기
            ballArr[j] = tmp; //복사한 값 새로운 위치에 붙여넣기
        }
        //ballArr의 앞에서 3개의 수를 ball3으로 복사
        for(int i = 0 ; i<ball3.length;i++){
            ball3[i] = ballArr[i];
        }
        for(int i = 0; i< ball3.length;i++){
            System.out.print(ball3[i]);
        }

    }
}
