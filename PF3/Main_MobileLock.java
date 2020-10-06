import java.util.Scanner;
public class Main_MobileLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sideLength=sc.nextInt();
        int noOfPoints=sc.nextInt();
        int points[][]=new int[noOfPoints][2];
        for(int i=0;i<noOfPoints;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            points[i][0]=x;
            points[i][1]=y;
        }
        boolean isValid=true;
        //loop all the points
        int prevX=points[0][0];
        int prevY=points[0][1];
        for(int i=1;i<noOfPoints;i++)
        {
            int currX=points[i][0];
            int currY=points[i][1];
            int xDiff=Math.abs(currX-prevX);
            int yDiff=Math.abs(currY-prevY);
            if(xDiff>1 || yDiff>1)
            {
                isValid=false;
                break;
            }
            prevX=currX;
            prevY=currY;
        }
        
        if(isValid)
        {
            int totalPoints=sideLength*sideLength;
            int coverage=(int) ((float)noOfPoints/totalPoints*100);
            if(coverage>75)
                System.out.println("Excellent");
            else if(coverage>50)
                System.out.println("Good");
            else if(coverage>25)
                System.out.println("Average");
            else
                System.out.println("Poor");
        }else
            System.out.println("Invalid");
    }
}


