package factory;

import java.util.Arrays;

// Class responsible for creating a queue;

public class QueueGenerator {
	// the new queue is a array of string 'animalQueue';
	private String[] animalQueue;

	private int queueSize;
	private int queueFront = 0;
	private int queueRear = 0;
	private int queueItems = 0;

	// Constructor of the class, takes the queue size as a parameter to start a new
	// queue;
	public QueueGenerator(int size) {

		queueSize = size;

		// creating a new queue as a array of Strings of the same saze as the parameter
		// sent;
		animalQueue = new String[queueSize];

		// fills all the array 'animalQueue' with a value '-1';
		Arrays.fill(animalQueue, "-1");

	}

	// Method responsible for adding new elements to the queue
	public void insertToQueue(String input) {

		// keeps adding new elements until filling the array size 'queueSize';
		if (queueItems + 1 <= queueSize) {
			// Insert new element to the position 0 of the array;
			animalQueue[queueRear] = input;
			// add to the rear, so now the rear is 1
			// so next time that an element is added to the queue,
			// it will be added 'behind' the previous element;
			queueRear++;
			// add to the number of items in the queue
			// when the number of items gets to the queue size, the loop stops adding;
			queueItems++;

		} else {
			// If the number of items is equal to the size of the queue,
			// and the user wants to add more, this message is shown;
			System.out.println("Queue is full!");
		}

	}

	// Method responsible for displaying the contents of the queue from 0 to
	// queueSize;
	public void display() {
		for (int i = 0; i < queueSize; i++) {
			System.out.println(i + 1 + " " + animalQueue[i]);
		}
	}

	// Method responsible for removing the first element of the queue;
	public void removeFromQueue() {
		// loop checks if the queue has any elements;
		if (queueItems > 0) {
			// Removes the first element and shows this message in its place 'Pet has been
			// taken care of.';
			animalQueue[queueFront] = "Pet has been taken care of.";
			// now the front of the queue is the next element;
			queueFront++;
			// print the new front
			System.out.println(animalQueue[queueFront]);
			// deducts the number of elements by 1;
			queueItems--;
		} else {
			// if queue has no more elemetens, prints this message;
			System.out.println("Queue is empty!");
		}

	}
}
