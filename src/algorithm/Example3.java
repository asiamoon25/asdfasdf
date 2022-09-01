package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] black = {1,1,2,2,2,8};
        int[] white = new int[6];
        String s;
            try {
                s = br.readLine();
                String[] arr = s.split(" ");
                for(int i =0; i< arr.length;i++){
                    int k_w = black[i] - Integer.parseInt(arr[i]);
                    white[i] = k_w;
                    System.out.print(white[i]+" ");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


    }

}
