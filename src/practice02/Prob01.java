package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] check=new int[MONEYS.length];
		Scanner sc=new Scanner(System.in);
		int money;
		System.out.print("money:");
		money=sc.nextInt();
		for(int i=0;i<MONEYS.length;i++)
		{
			check[i]=money/MONEYS[i];
			money%=MONEYS[i];
		}
		
		for(int i=0;i<MONEYS.length;i++)
		{
			System.out.println(MONEYS[i]+"원 :"+check[i]+"개");
		}
		
	}

}
