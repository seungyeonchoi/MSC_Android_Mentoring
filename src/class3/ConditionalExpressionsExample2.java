package class3;

public class ConditionalExpressionsExample2
{
    public static void main(String[] args) {
        Boolean flag = true;
        if(flag){
            System.out.println("flag is true\n");
        }
        else {
            System.out.println("flag is false\n");
        }
        if(3!=3) // (조건식) 이 참이면 실행됩니다.
            System.out.println("\"3 is not 3\" is false ");

        int num = 10;
        if(num%2 == 0){
            System.out.println(num+"는 짝수");
        }else{
            System.out.println(num+"는 홀수");
        }
    }
}
