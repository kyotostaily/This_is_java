package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010; // (0���� ����) 8���� 10 ���� (1 x 8��1�� + 0 x 8�� 0�� = 8)
		System.out.println(var2);
		
		int var3 = 0x10; // (0x�� 0X�� ����) 16���� 10�� var3�� ���� (1 x 16��1�� + 0 x 16�� 0�� = 16)
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5; //2 x 10��5�� ���⼭ E�� 10�� ���Ѵ�.
		System.out.println(var5);
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '��';
		System.out.println(var7);
		
		System.out.println('\t' + "�鿩����");
		System.out.println("����" + '\n' + "�α�");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("�̰���" + '\"' + "�߿�" + '\"' + " �մϴ�");
		System.out.println("������ " + '\\' + "300�Դϴ�.");
		
		char var8 = '\u0041'; //41���̶�� 16������ �ش��ϴ� �����ڵ尡 var8�� ����
		System.out.println(var8); // 4 x 16��1�� + 1 x 16�� 0�� = 64 + 1 ->10���� 65�� large A�� �����ڵ�
		
		System.out.println("����" + "�α�");
		System.out.println("java" + 8); //8�� ���ڿ��� �Ǿ� ���յȴ�. 
		
		String var9 = "�ڹ�";
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		}
}
