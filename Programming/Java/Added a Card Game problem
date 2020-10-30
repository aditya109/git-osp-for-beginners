import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class C_digit_powernumber {


	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		int t=Reader.nextInt();
		while(t-->0) {
			int chef=Reader.nextInt();
			int rick= Reader.nextInt();
			
			boolean flag=false;
			if(chef<9 || rick<9) {
				flag=true;
				System.out.println(1+" "+ 1);
			}
				
			
			int c_count=0;
			double r_count=0;
			if(flag!=true) {
				
				
				c_count=(int)Math.ceil((double)chef/9);
				r_count=Math.ceil((double)rick/9);
				
				if(c_count>=r_count) {
					System.out.println(1+" "+ (int) r_count);
					
				}
				else {
					System.out.println(0+" "+ c_count);
					
				}
			}
		}

	}

}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {

        	tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    

}
