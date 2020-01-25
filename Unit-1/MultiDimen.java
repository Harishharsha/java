import java.io.*;
class MultiDimen{
	public static void main(String args[])throws IOException{
		int m,n,i,j;
		m=Integer.parseInt(args[0]);
		n=Integer.parseInt(args[1]);
		int arr[][]=new int[m][n];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}	
			
		for(i=0;i<m;i++)
		{for(j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println("");
		}
			
		
	}
}