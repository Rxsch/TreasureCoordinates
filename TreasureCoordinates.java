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
//Main
    public static void main(String[] args)
{
//Boolean variable that checks if the number can be splitted into decimal
boolean isValid=0;
    

 
}
    /*
    This function takes a String of digits in between parenthesis and
    uses backtracking to find all possible combinations adding a decimal 
    point without changing the order
    */
    public ArrayList<String> determineCoordinates(String rawDigits)
{
    //This takes out the parenthesis of the parameter String
    String newList= rawDigits.substring(1,rawDigits.length());
    
    /*
    This list will store all the possible combinations. Form (x,y)
    Each index will be a possible coordinate.
    */
    ArrayList <String> processedDigitsList=new ArrayList<>();

    //Returns the ArrayList of results
    return processedDigitsList;
}

/*
 * This funcion will split the newList into all the possible combinations.
 */
 public String listSpliter(String list){

 }
}

