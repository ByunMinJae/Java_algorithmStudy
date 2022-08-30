package java_study01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int T = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int A;
            int B;

            for(int i=0; i<T; i++) {
                st = new StringTokenizer(br.readLine());
                A = Integer.parseInt(st.nextToken());
                B = Integer.parseInt(st.nextToken());

                bw.write((A+B) + "\n");

            }

            br.close();

            bw.flush();

            bw.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}