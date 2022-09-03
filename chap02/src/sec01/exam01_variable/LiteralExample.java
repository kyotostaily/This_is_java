package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010; // (0으로 시작) 8진수 10 저장 (1 x 8의1승 + 0 x 8의 0승 = 8)
		System.out.println(var2);
		
		int var3 = 0x10; // (0x나 0X로 시작) 16진수 10을 var3에 저장 (1 x 16의1승 + 0 x 16의 0승 = 16)
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5; //2 x 10의5승 여기서 E는 10을 뜻한다.
		System.out.println(var5);
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println('\t' + "들여쓰기");
		System.out.println("대한" + '\n' + "민국");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("이것은" + '\"' + "중요" + '\"' + " 합니다");
		System.out.println("가격이 " + '\\' + "300입니다.");
		
		char var8 = '\u0041'; //41번이라는 16진수에 해당하는 유니코드가 var8에 저장
		System.out.println(var8); // 4 x 16의1승 + 1 x 16의 0승 = 64 + 1 ->10진수 65는 large A의 유니코드
		
		System.out.println("대한" + "민국");
		System.out.println("java" + 8); //8이 문자열로 되어 결합된다. 
		
		String var9 = "자바";
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		}
}
