import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter user 1 details:");	
        String detail1=sc.nextLine();
        System.out.println("Enter user 2 details:");	
        String detail2=sc.nextLine();
        String[] arr1=detail1.split(",");
        User user1=new User(arr1[0],arr1[1],arr1[2],arr1[3]);
        String[] arr2=detail2.split(",");
        User user2=new User(arr2[0],arr2[1],arr2[2],arr2[3]);
        System.out.println(user1);
        System.out.println(user2);
        if(user1.equals(user2))
        {
        	System.out.println("User 1 is same as the second user");
        }
        else
        	System.out.println("User 1 and User 2 are totally different");
	}

}
