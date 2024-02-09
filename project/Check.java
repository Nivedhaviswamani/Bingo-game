package project;
import java.util.*;
public class Check
{
    public static int i,j,sum=0,win=0;
    public static int checkBingo(int a[][])
    {
        win=0;
        
        for(i=0;i<5;i++)
        {
         
             if((a[i][0]+a[i][1]+a[i][2]+a[i][3]+a[i][4])==0) 
            { win++;}
            if((a[0][i]+a[1][i]+a[2][i]+a[3][i]+a[4][i])==0)
            {win++;}
             
        }
        sum=0;
       
         for(i=0;i<5;i++)
         {
             for(j=0;j<5;j++)
             {
                 if(i==j)
                 {
                    sum=sum+a[i][j];
                 }
             }
            
         }
          if(sum==0)
             win++;
         sum=0;
         j=0;
         for(i=4;i>=0;i--)
         {
             
                sum=sum+a[i][j];
                 j++;
             
         }
          if(sum==0)
             win++;
        return win;
    }
}
/*
1 2 3 4 5

6 7 8 9 10

11 1 21 3 14 15

16 17 18 19 20

21 22 23 24 25




1 3 2 5 4

7 6 8 9 10

12 13 16 11 15

14 19 21 18 17

20 21 22 23 24 25

*/