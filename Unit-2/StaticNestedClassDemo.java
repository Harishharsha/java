class Outer
{  
    static int outer_x = 10; 
    static int outer_y = 20; 
    private static int outer_private = 30; 
    static class StaticNested
    { 
        void display() 
        { 
            System.out.println("outer_x = " + outer_x); 
            System.out.println("outer_private = " + outer_private); 
            System.out.println("outer_y = " + outer_y); 
          
        } 
    } 
} 
public class StaticNestedClassDemo 
{ 
    public static void main(String[] args) 
    { 
        
        Outer.StaticNested nestedObject = new Outer.StaticNested(); 
          
        nestedObject.display(); 
          
    } 
} 