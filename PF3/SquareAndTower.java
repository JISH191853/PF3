import java.util.Scanner;
public class SquareAndTower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cityLength=sc.nextInt();
        int noOfTowers=sc.nextInt();
        int tower[][]=new int[noOfTowers][2];
        int city[][]=new int[cityLength][cityLength];
        for(int i=0;i<noOfTowers;i++)
        {
            tower[i][0]=sc.nextInt();
            tower[i][1]=sc.nextInt();
        }
        for(int i=0;i<noOfTowers;i++)
        {
            int x=tower[i][0];
            int y=tower[i][1];
            for(int row=-1;row<=1;row++)
            {
                for(int col=-1;col<=1;col++)
                {
                    int x1=x+row;
                    int y1=y+col;
                    if(x1>=cityLength || y1>=cityLength || x1<0 || y1<0)
                        continue;
                    city[x1][y1]=1;
                }
            }
        
        }
        int count0=0;
        for(int i=0;i<cityLength;i++)
        {
            for(int j=0;j<cityLength;j++)
            {
                if(city[i][j]==0)
                    count0++;
            }
        }
        if(count0==0)
        	System.out.println("Yes");
        else
        	{
        	  System.out.println("No");
        	  System.out.println(count0);
        	}
    }
}