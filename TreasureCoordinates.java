/* Daniel Rangosch
Dr. Steinberg
COP3503 Fall 2025
Programming Assignment 2
*/
import java.util.*;
import java.util.ArrayList;
public class TreasureCoordinates{
   
    /*Input: (123)
    Output:
    (1, 2.3)
    (1, 23)
    (1.2, 3)
    (12, 3)
    */

    /*
    This function takes a String of digits in between parenthesis and
    uses backtracking to find all possible combinations adding a decimal 
    point without changing the order
    */
    public ArrayList<String> determineCoordinates(String rawDigits)
{
    //This takes out the parenthesis of the parameter String
    String newList= rawDigits.substring(1,rawDigits.length() - 1);
    
      /*
    Create the array List where all the combinations with and 
    without decimals are going to be stored.
    This list will store all the possible combinations. Form (x,y)
    Each index will be a possible coordinate.
    */
    ArrayList <String> processedDigitsList=new ArrayList<>();
   
   listSplitter (newList, processedDigitsList);
//Print for debugging purposes
   System.out.println("DEBUG: " + processedDigitsList);
    //Returns the ArrayList of results
    return processedDigitsList;
}


  //This funcion will split the newList into all the possible combinations.

 public void listSplitter(String list, ArrayList<String> processedDigitsList){
   
    //Iterate throught the list without parenthesis and make all the combination possibilities
    for(int i=1;i<list.length();i++){
        
        String leftPart= list.substring(0,i);
        String rightPart=list.substring(i);
    
   
    //decimalGenerator Part
    ArrayList<String> xCoordinate=decimalGenerator(leftPart);
    ArrayList<String> yCoordinate=decimalGenerator(rightPart);  

    //Combine results into a coordinate
    for (int j = 0; j < xCoordinate.size(); j++) {
    for (int k = 0; k < yCoordinate.size(); k++) {
        String x = xCoordinate.get(j);
        String y = yCoordinate.get(k);
        processedDigitsList.add("(" + x + ", " + y + ")");
    }
}
}
 }

 /*This function will put a decimal in all available spaces*/
 public ArrayList<String> decimalGenerator(String list)
 {  
    //ArrayList to store all the results 
    ArrayList<String> results = new ArrayList<>();

     /*Boolean variable that checks if the number can be splitted 
     into decimal because the number has two or more digits*/
    boolean isValid= list.length() >1;

    /*Part that removes irrelevant ceroes ex: 012 is not a valid result
     should be just 12*/
if(list.charAt(0)== '0'){
    if(list.length()==1){
        results.add("0");
    }
   else if(list.charAt(list.length() - 1) != '0'){
   results.add("0."+ list.substring(1));
   }
    return results;
}

//Delete zeroes at the end
if(list.charAt(list.length()-1) == '0')
{
results.add(list);
return results;
}

//Part that handles regular cases without 0's
 //Start adding decimals if it is more than one number
 if(isValid)
 {
/*Start at right of the first number and start adding ".". 
Increase the i position after each iteration
*/
 for(int i=1;i<list.length();i++)
 {
 String stringWithDecimals=list.substring(0, i) + "." + list.substring(i);
results.add(stringWithDecimals);
 }
 }
 //Store the possibilities without decimals
 results.add(list);
 return results; 
 }
}

