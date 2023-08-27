/**
 * We are tasked with developing a system that tracks the rainfall in a region for a year.
 * The total rainfall for each month is stored in a integer array. January's total rainfall
 * is stored in the first index position of the array, February's total rainfall is in the
 * second index position of the array, etc.  
 * 
 * Because our RainfallTracker will be used by another system, we must use the methods exactly as defined
 * 
 */
package assignment;

import java.util.Scanner;

public class RainfallTracker {
    
    public static void main(String[] args) {
        //Main is only for testing your code. 
        //We will test your assignment on a (set of) different data, so it is NOT sufficient to simply return these results in all cases!
        /*
         * Data you can use to test your assignment
         * data1: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
         * data2: 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
         * data3: 15, 20, 8, 0, 12, 30, 5, 22, 12, 7, 10, 2
         */
        addRainfallData();
        System.out.println("The average rainfall for the year was "+averageRainfall()+" inches."); //answers: data1:6.5 , data2:6.5 , data3:11.91666....
        System.out.println("The lowest rainfall recorded for any month was "+lowestRainfallAmount()+" inches");//answers: data1:1 , data2:1 , data3:0
        System.out.println("The name of the month with the lowest recorded rainfall was "+lowestRainfallMonth());//answers: data1:January , data2:December, data3:April
        System.out.println("The highest rainfall recorded for any month was "+highestRainfallAmount()+" inches");//answers: data1:12 , data2:12 , data3:30
        System.out.println("The name of the month with the highest recorded rainfall was "+highestRainfallMonth());//answers: data1:December , data2:January, data3:June
    }
    
    /**
     * This method computes the average rainfall for the year. Use a for loop
     * Recall that average is the sum of the array values divided by the number (count) of values.  
     * @return a double for the computed average
     */
    public static double averageRainfall() {
        return -1.0;
    }
    
    /**
     * This method finds the smallest value in the rainfall array
     * @return the integer of the lowest rainfall in the array  
     * NOTE: Assume that the values in the array are all unique 
     */
    public static int lowestRainfallAmount() {
       return -1;
    }
    
    /**
     * This method finds the name of the month that matches the smallest value in the rainfall array
     * @return the name of the month with the lowest rainfall in the array. 
     * NOTE: Assume that the values in the array are all unique 
     */
    public static String lowestRainfallMonth() {
        return null;
    }

    /**
     * This method finds the largest value in the rainfall array
     * @return the integer of the largest rainfall in the array  
     * NOTE: Assume that the values in the array are all unique 
     */
    public static int highestRainfallAmount() {
        return -1;
    }
    
    /**
     * This method finds the name of the month that matches the largest value in the rainfall array
     * @return the name of the month with the largest rainfall in the array. 
     * NOTE: Assume that the values in the array are all unique 
     */
    public static String highestRainfallMonth() {
        return null;
    }

    /**
     * This method adds rainfall values to the array. Using a while loop
     * - present the message, e.g. "Please enter an integer for the rainfall data for January or enter x to stop"
     * - get the input from the console, if it is "x" then the loop stops and false is returned. Otherwise store the integer value in the array
     * - end the loop when 12 integers have been added to the array, return true.
     *  
     * @return true if a value was given for all 12 months, return false use enter x to stop
     */
    public static boolean addRainfallData() {
        return false;
    }

}