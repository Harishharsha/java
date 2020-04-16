import java.io.*; 

class ExThrows { 
	public static void main(String[] args) throws IOException
	{ 
		
		FileReader file = new FileReader("C:\\Users\\haris\\Desktop\\a.txt"); 
		BufferedReader fileInput = new BufferedReader(file); 
		
		
		for (int counter = 0; counter < 7; counter++) 
			System.out.println(fileInput.readLine()); 
		
		fileInput.close(); 
		
	} 
} 
