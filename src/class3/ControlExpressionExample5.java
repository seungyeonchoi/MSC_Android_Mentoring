package class3;

public class ControlExpressionExample5 {
    
    public static void main(String[] args) {
        
        char operator = '*';
		int i = 20;
		int o = 10;
		int result;
		
		if (operator == '+') {
			result = i + o;
		} else if(operator == '-') {
			result = i - o;
		} else if(operator == '*') {
			result = i * o;
		} else {
			result = i / o;
		}

		System.out.println(result); // 200
     }
}
