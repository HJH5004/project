package sec09.exam03_callback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.nio.channels.CompletionHandler;

public class CallBackExample {
	private ExecutorService executorService;
	
	public CallBackExample() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
	}
	
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>(){
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() ����: "+result);
		}
		public void failed(Throwable exc, Void attachmoent) {
			System.out.println("failed() ����: "+exc.toString());
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable()	{
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch(NumberFormatException e) {
					callback.failed(e, null);
				}
			}
		};
		executorService.submit(task);
		
	}
	public void finish() {
		executorService.shutdown();
	}
	
	public static void main(String[] args) {
		CallBackExample example = new CallBackExample();
		example.doWork("3", "3");
		example.doWork("3", "��");
		example.finish();
		
	}
	

}
