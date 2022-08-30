package java_study01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FastAB {
		
	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		PrintWriter pw = new PrintWriter( new BufferedOutputStream( System.out ), true );
		
		try {
			int t = Integer.parseInt(br.readLine());
			int a;
			int b;
			StringTokenizer st;
			
			for(int i=0; i<t; i++) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
			
				pw.write(String.valueOf(a+b) + "\n");
			}
			pw.flush();
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)	br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(pw!=null)	pw.close();
		}
		
	}
}
