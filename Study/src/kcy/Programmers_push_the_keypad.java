package kcy;

public class Programmers_push_the_keypad {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(solution(numbers, hand));
		
	}
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int last_right = -1;
        int last_left = -1;
        int space_left = 0;
        int space_right = 0;
        String space_hand = "";
        
        if(hand.equals("right")) {
        	space_hand = "R";
        } else {
        	space_hand = "L";
        }
        
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		last_left = numbers[i];
        	} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		last_right = numbers[i];
        	} else if(numbers[i] == 2) {
        		
        		if(last_left == 1) {
        			space_left = 1;
        		} else if(last_left == 2) {
        			space_left = 0;
        		} else if(last_left == 4) {
        			space_left = 2;
        		} else if(last_left == 5) {
        			space_left = 1;
        		} else if(last_left == 7) {
        			space_left = 3;
        		} else if(last_left == 8) {
        			space_left = 2;
        		} else if(last_left == 0) {
        			space_left = 3;
        		} else {
        			space_left = 4;
        		}
        		
        		if(last_right == 3) {
        			space_right = 1;
        		} else if(last_right == 2) {
        			space_right = 0;
        		} else if(last_right == 6) {
        			space_right = 2;
        		} else if(last_right == 5) {
        			space_right = 1;
        		} else if(last_right == 9) {
        			space_right = 3;
        		} else if(last_right == 8) {
        			space_right = 2;
        		} else if(last_right == 0) {
        			space_right = 3;
        		} else {
        			space_right = 4;
        		}
        		
        		if(space_left < space_right) {
        			answer += "L";
        			last_left = numbers[i];
        		} else if(space_left > space_right) {
        			answer += "R";
        			last_right = numbers[i];
        		} else {
        			answer += space_hand;
        			if(space_hand.equals("L")) {
        				last_left = numbers[i];
        			} else {
        				last_right = numbers[i];
        			}
        		}
        		
        	} else if(numbers[i] == 5) {
        		
        		if(last_left == 1) {
        			space_left = 2;
        		} else if(last_left == 2) {
        			space_left = 1;
        		} else if(last_left == 4) {
        			space_left = 1;
        		} else if(last_left == 5) {
        			space_left = 0;
        		} else if(last_left == 7) {
        			space_left = 2;
        		} else if(last_left == 8) {
        			space_left = 1;
        		} else if(last_left == 0) {
        			space_left = 2;
        		} else {
        			space_left = 3;
        		}
        		
        		if(last_right == 3) {
        			space_right = 2;
        		} else if(last_right == 2) {
        			space_right = 1;
        		} else if(last_right == 6) {
        			space_right = 1;
        		} else if(last_right == 5) {
        			space_right = 0;
        		} else if(last_right == 9) {
        			space_right = 2;
        		} else if(last_right == 8) {
        			space_right = 1;
        		} else if(last_right == 0) {
        			space_right = 2;
        		} else {
        			space_right = 3;
        		}
        		
        		if(space_left < space_right) {
        			answer += "L";
        			last_left = numbers[i];
        		} else if(space_left > space_right) {
        			answer += "R";
        			last_right = numbers[i];
        		} else {
        			answer += space_hand;
        			if(space_hand.equals("L")) {
        				last_left = numbers[i];
        			} else {
        				last_right = numbers[i];
        			}
        		}
        		
        	} else if(numbers[i] == 8) {
        		
        		if(last_left == 1) {
        			space_left = 3;
        		} else if(last_left == 2) {
        			space_left = 2;
        		} else if(last_left == 4) {
        			space_left = 2;
        		} else if(last_left == 5) {
        			space_left = 1;
        		} else if(last_left == 7) {
        			space_left = 1;
        		} else if(last_left == 8) {
        			space_left = 0;
        		} else if(last_left == 0) {
        			space_left = 1;
        		} else {
        			space_left = 2;
        		}
        		
        		if(last_right == 3) {
        			space_right = 3;
        		} else if(last_right == 2) {
        			space_right = 2;
        		} else if(last_right == 6) {
        			space_right = 2;
        		} else if(last_right == 5) {
        			space_right = 1;
        		} else if(last_right == 9) {
        			space_right = 1;
        		} else if(last_right == 8) {
        			space_right = 0;
        		} else if(last_right == 0) {
        			space_right = 1;
        		} else {
        			space_right = 2;
        		}
        		
        		if(space_left < space_right) {
        			answer += "L";
        			last_left = numbers[i];
        		} else if(space_left > space_right) {
        			answer += "R";
        			last_right = numbers[i];
        		} else {
        			answer += space_hand;
        			if(space_hand.equals("L")) {
        				last_left = numbers[i];
        			} else {
        				last_right = numbers[i];
        			}
        		}
        		
        	} else if(numbers[i] == 0){
        		
        		if(last_left == 1) {
        			space_left = 4;
        		} else if(last_left == 2) {
        			space_left = 3;
        		} else if(last_left == 4) {
        			space_left = 3;
        		} else if(last_left == 5) {
        			space_left = 2;
        		} else if(last_left == 7) {
        			space_left = 2;
        		} else if(last_left == 8) {
        			space_left = 1;
        		} else if(last_left == 0) {
        			space_left = 0;
        		} else {
        			space_left = 1;
        		}
        		
        		if(last_right == 3) {
        			space_right = 4;
        		} else if(last_right == 2) {
        			space_right = 3;
        		} else if(last_right == 6) {
        			space_right = 3;
        		} else if(last_right == 5) {
        			space_right = 2;
        		} else if(last_right == 9) {
        			space_right = 2;
        		} else if(last_right == 8) {
        			space_right = 1;
        		} else if(last_right == 0) {
        			space_right = 0;
        		} else {
        			space_right = 1;
        		}
        		
        		if(space_left < space_right) {
        			answer += "L";
        			last_left = numbers[i];
        		} else if(space_left > space_right) {
        			answer += "R";
        			last_right = numbers[i];
        		} else {
        			answer += space_hand;
        			if(space_hand.equals("L")) {
        				last_left = numbers[i];
        			} else {
        				last_right = numbers[i];
        			}
        		}
        		
        	}
        }
        return answer;
    }

}
