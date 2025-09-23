/* Daniel Rangosch
Dr. Steinberg
COP3503 Fall 2025
Programming Assignment 2
*/
import java.util.*;
import java.util.ArrayList;
public class TreasureCoordinates {

	//Function to find all possible combinations adding a decimal
	public ArrayList<String> determineCoordinates(String rawDigits)
	{
		//Deletes the parenthesis of the parameter String
		String newList= rawDigits.substring(1,rawDigits.length() - 1);
		
		//Array List where all the combinations will be stored
		ArrayList <String> processedDigitsList=new ArrayList<>();

        //Process the array
		listSplitter (newList, processedDigitsList);
		
		return processedDigitsList;
	}


	//This funcion will split the newList into all the possible combinations.
	public void listSplitter(String list, ArrayList<String> processedDigitsList) 
    {

		//Iterate and make all the combination possibilities
		for(int i=1; i<list.length(); i++) 
        {

			String leftPart= list.substring(0,i);
			String rightPart=list.substring(i);

            //Add decimals
			ArrayList<String> xCoordinate=decimalGenerator(leftPart);
			ArrayList<String> yCoordinate=decimalGenerator(rightPart);

			//Combine results into a coordinate
			for (int j = 0; j < xCoordinate.size(); j++) 
            {
				for (int k = 0; k < yCoordinate.size(); k++) 
                {
					String x = xCoordinate.get(j);
					String y = yCoordinate.get(k);
					processedDigitsList.add("(" + x + ", " + y + ")");
				}
			}
		}
	}

	//This function will put a decimal in all available spaces
	public ArrayList<String> decimalGenerator(String list)
	{
		//ArrayList to store all the results
		ArrayList<String> results = new ArrayList<>();

		//Checks if the number can be splitted into decimal 
		boolean isValid= list.length() >1;

		//Removes irrelevant ceroes 
		if(list.charAt(0)== '0') 
        {
			if(list.length()==1) 
            {
				results.add("0");
			}
			else if(list.charAt(list.length() - 1) != '0') 
            {
				results.add("0."+ list.substring(1));
			}
			return results;
		}

//Part that handles regular cases without irrelevant 0's
//Start adding decimals if it is more than one number
		if(isValid)
		{
			//Start at right of the first number and add "."
			for(int i=1; i<list.length(); i++)
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