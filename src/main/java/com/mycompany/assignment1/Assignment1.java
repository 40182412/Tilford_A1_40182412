/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;
import java.util.Scanner;
/**
 *
 * @author 40182412
 */
public class Assignment1 {

        public static void main(String[] args) {
 
       
        Scanner s = new Scanner (System.in);
        String[] months = new String[12];// variable for month
        int[] temp2023 = new int[12]; //variable for tempurate in 2023
        int[] temp2024 = new int[12];//variable for tempurate in 2024
        String SearchName; //variable for linearsearch for user to enter data to be stored here.
        int year2023 = 0; //variable created for average calculation this are will store the total and then divide by 12.
        int year2024 = 0;//variable created for average calculation this are will store the total and then divide by 12.

    /** Arrays for months **/
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        months[4] = "May";
        months[5] = "Jun";
        months[6] = "Jul";
        months[7] = "Aug";
        months[8] = "Sep";
        months[9] = "Oct";
        months[10] = "Nov";
        months[11] = "Dec";
        
    /**Arrays for temperature 2023**/
        temp2023[0] = 8;
        temp2023 [1] = 9;
        temp2023[2] = 12;
        temp2023[3] = 16;
        temp2023[4] = 18;
        temp2023[5] = 22;
        temp2023[6] = 24;
        temp2023[7] = 22;
        temp2023[8] = 20;
        temp2023[9] = 16;
        temp2023[10] = 12;
        temp2023[11] = 9;
        
    /** Arrays for temperature 2024**/
        temp2024[0] = 8;
        temp2024[1] = 8;
        temp2024[2] = 12;
        temp2024[3] = 17;
        temp2024[4] = 19;
        temp2024[5] = 20;
        temp2024[6] = 23;
        temp2024[7] = 22;
        temp2024[8] = 19;
        temp2024[9] = 16;
        temp2024[10] = 10;
        temp2024[11] = 8;
 
    /** displaying the months and temperature accordingly to the data provided **/      
    for (int i=0; i<12; i++) {
     System.out.println("months" + " " + months[i]  + " " + "2023 :" +  temp2023[i] +" " + "2024 :" +  temp2024[i]);
    }
 
    /** Asking user which particular month they want to search  **/
    System.out.println("Please enter a particular month to seach (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov and Dec) :");
    SearchName = s.next();//user input is stored in variable SearchName
 
    /** Linear search **/
    for(int i=0; i<12; i++) {
        if(SearchName.equals (months[i])){
       System.out.println(months[i] + " " + "2023:" + " "+ temp2023[i] + " " + "2024:" + " "+ temp2024[i]); //displays the month and the corresponding temperature for what the user asked for.
    }
 
    }
    /** To calculate average **/
    for (int i=0; i<12; i++){
    year2023 = year2023 + temp2023[i];// to calculate the total of all the numbers by adding up all the numbers in 2023.
    year2024 = year2024 + temp2024[i];// to calculate the total of all the numbers by adding up all the numbers in 2024.
    }
 
    double avg2023 = year2023/12.0;//calculating the average by the total and dividing by the total of months.
    double avg2024 = year2024/12.0;//calculating the average by the total and dividing by the total of months.
 
    System.out.println("Average temperature for 2023: " + avg2023);//displays average for 2023
    System.out.println("Average temperature for 2024: " + avg2024);//displays average for 2024

 
    }  
}
