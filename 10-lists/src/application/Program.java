package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Yellow");
		list.add("Blue");
		list.add("White");
		list.add("Red");
		list.add("Ocean blue");
		list.add("Orange");
		list.add("Black");
		list.add("Dark red");
		list.add("Dark green");
		
		list.add(4, "Light pink");
		
		System.out.println("List:");
		for(String color : list) {
			System.out.println(color);
		}
		
		System.out.println("\nList size: " + list.size());
		
		list.remove("Red");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'O');
		
		
		System.out.println("\n----------------------Updated List:");
		for(String color : list) {
			System.out.println(color);
		}
		System.out.println("\nList size: " + list.size());

		
		System.out.println("\nList of colors begining with B: ");
		List<String> colorsWithB = list.stream().filter(color -> color.charAt(0) == 'B').collect(Collectors.toList());
		for(String color : colorsWithB) {
			System.out.println(color);
		}
		
		System.out.println("\n--------------------------------------");
		System.out.println("Index of Yellow: " + list.indexOf("Light pink"));

		String firstColorWithD = list.stream().filter(color -> color.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println("First color begining with a D: " + firstColorWithD);
		
		
	}

}
