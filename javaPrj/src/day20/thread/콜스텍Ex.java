package day20.thread;

public class 콜스텍Ex {
	//콜스텍 - 매서드 수행에 필요한 메모리가 저장되는공간
	//스택 : 순서대로 시작
	// 매서드가 호출되면 호출스택에 메모리할당 ,종료되면 해제
	
void 메서드1() {
	메서드2();
	System.out.println("메서드1");
}
	
private void 메서드2() {
	System.out.println("메서드2");
}

	public static void main(String[] args) {
	
		콜스텍Ex p = new 콜스텍Ex();
		p.메서드1();
		
	}

}
