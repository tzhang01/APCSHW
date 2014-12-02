import java.util.*;
import java.io.*;
public class WordGrid{
	// instance variables
    private char[][]data;
	Random rand = new Random();
	ArrayList<String> wordList = new ArrayList<String>();
	private long seed;

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
			wordList.add(word);
			return true;
		}else{
			return false;
		}
	}

	public void fill(ArrayList<String> words){
		for(int i=0;i<words.size();i++){
			String word = words.remove(rand.nextInt(words.size()));
			int tries = 25;
			do{
				if(addWord(word)){
					tries = 0;
				}else{
					tries -= 1;
				}
			}while(tries >0);
		}
	}			
		
	public void loadWordsFromFile(String filename, boolean fillRandomLetters){
		try{
			ArrayList<String> wordBank = new ArrayList<String>();
			File f = new File(filename);
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
				wordBank.add(s.nextLine());
			}	
			fill(wordBank);
			if(fillRandomLetters){
				for(int i=0;i<data.length;i++){
					for(int j=0; j<data[i].length;j++){
						if(data[i][j] =='-'){
						    data[i][j] = (char)(rand.nextInt(26)+97);
						}
					}
				}
			}
		}catch(FileNotFoundException e){
			System.out.println("File does not exist");
		}
	}
	
	public String wordsInPuzzle(){
		String words = "";
		for(int i=0;i<wordList.size();i++){
			words += " " +wordList.get(i);
			if((i+1) % 5 == 0){
				words += "\n";
			}
		}
		return words;
	}
	public void setSeed(long seed){
		rand = new Random(seed);
	}
}
			
		
  
