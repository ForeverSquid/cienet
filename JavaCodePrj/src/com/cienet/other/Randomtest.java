package com.cienet.other;

import java.util.Random;

public class Randomtest {
	
	static Random rd = new Random();

	public static void main(String[] args) {
		numRandon();
		charRandon();
		chineseRandon();
		mixRandon();
	}

	public static void numRandon() {
		for (int i = 0; i < 5; i++) {
			int n = rd.nextInt(10);
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void charRandon() {
		for (int i = 0; i < 5; i++) {
			int n = 65 + rd.nextInt(58);
			System.out.print((char) n + " ");
		}
		System.out.println();
	}

	public static void chineseRandon() {
		for (int i = 0; i < 5; i++) {
			int n = 20000 + rd.nextInt(10000);
			System.out.print((char) n + " ");
		}
		System.out.println();
	}

	public static void mixRandon() {
		for (int i = 0; i < 5; i++) {//
			int n = rd.nextInt(123);
			if (n < 65) {
				System.out.print(n % 10 + " ");
			} else {
				System.out.print((char) n + " ");
			}
		}
	}
}
