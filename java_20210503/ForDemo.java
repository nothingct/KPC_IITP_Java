package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 %d입니다 %n", sum);
		
		int evenSum=0;
		for (int i = 2; i <= 10; i+=2) {
			evenSum += i;
		}
		System.out.printf("1부터 10까지의 짝수 합은 %d입니다 %n", evenSum);
	}

}
