package C_com.threadsafe.singleton.example;

/**
 *
 * @author Samarth Narula
 */

// How multi-threading breaks Singleton and how to make a thread safe singleton class
public class Printer {

	private static Printer printer;

	private static boolean initialized = false;

	private Printer() {
	}

	private void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	
// Single check locking, slows the performance
//	public static synchronized  Printer getInstance() throws InterruptedException {
//
//		if (initialized)
//			return printer;
//		
//		Thread.sleep(2000);
//		printer = new Printer();
//		printer.print();
//		initialized = true;
//		return printer;
//
//	}

	// Double check locking
	public static Printer getInstance() throws InterruptedException {

		if (initialized) {
			return printer;
		}
		Thread.sleep(2000);
		synchronized (Printer.class) {
			
			if (initialized) {
				return printer;
			}
			
			Thread.sleep(2000);
			printer = new Printer();
			printer.print();
			initialized = true;
		}

		return printer;
	}

}
