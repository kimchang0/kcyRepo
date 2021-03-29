package kcy;

import java.util.Arrays;

public class programers_kth_number {

	public static void main(String[] args) {

		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int [100000];
		
			
		for(int i = 0; i < commands.length; i++) {
			int x = commands[i][0];
			int y = commands[i][1];
			int z = commands[i][2];
			int[] place = {};
			int num = 0;
			answer = new int [100000];
			place = new int [10000000];
			
			for(int j = x-1; j <= y-1; j++) {
				place[num] = array[j];
				System.out.println(place[num]);
				num++;
			}
			for(int w = 0; w < 3; w++) {
				System.out.println("place[" + w + "] : " + place[w]);
			}
			Arrays.sort(place);
			answer[i] = place[z];
			System.out.println("place["+ z + "]: " + place[z]);
			System.out.println("answer[" + i + "] : " + answer[i]);
		}
		
		
		
		
	}

}
