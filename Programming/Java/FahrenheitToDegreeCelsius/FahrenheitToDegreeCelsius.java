import java.util.*;
public class farento0c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int f1=s.nextInt();
		int f2=s.nextInt();
		int step=s.nextInt();
		
		for(int f=f1;f<=f2;f=f+step)
		{      
			int c=(int)((5.0/9)*(f-32));
			System.out.println(f + "	" +c);
		}
		

	}

}
