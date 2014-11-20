import java.util.*;

public class WordGrid{
    private char[][]data;
	
	/**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows, int cols){
		data = new char [rows][cols];
		clear();
    }
	
	//default constructor initializes a 5x5 grid
	public WordGrid(){
		this(5,5);
	}
	
	/**Set all values in the WordGrid to spaces ' '*/
	public void clear(){
		for(int i=0; i<data.length;i++){
			for(int j=0; j<data[i].length; j++){
				data[i][j] = ' ';
			}
		}
	}

	/**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
	public String toString(){
		String result = "";
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				result += data[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
		
	//testing
	public static void main(String[]args){
		WordGrid data = new WordGrid(6,6);
		System.out.println("Should print out a grid of spaces" + data);
	}
}
