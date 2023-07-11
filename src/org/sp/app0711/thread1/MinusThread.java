package org.sp.app0711.thread1;

//숫자 증가용 쓰레드
public class MinusThread extends Thread{
	//개발자는 독립수행하고 싶은 코드가 있을 때, 반드시 run 메서드에
	//코드를 작성해야 한다..jvm이 호출하는 메서드이기 때문에..
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("감소쓰레드 run() 호출");
		}
	}
}
