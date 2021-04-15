package kcy;

public class Programers_find_kim_in_seoul {

	public static void main(String[] args) {

		String[] arr = {"bright", "Kim","fin"};
		System.out.println(solution(arr));
		
	}
	 public static String solution(String[] seoul) {
	        
	        int i = 0;
	        while(true){
	            if(seoul[i].equals("Kim")){
	                return "김서방은 " + i + "에 있다";
	            }
	            i++;
	        }
	    }
}
