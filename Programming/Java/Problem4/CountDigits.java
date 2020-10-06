import java.io.*;
class CountDigits
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);

int num=Integer.parseInt(br.readLine());
int count=0;
while(num>0)
{
count++;
num=num/10;
}
System.out.println("the number of digits are: "+count);
}
}