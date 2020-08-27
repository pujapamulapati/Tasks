class TortoiseRace implements Runnable {
  public void run() {
    for (int i = 0; i<= 100; i++) {
             System.out.println("The turtle ran "+i+ "meter!");
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
      }
    }
         System.out.println("The tortoise has finished the race!");
 
  }
}
 
class RabbitRace implements Runnable {
  public void run()
  {
    for (int j = 0; j <= 100; j++) 
    {
      System.out.println("The rabbit ran "+j+" meters!");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
      }
      if(j==90)
    	  try {
    	        Thread.sleep(5000);
    	      } catch (InterruptedException e) {
    	      }
    }
         System.out.println("The rabbit has finished the race!");
 
  }
}
public class StoryOfRabbitandTortoise
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	    TortoiseRace a = new TortoiseRace();
	    Thread runner1 = new Thread(a);
	    RabbitRace b = new RabbitRace();
	    Thread runner2 = new Thread(b);
	    runner1.start();
	    runner2.start();
	    while(true)
	    {
	    	if(!runner1.isAlive())
	    	{
	    		System.out.println("Tortoise Win Race");
	    		runner2.stop();
	    		break;
	    	}
	    	if(!runner2.isAlive())
	    	{
	    		System.out.println("Rabbit Win Race");
	    		runner1.stop();
	    		break;
	    	}
	    }
	    
}
	}