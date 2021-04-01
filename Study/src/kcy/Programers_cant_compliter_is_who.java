package kcy;

import java.util.Arrays;

public class Programers_cant_compliter_is_who {

	   public static void main(String[] args) {

	      String notCompleter = "";
	      String[] a = {"leo", "kiki", "eden"};
	      String[] b = {"eden", "kiki"};
	      notCompleter = solution(a, b);
	      System.out.println(notCompleter);
	      
	   }
	    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        for (int i = 0; i < completion.length; i++) {
	           for (int j = 0; j < participant.length; j++) {
	              if (completion[i].equals(participant[j])) {
	                 participant[j] = "";
	                 completion[i] = "";
	              }
	           }
	        }
	        Arrays.sort(participant);
	        answer = participant[participant.length - 1];
	        return answer;
	    }
	}
