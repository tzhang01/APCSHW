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

	 /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word,int row, int col){
		int column = col;		
		for(int i=0; i<word.length();i++){
			if(word.charAt(i)== data[row][column]|| data[row][column] != ' '){
				return false;
			}
			column++;
		}
		column = col;
		for(int i=0;i<word.length();i++){
			data[row][column] = word.charAt(i);
			column++;
		}
		return true;
	}
		
	//testing
	public static void main(String[]args){
		WordGrid data = new WordGrid(6,6);
		System.out.println("Should print out a grid of spaces" + data);
		System.out.println("Should print True: " + data.addWordHorizontal("cat",1,1));
		System.out.println(data);
		//System.out.println("Should print False: " + data.addWordHorizontal("cat",4,4));
	}
}
