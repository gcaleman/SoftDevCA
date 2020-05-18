package main;

import java.util.Arrays;

public class QueueGenerator {

	private String[] animalQueue;


	private int queueSize;
	private int queueFront = 0;
	private int queueRear = 0;
	private int queueItems = 0;

	public QueueGenerator(int size) {

		queueSize = size;

		animalQueue = new String[queueSize];


		Arrays.fill(animalQueue, "-1");


	}
	
	public void insertToQueue(String input) {
		
		
		if (queueItems + 1 <= queueSize) {
			
			animalQueue[queueRear] = input;
			
			System.out.println(+ (queueRear + 1)  +" " + animalQueue[queueRear]);
			
			
			queueRear++;
			
			queueItems++;
			
			
			
		} else {
			System.out.println("Queue is full!");
		}
		
	}
	
	public void removeFromQueue() {
		
		if (queueItems > 0) {
			animalQueue[queueFront] = "-1";
			
			
			
			queueFront++;
			
			System.out.println(animalQueue[queueFront]);
			
			queueItems--;
		} else {
			System.out.println("Queue is empty!");
		}
		
	}
	
	public void peek() {
		
		System.out.println("The first element of the queue is " + animalQueue[queueFront]);
		
	}

public void displayTheQueue(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < queueSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < queueSize; n++){
			
			
			if(animalQueue[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", animalQueue[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		// Number of spaces to put before the F
		
		int spacesBeforeFront = 3*(2*(queueFront+1)-1);
		
		for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
		
		System.out.print("F");
		
		// Number of spaces to put before the R
		
		int spacesBeforeRear = (2*(3*queueRear)-1) - (spacesBeforeFront);
		
		for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
		
		System.out.print("R");
		
		System.out.println("\n");
	
}
	
}
