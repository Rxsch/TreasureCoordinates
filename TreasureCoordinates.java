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
    boolean isValid=0;
//Main
    public static void main(String[] args)
{
//Boolean variable that checks if the number can be splitted into decimal

    

 
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

    //Returns the ArrayList of results
    return processedDigitsList;
}


  //This funcion will split the newList into all the possible combinations.

 public String listSpliter(String list){
    String result;
    //Iterate throught the list without parenthesis and make all the combination possibilities
    for(int i=0;i<list.length();i++){
        
        String leftPart= list.substring(i);
        String rightPart=list.substring(i+1, list.length()-1);
    }
result=leftPart+rightPart; //I dont know if this part is right but this is how I would do it
    
  //decimalGenerator
 }

 /*This function will put a decimal in all available spaces*/
 public String decimalGenerator(String list)
 {
//It is more than one number. Add a decimal
 if(list.length()>0)
 {
isValid=true;
 }
 if(isValid)
 {
//Start adding decimals
 }

 }
}

