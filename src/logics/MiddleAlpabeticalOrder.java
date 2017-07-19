package logics;

import java.util.Scanner;

class MiddleAlpabeticalOrder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.next();
		char s[] = input.toCharArray();
		char temp = 0;
		for (int index1 = 2; index1 < s.length; index1++) {
			for (int index2 = index1; index2 < s.length-2; index2++) {
				if (s[index2] < s[index1]) {
					temp = s[index1];
					s[index1] = s[index2];
					s[index2] = temp;
				}
			}
		}
		for (int index3 = 0; index3 < s.length; index3++) {
			System.out.println(s[index3]);
		}
		sc.close();
	}
}
