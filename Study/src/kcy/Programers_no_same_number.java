package kcy;

import java.util.ArrayList;
import java.util.Iterator;

public class Programers_no_same_number {

   public static void main(String[] args) {
      int[] arr = {1, 1, 3, 3, 0, 1, 1};
      int[] answer = {};
      answer = solution(arr);
      for(int i = 0; i < answer.length; i++) {
         System.out.println(answer[i]);
      }
      
      
   }
    public static int[] solution(int []arr) {
    	
        ArrayList <Integer> array = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) {

           if(arr[i] != arr[i+1]) {
              array.add(arr[i]);
           } 
        }
        array.add(arr[arr.length-1]);
        
        Iterator <Integer> it = array.iterator();
        int[] answer = new int [array.size()];
        int i = 0;
        while(it.hasNext()) {
        	answer[i] = it.next();
        	i++;
        }
        return answer;
        //Integer[] save = array.toArray(new Integer[array.size()]);
        
        //return Arrays.stream(save).mapToInt(i->i).toArray();
    }
}
