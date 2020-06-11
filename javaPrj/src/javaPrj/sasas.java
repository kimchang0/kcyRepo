package javaPrj;

public class sasas {
public static void main(String[] args) {
	long n=10;
	long m=30;
	long answer=fact(m)/fact(n);
	System.out.println(answer);
}
public static long fact(long n) {

	if (n == 1)

		return n;

	else 

		return fact(n-1) * n;

}

}
