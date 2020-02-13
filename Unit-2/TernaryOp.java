public class TernaryOp { 
    public static void main(String[] args) 
    { 
        int a = 90, b = 40, c = 30, result; 
		result=(a>b)? 10:20;
		System.out.println("result is = "+ result); 
        result = ((a > b)? 
                       (a > c)? a: c 
                      : (b > c)? b: c); 
        System.out.println("Max of three numbers = "+ result); 
    } 
} 