package com.multithread;

class Q
{
   public void put(int num)
   {
	   System.out.println(Thread.currentThread().getName()+" :"+num);
   }

   public void get(int num)
   {
	   System.out.println(Thread.currentThread().getName()+" :"+num);
   }
}
class Producer extends Thread
{
	Q q=null;
	int num=0; 
	public Producer(Q q) 
	{
		super();
		this.q = q;
	}

	@Override
	public void run() 
	{
		while(true)
		{
			q.put(num++);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread
{
	Q  q =null;
	
	public Consumer(Q q)
	{
		super();
		this.q = q;
	}
    int num=0;
	public void run() 
	{ 
		while(true)
		{
			q.get(num++);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
public class ProducerConsumer 
{
  public static void main(String[] args) 
  {
	  Q q =new Q();
	  new Producer(q).start();
	  new  Consumer(q).start();
   }
}
