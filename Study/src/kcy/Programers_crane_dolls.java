package kcy;

import java.util.Stack;

public class Programers_crane_dolls {

	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}
	
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	int temp = 0;
    	for(int i = 0; i < moves.length; i++) {
    		for(int j = 0; j < board.length; j++) {
    			if(board[j][moves[i]-1] == 0) {
    				continue;
    			} else {
    				stack.push(board[j][moves[i]-1]);
    				temp = stack.peek();
    				break;
    			}
    		}
    	}
    	System.out.println(stack);

        return answer;
    }
}
