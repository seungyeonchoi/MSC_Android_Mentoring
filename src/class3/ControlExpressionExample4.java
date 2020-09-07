package class3;

public class ControlExpressionExample4 {
    public static void main(String[] args) {
        char grade='B';
        switch (grade)
        {
            case 'A':
                System.out.println("91~100점 입니다.");
                break;
           case 'B':
               System.out.println("81~90점 입니다.");
               break;
           case 'C':
               System.out.println("71~80점 입니다.");
               break;
           case 'D':
               System.out.println("61~70점 입니다.");
               break;
           case 'F':
               System.out.println("60점 이하 입니다.");
               break;
           default:
               System.out.println("잘못된 학점입니다.");
        }
     }
}
