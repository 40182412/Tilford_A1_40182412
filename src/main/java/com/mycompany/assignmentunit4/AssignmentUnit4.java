/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentunit4;
import java.util.Scanner;
/**
 *
 * @author 40182412
 */
public class AssignmentUnit4 {

     public static void main(String[] args) {

       
        Scanner s = new Scanner (System.in);
        String[] months = new String[12];
        int[] temp1 = new int[12];
         int[] temp2 = new int[12];
         String SearchName;
/** table **/

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

        temp1[0] = 8;
        temp1 [1] = 9;
        temp1[2] = 12;
        temp1[3] = 16;
        temp1[4] = 18;
        temp1[5] = 22;
        temp1[6] = 24;
        temp1[7] = 22;
        temp1[8] = 20;
        temp1[9] = 16;
        temp1[10] = 12;
        temp1[11] = 9;
        
                
        temp2[0] = 8;
        temp2 [1] = 8;
        temp2[2] = 12;
        temp2[3] = 17;
        temp2[4] = 19;
        temp2[5] = 20;
        temp2[6] = 23;
        temp2[7] = 22;
        temp2[8] = 19;
        temp2[9] = 16;
        temp2[10] = 10;
        temp2[11] = 8;

for (int i=0; i<12; i++) {
     System.out.println("months" + " " + months[i]  + " " + "2023 :" +  temp1[i] +" " + "2024 :" +  temp2[i]);
}

System.out.println("Please enter a particular month to seach (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov and Dec) :");
SearchName = s.next();


for (int i=0; i<12; i++) {
    if(SearchName.equals (months[i])){
       System.out.println(months[i] + " " + "2023:" + " "+ temp1[i] + " " + "2024:" + " "+ temp2[i]); 
    }

}



 
 
         
 
       


    }  
}


