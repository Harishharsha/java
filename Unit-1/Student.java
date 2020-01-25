import java.util.Scanner;
public class Student{

	public static void main(String[] args){
		String name,address;
		long mobile;
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Student registration");
		System.out.println("Enter name of the Student");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter mobile no");
		mobile=sc.nextLong();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Mobile:"+mobile);
		
	}
}	