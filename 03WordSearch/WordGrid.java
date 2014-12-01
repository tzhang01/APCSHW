import java.util.*;

public class WordGrid{
	// instance variables
    private char[][]data;
	Random rand = new Random();
	private ArrayList<String> wordBank = new ArrayList<String>();

	//constructors
    public WordGrid(int rows, int cols){
		data = new char [rows][cols];
		clear();
    }
	public WordGrid(){
		this(10,10);
	}

	//clears the grid
	public void clear(){
		for(int i=0; i<data.length;i++){
		    for(int j=0; j<data[i].length; j++){
			data[i][j] = '-';
		    }
		}
   	}
	
	//*return a String with each character separated by spaces, and each row separated by newlines.
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
	
	//checks elegibility of word
	public Boolean checkWord(String word, int rows, int cols, int dx, int dy){
		if((dx == 0 && dy ==0)||
		    rows + dy*word.length() > data.length ||
   			rows + dy*word.length() < 0 ||
			cols + dx*word.length() > data[0].length ||
			cols + dx*word.length() <0){
			return false;
		}else{
			for(int i=0;i<word.length();i++){
				if((data[rows][cols] != '-' && data[rows][cols] != word.charAt(i))){
					return false;
				}
				rows +=dy;
				cols +=dx;
			}
		}
		return true;
	}
	
	//adds word to grid if eligible
	public boolean addWord(String word){
		int rows = rand.nextInt(data.length);
		int cols = rand.nextInt(data[0].length);
		int dx = rand.nextInt();
		int dy = rand.nextInt();
		if(checkWord(word, rows, cols, dx, dy)){
			for(int i=0; i<word.length();i++){
				data[rows][cols] = word.charAt(i);
				rows +=dy;
				cols +=dx;
			}
			wordBank.add(word);
			return true;
		}else{
			return false;
		}
	}
}
			
		
  
