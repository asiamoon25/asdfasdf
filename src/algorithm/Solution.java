package algorithm;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[][] v = {{1,4},{3,10},{3,4}};
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(v)));
    }

    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        answer[0] = v[0][0]^v[1][0]^v[2][0];
        answer[1] = v[0][1]^v[1][1]^v[2][1];
        System.out.println(answer[1]);

        return answer;

    }
}
