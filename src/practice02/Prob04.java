package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] org=str.toCharArray();
		int len=str.length();
		char[] reversed=new char[len];
		for(int i=0;i<len;i++)
		{
			reversed[i]=org[len-1-i];
		}
		return reversed;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(new String(array));
	}
}
