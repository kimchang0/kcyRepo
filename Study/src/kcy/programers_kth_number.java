package kcy;

import java.util.Arrays;

public class programers_kth_number {

	public static void main(String[] args) {

		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int [commands.length];
		
			
		for(int i = 0; i < commands.length; i++) {
			int x = commands[i][0];
			int y = commands[i][1];
			int z = commands[i][2] - 1;
			int[] place = {};
			int num = 0;
			for(int j = x-1; j <= y-1; j++) {
				num++;
			}
			place = new int [num];
			num = 0;
			for(int j = x-1; j <= y-1; j++) {
				place[num] = array[j];
				System.out.println(place[num]);
				num++;
			}
			Arrays.sort(place);
			
			answer[i] = place[z];
			System.out.println("¾Æ·¡ place["+ z + "]: " + place[z]);
			System.out.println("answer[" + i + "] : " + answer[i]);
		}
		
		
		
		
	}

}
