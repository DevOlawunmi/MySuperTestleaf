package week3.day1;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurrenceMaps {
    public static void main(String[] args) {
        //Assignment2: FindNumbersOccurances

        /*
         * Input array numbers, each occurances
         *
         * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
         * output: 2 -> 3 , 3 -> 2, 4 -> 1
         *
         * Order: Ascending Order
         *
         */

        /*
         * Psuedcode:
         *
         * a) Create Map -> TreeMap
         * b) For loop -> each number -> add to the map
         * c) If it exists -> update it with + 1
         * 	  Else -> new entry with 1 as value
         *
         */
        Map<Integer, Integer> map = new TreeMap<>();

        int[] numbers = new int[]{2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
        int count = 1;

        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])){
                map.put(numbers[i], map.get(numbers[i]) +1);

            }
            else {map.put(numbers[i],count);

        }


    }
        System.out.println(map.entrySet());
}
}