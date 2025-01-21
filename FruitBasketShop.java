package vinit;
import java.util.*;
public class fruit {
	public static void main(String[] args)
	{
		int m=120;
		int d=200;
		int a=150;
		int w=450;
		int mq, dq, aq, wq = 0;
		int mp=0,dp=0,ap=0,wp=0;
		// m stands for Mango, d stands for Dragon , A stands for Apple, W stands for Wine grapes; 
		// Q stands for Quantatiy & P stands for price
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("------------ Welcome to my fruit shop ---------------");
			System.out.print("M = Mango \nD = Dragon fruit \nA = Apple \nW = Wine grapes \nAny key for Exit \n");
			
			System.out.println("What you want to buy:");
			char in=s.next().charAt(0);
		
			if(in=='M' || in=='m')
			{
				System.out.println("Mango-120 per dozen/kg");
				
				System.out.println("How much Quantatiy do you want??");
				mq=s.nextInt();
				mp=mq*120;
				System.out.println("Your Mangoes amount will be"+" "+mp);
			}
			else if(in=='D'||in=='d')
			{
			    System.out.println("Dragon fruit-200 per dozen/kg");
			    System.out.println("How much Quantatiy do you want??");
			    dq=s.nextInt();
			    dp=dq*200;
				System.out.println("Your Dragon fruits amount will be"+" "+dp);
			}
			else if(in=='A'||in=='a')
			{
			    System.out.println("Apple-150 per dozen/kg");
			    System.out.println("How much Quantatiy do you want??");
			    aq=s.nextInt();
			    ap=aq*150;
				System.out.println("your Apples amount will be"+" "+ap);
			}
			else if(in=='w'||in=='W')
			{
				System.out.println("Wine grape-450 per dozen/kg");
			    System.out.println("How much Quantatiy do you want??");
			    wq=s.nextInt();
			    wp=wq*150;
				System.out.println("Your Wine grapes amount will be"+" "+wp);
			}
			else
			{
				int total = mp+dp+ap+wp;
				System.out.println("Your total amount will be"+" "+total);
				System.out.println("Thanks for visiting us, visit again");

				
				break;
			}
		}


}
}
