import java.util.*; 
  
public class LogicalOp { 
    public static void main(String[] args) 
    { 
        String x = "harish"; 
        String y = "12345"; 
  
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter username:"); 
        String uid = s.next(); 
        System.out.print("\nEnter password:"); 
        String upwd = s.next(); 
  
        // Check if user-name and password match or not. 
        if ((uid.equals(x) && upwd.equals(y)) 
            || (uid.equals(y) && upwd.equals(x))) { 
            System.out.println("Welcome user."); 
        } 
        else { 
            System.out.println("Invalid user id or password"); 
        } 
    } 
} 