package chap16;

public class ThreadGroupEx1 {
	public static void main(String[] args) {
		ThreadGroup group = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threads = new Thread[group.activeCount()];
		while (group.enumerate(threads, true) == threads.length) {
			threads = new Thread[threads.length * 2];
		}
		for(Thread t : threads) {
			if(t != null)
			   System.out.println(t+ "=>" + t.getClass().getName() + (t.isDaemon()?"데몬":"일반"));
		}
	}

}
