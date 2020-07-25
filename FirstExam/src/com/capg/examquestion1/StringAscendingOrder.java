package com.capg.examquestion1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StringAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"Radhika","bhagya","Manogna"};
		Arrays.sort(a, (x,y)->Integer.compare(x.length(), y.length()));
		System.out.println(Arrays.deepToString(a));
}
}