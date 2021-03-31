package kcy;

import java.util.ArrayList;
import java.util.TreeSet;
public class programers_two_out_and_plus {

   public static void main(String[] args) {
      
      int[] numbers = {2,1,3,4,1};
      ArrayList<Integer> pList = new ArrayList<>();
      
      for (int i = 0; i < numbers.length-1; i++) {
         for (int j = i+1; j < numbers.length; j++) {
            pList.add(numbers[i] + numbers[j]);
         }
      }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(Integer item : pList){
           treeSet.add(item);
        }

        int[] answer = treeSet.stream().sorted().mapToInt(Integer::intValue).toArray();
   }
}
