public class BitwiseOp { 
    public static void main(String[] args) 
    { 
       
        int a = 0xa;   
        int b = 0x0007;       
		//int a = 0b0101;     
        //int b = 0b0111;     
        // bitwise and 
        // 0101 & 0111=0101 5 7 2 10
		
		
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise and 
        // 0101 | 0111=0111 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
				
        System.out.println("~a = " + Integer.toBinaryString(~a)); 
        System.out.println("~a = " + (~a)); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
    } 
} 