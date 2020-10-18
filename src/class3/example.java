import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //문제 1
        int fahrenheit = 100;
        float celcius = (float) ((5.0 / 9.0) * (fahrenheit - 32)); //문제에서 알려준 수식 구현
        //float으로 캐스팅해주지않으면 double형으로 계산 됨
        System.out.println("F: "+fahrenheit);
        System.out.println("C: "+celcius);

        //문제 2
        char ch = 'z';
        boolean b = ('a'<=(int)ch && (int)ch<='z') || ('A'<=(int)ch && (int)ch<='Z') || ('0'<=(int)ch && (int)ch<='9') ? true : false;
        //소문자이거나 or 대문자이거나 or 숫자인지 검사 -> 하나로 참이면 true
        System.out.println(b);

        //문제 3
        char ch2 = 'A';
        char lowerCase = ('A'<=(int)ch2 && (int)ch2 <='Z') ? (char) (ch2 + 32) : ch2;
        //ch2가 대문자인지 판단 -> 참이면 아스키코드값 32를 더해 소문자로 만듦(문제 참고)
        System.out.println("ch2: "+ch2);
        System.out.println("ch to lowerCase: "+lowerCase);

        //문제 4
        for(int i = 0; i<= 10; i++){ //x의 범위는 1 ~ 10
            for(int j = 0; j<=10; j++){ //y의 범위는 1 ~ 10
                if(2*i + 4*j == 10){
                    System.out.println("x= "+i+", y= "+j);
                }
            }
        }
    }
}
