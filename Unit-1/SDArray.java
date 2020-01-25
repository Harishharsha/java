import java.io.*;
class SDArray
{
public static void main (String args[]) throws IOException
{ //Create a BufferedReader class object (br)

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of array");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter elements to array");
for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
	System.out.print(a[i]+ " ");

}
}