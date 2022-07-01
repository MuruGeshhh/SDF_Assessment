package sdf.test;

import java.util.Arrays;

public class Avg {
    String avr; // string average

    

    public static float average(String[] r){

        
             
      /*filter out the numbers at the back and place it into
      and int array */
        for(int i =0 ; i<r.length ; i++){
        int[] values = Arrays.stream(r[i])
                        .mapToInt(Integer::parseInt)
                        .toArray();
 
        String s = Arrays.toString(values);
        }
    

    // default sium value.
    float sum = 0;
 
    // sum of all values in array using for loop
    for (int i = 0; i < r.length; i++) {
        sum += values[i];
    }

    if (sum /r.length == 0){
    
       float avg = sum/r.length;
       


       

    }

    else if  (! (sum /r.length == 0)){

        float avg = sum/r.length;
        
        
    }
         
    
    return avg ;
  }
    }
        
    
    
