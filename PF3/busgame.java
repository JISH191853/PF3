import java.util.Scanner;

public class busgame {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int kidNo=0;
        for(int i=1;true;i++)
        {
            kidNo++;
            String input=sc.next();
            System.out.println(i+":"+input);
            //convert input into number
            if(i%x==0)
            {
                if(!input.equals("Bus"))
                    System.out.println(kidNo);
            }
            kidNo%=n;
        }
    }

}


