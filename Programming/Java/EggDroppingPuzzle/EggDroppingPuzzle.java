/*
 * Suppose you have N eggs and you want to determine from which floor in a K-floor building you 
 * can drop an egg such that it doesn't break. You have to determine the minimum number of attempts 
 * you need in order to find the critical floor in the worst case while using the best strategy.
 * There are few rules given below. 
	* An egg that survives a fall can be used again.
	* A broken egg must be discarded.
	* The effect of a fall is the same for all eggs.
	* If the egg doesn't break at a certain floor, it will not break at any floor below.
    * If the eggs breaks at a certain floor, it will break at any floor above.
 *
 * Time complexity of this function: O(N*K^2)
 * Space Complexity of this function: O(N*K) 
 */

package Hacktoberfest2020_.Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EggDroppingPuzzle {
    public static class Puzzle {

        // Function to calculate the minimum number of attemps
		public static int eggDrop(int eggs, int floors) {
			int eggFloor[][] = new int[eggs+1][floors+1];
			int res;
			
			for(int egg = 0; egg <= eggs; egg++) {
				eggFloor[egg][0] = 0;
				eggFloor[egg][1] = 1;
			}
			
			for(int floor = 1; floor <= floors; floor++) {
				eggFloor[1][floor] = floor;
			}
			
			for(int egg = 2; egg <= eggs; egg++) {
				for(int floor = 2; floor <= floors; floor++) {
					eggFloor[egg][floor] = Integer.MAX_VALUE;
					for(int x = 1; x <= floor; x++) {
						res = 1 + Math.max(eggFloor[egg-1][x-1], eggFloor[egg][floor-x]);
						
						if(res < eggFloor[egg][floor]) {
							eggFloor[egg][floor] = res;
						}
					}
				}
			}
			
			return eggFloor[eggs][floors];
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Taking the input for no. of eggs
		System.out.println("Enter the number of eggs: ");
		int eggs = Integer.parseInt(br.readLine());

		// Taking the input for no. of floors
		System.out.println("Enter the number of floors: ");
		int floors = Integer.parseInt(br.readLine());
		
		// Printing the output for the given inputs
		System.out.println("Minimum number of trials required: " + Puzzle.eggDrop(eggs, floors));
	}
}