package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oven {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h;

        String m;
        try{
            h = br.readLine();
            m = br.readLine();
            String[] arr = h.split(" ");
            int hour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);

            int time = Integer.parseInt(m);

            // 1h = 60m 60m = 3600
            int hour_second = hour*3600;
            int minute_second= minute*60;
            int time_second = time*60;

            int result = hour_second+minute_second+time_second;

            int hour2 = result/3600;

            int minute2 = result/60-(hour2*60);
            if (hour2 >=24){
                hour2 = hour2%24;
            }

            System.out.printf("%d %d%n", hour2, minute2);
        }catch(Exception e){
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
