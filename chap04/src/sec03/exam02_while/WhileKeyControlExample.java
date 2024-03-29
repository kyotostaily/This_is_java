package sec03.exam02_while;
public class  WhileKeyControlExample {
	public static void main(String[] args) throws Exception { //예외처리 
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) { //엔터키 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴.
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) { //1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { //2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { //3
				run = false;
			}
		}	
		
		System.out.println("프로그램 종료");
	}
}


