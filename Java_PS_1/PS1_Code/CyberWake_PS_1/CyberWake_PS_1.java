import java.util.*;
public class Ice_Cream
{
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();//taking the input of number of visit to ice cream parlour
        for(int visit=0;visit<t;visit++)
        {
   
            int m = scan.nextInt();//taking the input of total money pooled
            int n = scan.nextInt();//taking the input of number of flavours present particular day
            int[] cost = new int[n];
            //integer array of size equal to number of flavour present particular day to store cost of all of them
            for(int i = 0; i < n; i++)
            {
                cost[i] = scan.nextInt();// taking the input of cost of all flavours one by one through the for loop
            }
            for(int i = 0; i < n; i++)//using outer loop to make one flavour constant
            {
                //using second loop to find the other flavour so that cost of both together is equal to the pooled amount
                for(int j = i + 1; j < n; j++)//using j = i+1 to avoid recurring of same flavours costing equal to pooled money but displayed twice due to change in sequence
                {
                    if(cost[i] + cost[j] == m)//checking the cost of two flavours
                    {
                        System.out.println( (i + 1) + " " + (j + 1) );//avoiding break so as to display all flavours even if they have same price
                    }
                }
            }
        }
        scan.close();
    }
}
