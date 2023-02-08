/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallestvalue;

/**
 *
 * @author alexc
 */
 import java.util.Scanner;

public class SmallestValue 
{
   private int values; 
   private int number; 
   private int smallest; 

   public void inputValues()
   {
      System.out.print( "Enter the number of integer values to compare: " );

      Scanner input = new Scanner( System.in );
      values = input.nextInt();

      for ( int i = 1; i <= values; i++ )
      {
         System.out.printf( "Enter an integer for value %d: ", i ); 
         number = input.nextInt();

         if ( i == 1 )
            smallest = number; 
         else
            if ( number < smallest )
               smallest = number; 
      }
   }

   public void displaySmallest()
   {
      System.out.printf( "\nThe smallest integer is %d\n\n", smallest );
   }
}

