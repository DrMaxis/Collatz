/**
 * 
 */
package Math;

import java.util.Scanner;

/**
 * @author nathanasamani-antwi
 *
 */
public class InverseConjecture {
	private static int inputSteps;
	private static boolean gotNumber = false;
	static int steps;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Input the Number of Steps");
		inputSteps = new Scanner(System.in).nextInt();
		System.out.println("Looking for a Number with " + inputSteps + " Number of Steps");
		int startingNumber = 0;
		while(!gotNumber){
			Thread.sleep(100);
			steps = 0;
			startingNumber++;
			System.out.println("Current Start Number is "+ startingNumber);
			
			int y = getEQNumber(startingNumber);
			System.out.println(y);
			for(int z = 0; z <= inputSteps; z++){
				
				if(y == 1){
					if(steps == inputSteps){
						System.out.println(steps);
						System.out.println("The Correct Number is " + startingNumber);
						gotNumber = true;
					} else {
						
					}
				} else {
					y = getEQNumber(y);
					System.out.println(y);
				}
				
			}
			
			
			
			
			
		}
		
	}
	
	
	private static int getEQNumber(int i){
		steps++;
		 if ( i % 2 == 0 ){
	         System.out.println("You entered an even number.");
		 	return ifEven(i);
		 }
	      else {
	         System.out.println("You entered an odd number.");
	         return ifOdd(i);
	      }
	   }
	
	private static int ifOdd(int i){
		return i * 3 + 1;
	}
	
	private static int ifEven(int i){
		return i/2;
	}
	
	
	
		
	}

		/*
		System.out.println("Please imput the number of steps you want to get the starting"
				+ " Number for :D");
		steps = new Scanner(System.in).nextInt();
		System.out.println(inSteps + " is the number of steps we got?");
		
		int startNumber = 1;
		int eqNum = 1;
		while(!solution){
			
			
			
			while(!solution){
				eqNum = testing(eqNum);
				System.out.println(eqNum);
				startNumber++;
				eqNum++;
				inSteps = 0;
				if(eqNum == 1){
					if(inSteps == steps){
						System.out.println(" STOP! ITS " + startNumber);
						solution = true;
					} else {
						System.out.println("Didn't get required Steps of " + steps + "|" + inSteps);
						System.out.println(startNumber + " IS OUR STARTING NUMBER NOW");
						inSteps = 0;
					}
				}
			}
			
			
			
			
			
		}
		
		

	}

	public static int testing(int i){
		if(i != 0){ // Remove if need Speed
			inSteps++;
		if((i & 1) == 0){
			System.out.println("Even number");
			return ifEven(i);
			} else {
				if(!((i & 1) == 0)){
					System.out.println("Odd Number");
					return ifOdd(i);
				} 
			}
		} // Remove if need Speed
		else {
			System.out.println("Can't Input 0!");
			solution = true;
			return (Integer) null;
		}
		return (Integer) null;
	}
	
	public static int ifOdd(int i){
		return 3 * i + 1;
		
	}
	
	public static int ifEven(int i){
		return i / 2;
	}
	*/
