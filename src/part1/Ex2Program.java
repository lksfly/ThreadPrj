package part1;

public class Ex2Program {

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
		ct.setName("MAIN");
		
		for(int i=0; i<100; i++) {
			System.out.printf("%s : %d\n",ct.getName(),i+1);
		}
		th1.start();
		th2.start();

	}

	private static void print() {
		Thread t1 = Thread.currentThread();
		for(int i=0; i<100; i++) {
			System.out.printf("%s : %d\n",t1.getName(),i+1);
		}
		
	}

}
