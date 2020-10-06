import java.util.Scanner;
public class roompaint {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length,width and height of the room");
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Enter no of doors");
		int no_door=sc.nextInt();
		System.out.println("Enter no of windows");
		int no_window=sc.nextInt();
		System.out.println("Enter length and width  of the door");
		int d_l=sc.nextInt();
		int d_w=sc.nextInt();
		System.out.println("Enter length and width of the window");
		int w_l=sc.nextInt();
		int w_w=sc.nextInt();
		System.out.println("Enter the cost per sq meter");
		int costpsq=sc.nextInt();
		int area_doorcover=no_door*d_l*d_w;
		int area_windowcover=no_window*w_l*w_w;
		int total_cost=costpsq*((2*l*h)+(2*w*h)-(area_doorcover)-(area_windowcover));
		System.out.println(total_cost);

	}

}
