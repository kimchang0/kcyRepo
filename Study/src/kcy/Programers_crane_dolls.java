package kcy;

import java.util.Stack;

public class Programers_crane_dolls {

	public static void main(String[] args) {
		int[][] board = { 
				{0, 0, 1, 0, 0}, 
				{0, 0, 1, 0, 0}, 
				{0, 2, 1, 0, 0}, 
				{0, 2, 1, 0, 0},
				{0, 2, 1, 0, 0}
		}; 
		int[] moves = {1, 2, 3, 3, 2, 3, 1};
		System.out.println(solution(board, moves));
		
	}
	/*
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					stack.push(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		for (int i = 0; i < stack.size(); i++) {
			for (int j = 0; j < stack.size()-1; j++) {
				if (stack.elementAt(j) == stack.elementAt(j + 1)) {
					//System.out.println("j :" + j);
					//System.out.println("before remove: " + stack);
					stack.remove(j);
					//System.out.println("remove first: " + stack);
					stack.remove(j);
					//System.out.println("remove second: " + stack);
					answer+=2;
					//System.out.println("after remove: " + stack);
				}
			}

		}

		return answer;
	}
	*/
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] remove = new int[moves.length];
		int num = 0;

		for (int i : moves) {
			i = i - 1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != 0) {
					remove[num] = board[j][i];

					if (num - 1 >= 0 && remove[num] == remove[num - 1]) {
						answer += 2;
						remove[num - 1] = 0;
						remove[num] = 0;
						num -= 2;
					}

					board[j][i] = 0;
					num++;
					break;
				}
			}
		}
		return answer;
	}
}
