package sec02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000; //컴파일 에러
		long var4 = 100000000000L; //L : 8바이트 수로 해석하라는 뜻
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
