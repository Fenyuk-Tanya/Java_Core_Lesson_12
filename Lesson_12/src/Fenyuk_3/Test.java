package Fenyuk_3;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Lemon");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
		fruits.remove(0);
		fruits.remove(1);
		
		System.out.println(fruits);
	}

}
