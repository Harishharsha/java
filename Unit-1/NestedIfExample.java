public class NestedIfExample {    
public static void main(String[] args) {    
    //Creating two variables for age and weight  
    int age=Integer.parseInt(args[0]);  
    int weight=Integer.parseInt(args[1]);    
    //applying condition on age and weight  
    if(age>=18){    
        if(weight>50){  
            System.out.println("You are eligible to donate blood");  
        }    
    }    
}}  