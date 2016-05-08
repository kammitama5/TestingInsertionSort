import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		//Ask the user to enter an integer number
		
				String SIZE = JOptionPane.showInputDialog("Please enter an integer number");
				
				final int SIZEArray = Integer.parseInt(SIZE);
				
				int[] myArray = new int [SIZEArray];
				
				Random rand = new Random();
				
				for (int i = 0; i < myArray.length; i ++)
				{
					myArray[i] = rand.nextInt(1000);
					//System.out.print(myArray[i] + " ");
					
				}
				
				
				
				
				PrintStream out = new PrintStream(new FileOutputStream("unsorted.txt", true));
				System.setOut(out);
				System.out.print("The array generated is: ");
				printArray1(myArray);
				PrintStream out1 = new PrintStream(new FileOutputStream("sorted.txt", true));
				System.setOut(out1);
				sort(myArray);
				System.out.print("The sorted array generated is: ");
				printArray1(myArray);
	}
				
// Sort algorithm
public static void printArray1(int[] array){
	for(int element : array) {
		System.out.print(element + " ");
	}
	System.out.println();
}

public static void sort(int[] array){
	
	for (int i = 1; i < array.length; i++){
		int j = i;
		while (j > 0 && array[j - 1] > array[j]){
			swap(array, j, j - 1);
			j--;
		}
		
	}
	
}

public static void swap(int[] array, int first, int second){
	int temp = array[first];
	array[first] = array[second];
	array[second] = temp;
	
}	
				public static void printArray(int[] array)
				{
					for(int index = 0; index < array.length; index++)
					{
						System.out.print((array[index]) + " ");
					}
				}

}
