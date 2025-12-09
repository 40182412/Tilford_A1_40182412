/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tilford_a1_40182412;

/**
 *
 * @author 40182412
 */
public class Tilford_A1_40182412 {

    
   static int [] list1 = {2, 8, 5, 3,9, 4, 1};
    public static void main(String[] args) {
        
        for (int i=0; i<list1.length; i++){
            System.out.println(list1[i]);
        }
        
         for (int i=0; i<list1.length-1; i++){
            if (list1[i]>list1[i+1]){
                int temp = list1[i];
                list1[i] = list1[i+1];
                list1[i+1] = temp;
            }
            System.out.println(list1[i]+",");
        
        }
         
        
        }
        
        
        
        
        
        
   
}
