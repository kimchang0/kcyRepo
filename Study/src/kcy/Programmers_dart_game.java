package kcy;

public class Programmers_dart_game {

	public static void main(String[] args) {
		
		System.out.println(solution("1S2D*3T"));
		
	}
	
    public static int solution(String dartResult) {
        int answer = 0;
        int last_score = 0;
        String[] arr = dartResult.split("");
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i].equals("S")) {
        		arr[i] =  "x1 ";
        	} else if (arr[i].equals("D")) {
        		arr[i] =  "x2 ";
        	} else if (arr[i].equals("T")) {
        		arr[i] =  "x3 ";
        	} else if (arr[i].equals("*")) {
        		arr[i] = "* ";
        	} else if (arr[i].equals("#")) {
        		arr[i] = "# ";
        	}
        }
        String temp = String.join("", arr);
        arr = null;
        arr = temp.split(" ");
        temp = null;
        for(int i = 0; i < arr.length; i++) {
        	String[] numbers = arr[i].split("x");
        	int temp_num = 1;
        	for(int j = 1; j < Integer.parseInt(numbers[1]); j++) {
        		temp_num *= Integer.parseInt(arr[0]);
        	}
        	
        }
        
        return answer;
    }

}
