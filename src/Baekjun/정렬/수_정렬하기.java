package src.Baekjun.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 수_정렬하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
