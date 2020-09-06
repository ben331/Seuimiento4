package ui;

import java.util.Scanner;

import model.*;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner reader = new Scanner(System.in);
		
		BST<String, Person> tree = new BST<>();
		
		System.out.println("Number of persons: ");
		int n = reader.nextInt();
		reader.nextLine();
		
		
		Person person;
		String name;
		String id;
		
		for(int i=0; i<n ; i++) {
			System.out.println("Person ("+(i+1)+"). Name: ");
			name = reader.nextLine();
			System.out.println("Person ("+(i+1)+"). Id: ");
			id = reader.nextLine();
			
			person = new Person(name, id);
			tree.insertE(id, person);
		}
		System.out.println("Size: "+tree.getSize());
		System.out.println("Height: "+tree.getHeight());
		System.out.println("\nInorden: ");
		System.out.println(tree.inOrden());
		System.out.println("\nPreOrden: "+tree.preOrden());
		System.out.println("\nPostOrden: "+tree.postOrden());
		
		reader.close();
	}
}
