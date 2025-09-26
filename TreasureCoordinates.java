/* Daniel Rangosch
 * Dr. Steinberg
 * COP3503 Fall 2025
 *Programming Assignment 2
 */
import java.util.*;
public class TreasureCoordinates
{

	//Function to find all possible combinations adding a decimal
	public ArrayList<String> determineCoordinates(String rawDigits)
	{
		//Removes the parenthesis of the parameter String
		String newList= rawDigits.substring(1,rawDigits.length() - 1);

		//ArrayList where all the combinations will be stored
		ArrayList <String> processedDigitsList=new ArrayList<>();

		//Process the array
		listSplitterRecursive(newList,1, processedDigitsList);
		
		return processedDigitsList;
	}

	//This funcion splits the newList into all the possible combinations.
	public void listSplitterRecursive(String list, int commaPos, ArrayList<String> processedDigitsList)
	{
		//Base case
		if(commaPos >= list.length())
		{
			return;
		}
		//Split into left and right partss
		String leftPart= list.substring(0,commaPos);
		String rightPart=list.substring(commaPos);

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

		listSplitterRecursive(list, commaPos+1, processedDigitsList);

	}

	//This function will put a decimal in all available spaces
	public ArrayList<String> decimalGenerator(String list)
	{
		ArrayList<String> results = new ArrayList<>();

		// Case only 0
		if (list.charAt(0) == '0') {
			if (list.length() == 1) {
				results.add("0");
			}
			//Case 0.0001
			else if (list.charAt(list.length() - 1) != '0') {
				results.add("0." + list.substring(1));
			}
			return results;
		}

		//Part that handles regular cases
		if (list.length() > 1) {
			for (int i = 1; i < list.length(); i++) {
				String rightPart = list.substring(i);

				// Check if all numbers are zeros
				boolean allZeros = true;
				for (int j = 0; j < rightPart.length(); j++) {
					if (rightPart.charAt(j) != '0') {
						allZeros = false;
						break;
					}
				}

				// If all numbers are not zero and the last number is not zero, add.
				if (!allZeros && rightPart.charAt(rightPart.length() - 1) != '0') {
					String stringWithDecimals = list.substring(0, i) + "." + rightPart;
					results.add(stringWithDecimals);
				}
			}
		}

		// Add number without decimals as option
		results.add(list);
		return results;
	}
}