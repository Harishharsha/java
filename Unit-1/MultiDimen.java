import java.io.*;
class MultiDimen{
	public static void main(String args[])throws IOException{
		//int m=2,n=2,i,j;
		int m,n,i,j;
		
		m=Integer.parseInt(args[0]);
		n=Integer.parseInt(args[1]);
		int arr[][]=new int[m][n];
		//int arr[][]=new int[][]{{2,2},{3,4}};
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