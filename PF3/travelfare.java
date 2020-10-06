import java.util.Scanner;

public class travelfare {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int t_fare=sc.nextInt();
		int t_duration=sc.nextInt();
		int b_fare=sc.nextInt();
		int b_duration=sc.nextInt();
		int f_fare=sc.nextInt();
		int f_duration=sc.nextInt();
		int totalt_fare=(x*t_fare)+(y*t_duration);
		int totalb_fare=(x*b_fare)+(y*b_duration);
		int totalf_fare=(x*f_fare)+(y*f_duration);
		if(totalt_fare<totalb_fare && totalt_fare<totalf_fare)
			System.out.println("Train");
		else if(totalb_fare<totalt_fare && totalb_fare<totalf_fare)
			System.out.println("Bus");
		if(totalf_fare<totalt_fare && totalf_fare<totalb_fare)
			System.out.println("Flight");
	}

}
