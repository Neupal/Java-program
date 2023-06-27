public class RunnableInterface implements Runnable
{
	public void run()
	{
		System.out.println("Thread has ended");
	}
	public static void main(String[] args)
	{
		RunnableInterface ri=new RunnableInterface();
		Thread t1=new Thread(ri);
		t1.start();
		System.out.println("Hi");
	}
}