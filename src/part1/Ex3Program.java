package part1;

public class Ex3Program {

	public static void main(String[] args) {		
		Runnable a1 = new Runnable() {

			@Override
			public void run() {
				print();
				
			}
			
		};		
		
		Thread th1 = new Thread(a1);
		th1.setName("SUB1");
		Thread th2 = new Thread(a1);
		th2.setName("SUB2");
		
		Thread ct = Thread.currentThread();
		ct.setName("MAIN") ;
		
		
		System.out.println(th1.getState());
		th1.start();
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		
		th2.start();
		print();

	}

	private static void print() {
		Thread t1 = Thread.currentThread();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<100; i++) {
			System.out.printf("%s : %d\n",t1.getName(),i+1);
		}
		
	}

}
