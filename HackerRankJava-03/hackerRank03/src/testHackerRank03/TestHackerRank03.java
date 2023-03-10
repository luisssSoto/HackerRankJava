package testHackerRank03;

import java.io.*;
import java.util.*;

import hackerRank03.HackerRank03;

public class TestHackerRank03  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
        
        HackerRank03 hr1 = new HackerRank03();
        hr1.plusMinus(arr);
        //HackerRank03.plusMinus(arr);

        bufferedReader.close();
    }
}

