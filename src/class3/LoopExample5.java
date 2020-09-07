
package class3;

public class LoopExample5 {
    /*
     * 3주차 - while문 예제5
     * 1부터 100까지 전체 합, 짝수 합, 홀수 합 구하기
     * */
    public static void main(String[] args) {
        int sum = 0, odd = 0, even = 0; // 합계 계산을 위한 초기값 할당
		int i = 1; // 반복문 초기값 할당
		while (i <= 100) { // 반복문 조건식
			sum += i; // sum = sum + i; 총합
			if (i % 2 == 0) { // 짝수 조건식
				even += i; // even = even + i; 짝수합
			} else {
				odd += i; // odd = odd + i; 홀수 합
			}
			i++; // 증감식
		}
		System.out.println("1~100 합 = " + sum); // 결과 : 5050
		System.out.println("1~100 짝수합 = " + even); // 결과 : 2550
		System.out.println("1~100 홀수합 = " + odd); // 결과 : 2500

    }
}
