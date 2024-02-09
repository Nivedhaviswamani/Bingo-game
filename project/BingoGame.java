package project;
import java.util.*;
public class BingoGame {
		public static void main(String[] args) {
		    int a1[][]=new int[5][5];
		    int a2[][]=new int[5][5];
		    int i,j,count=0,win1=0,win2=0,sum1=0,sum2=0,temp;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter input of player 1");
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            a1[i][j]=sc.nextInt();
		           
		        }
		        System.out.println();
		    }
		     System.out.println("Enter input of player 2");
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            a2[i][j]=sc.nextInt();
		            
		        }
		        System.out.println();
		    }
		    while(win1!=5 && win2!=5)
		    {
		    System.out.println("player 1 say a number:");
		    temp=sc.nextInt();
		    System.out.println();
		    System.out.println();
		    count++;
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            if(temp==a1[i][j])
		            {
		                //System.out.println("a1"+i+j+a1[i][j]);
		                a1[i][j]=0;
		                
		            }
		        }
		    }
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            if(temp==a2[i][j])
		            {
		                // System.out.println("a2"+i+j+a2[i][j]);
		                a2[i][j]=0;
		                
		            }
		        }
		    }
		    if(count>4)
		    {
		        System.out.println("player 1 table:");
		      for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            System.out.print(a1[i][j]+" ");
		        }  
		        System.out.println();
		    }
		      System.out.println();
		      System.out.println();
		    System.out.println("player 2 table:");
		      for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            System.out.print(a2[i][j]+"  ");
		        }  
		        System.out.println();
		    }
		    win1=Check.checkBingo(a1);
		    if(win1==5)
		        System.out.println("winner is player 1");
		    win2=Check.checkBingo(a2);
		    if(win2==5)
		        System.out.println("winner is player 2");
		    }
		    System.out.println("player 2 say a number:");
		    temp=sc.nextInt();
		    System.out.println();
		    System.out.println();
		    count++;
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            if(temp==a1[i][j])
		            {
		                // System.out.println("a"+i+j+a1[i][j]);
		                a1[i][j]=0;
		               
		            }
		        }
		    }
		    for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            if(temp==a2[i][j])
		            {
		                // System.out.println("a"+i+j+a2[i][j]);
		                a2[i][j]=0;
		                
		            }
		        }
		    }
		      if(count>4)
		    {
		        System.out.println("player 1 table:");
		      for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            System.out.print(a1[i][j]+" ");
		        }  
		        System.out.println();
		    }
		      System.out.println();
		      System.out.println();
		    System.out.println("player 2 table:");
		      for(i=0;i<5;i++)
		    {
		        for(j=0;j<5;j++)
		        {
		            System.out.print(a2[i][j]+"  ");
		        }  
		        System.out.println();
		    }
		    win1=Check.checkBingo(a1);
		    if(win1==5)
		        System.out.println("winner is player 1");
		    win2=Check.checkBingo(a2);
		    if(win2==5)
		        System.out.println("winner is player 2");
		    }
		    
		            
		    }    
		}
	


}
