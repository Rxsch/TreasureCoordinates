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
    //Boolean variable that checks if the number can be splitted into decimal
    boolean isValid=false;
//Main
    public static void main(String[] args)
{


    

 
}
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
    This list will store all the possible combinations. Form (x,y)
    Each index will be a possible coordinate.
    */
    ArrayList <String> processedDigitsList=new ArrayList<>();
   ArrayList <String> intermediumList=new ArrayList<>();
    //listSplitter (newList, intermediumList)

    //Returns the ArrayList of results
    return processedDigitsList;
}


  //This funcion will split the newList into all the possible combinations.

 public void listSpliter(String list, ArrayList<String> results){
   
    //Iterate throught the list without parenthesis and make all the combination possibilities
    for(int i=1;i<list.length();i++){
        
        String leftPart= list.substring(0,i);
        String rightPart=list.substring(i, list.length());
    }
   
    //decimalGenerator Part
    ArrayList<String> xCoordinate=decimalGenerator(leftPart);
    ArrayList<String> yCoordinate=decimalGenerator(rightPart);  
 }

 /*This function will put a decimal in all available spaces*/
 public ArrayList<String> decimalGenerator(String list)
 {
    /*
    Create the array List where all the combinations with and 
    without decimals are going to be stored 
    */
    ArrayList<String> results = new ArrayList<>();
    
    //First store the possibilities without decimals
    results.add(list);
    
    //Activate flag if it is more than one number
 if(list.length()>0)
 {
isValid=true;
 }
 //Start adding decimals if it is more than one number
 if(isValid)
 {
/*Start at right of the first number and start adding ".". 
Increase the i position after each iteration
*/
 for(int i=1;i<list.length();i++)
 {
 stringWithDecimals=list.substring(0, i) + "." + list.substring(i);
 results.add(stringWithDecimals);
 }
 }
 return results; 
 }
}

