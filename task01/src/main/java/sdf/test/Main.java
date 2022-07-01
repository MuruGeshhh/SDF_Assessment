package sdf.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 1) convert csv to matrix
   2) ask user for row number 
   3) read text file and convert it to string
   3) use streams to filer the _ labels and replace it with conents from matrix using given user input 
    */





    public class Main {
    public static void main( String[] args ) throws IOException{
       
           String csv = args[0];
           String txt = args[1];
           
      //*reading from csv file and convert it in to array
      
       Console cons = System.console();
       String input = cons.readLine("> enter numerical row number to fill template :\n");
        int rownum = Integer.parseInt(input);

           
          // Converting the excel file to a 2D matrix
                String fileName = csv;
                List<List<String>> list = new ArrayList<List<String>>();
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line = br.readLine();
                String[] clean = line.split(",");   
                for(String header: clean) {
                    List<String> subList = new ArrayList<String>();  
                    subList.add(header);
                    list.add(subList);
                }
                while((line = br.readLine()) != null) {
                    String[] elems = line.split(",");
                    for(int i = 0; i < elems.length; i++) {
                        list.get(i).add(elems[i]);
                    }
                }
                br.close();
                int rows = list.size();
                int cols = list.get(0).size();
                String[][] array2D = new String[rows][cols];
                for(int row = 0; row < rows; row++) {
                    for(int col = 0; col < cols; col++) {
                        array2D[row][col] = list.get(row).get(col);
                    }
                }

                System.out.println("the name on the row selected =\n" + array2D[0][rownum]);
                
                
                
                //reading and taking extracting data from txt file
            
                
                List<String> lines = Files.readAllLines(Paths.get(txt));

                System.out.println(lines);

         
         // replacing the words that contain _ with the 2d array value
                /*    lines.replaceAll(person -> person
                                .replaceFirst("", array2D[0][rownum])
                                .replaceFirst("_.*$", ""));   
                                */ 
                                


                
                   

                
               
               
                

           


            
                 
              

                
                
                
                     
                   






                    




                }
                 
                   
               }
            
        

            
            

            
        
           
    


