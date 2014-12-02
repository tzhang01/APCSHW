import java.util.*;
import java.io.*;
public class Driver{
	public static void main (String[]args){
		int rows;
		int cols;
		boolean seedExists = false;
		boolean fillRandomLetters = true;
		Random rand = new Random();

		//check arguments
		if(args.length == 2){
			rows = Integer.parseInt(args[0]);
			cols = Integer.parseInt(args[1]);	
		}else if(args.length == 3){
			rows = Integer.parseInt(args[0]);
			cols = Integer.parseInt(args[1]);
			seedExists = true;
		}else if(args.length == 4){
			rows = Integer.parseInt(args[0]);
			cols = Integer.parseInt(args[1]);
			seedExists = true;	
			if(args[3] == "1"){
				fillRandomLetters = false;
			}
		}else{
			System.out.println("Default 10x10 grid created");
			rows = 10;
			cols = 10;
			seedExists = false;
			fillRandomLetters = true;
		}

		WordGrid w = new WordGrid(rows, cols);
		if(seedExists){	
			w.setSeed(Long.valueOf(args[2]));
		}
		w.loadWordsFromFile("words.txt", fillRandomLetters);
		System.out.println("Find these words: \n" + w.wordsInPuzzle());
		System.out.println(w);
	}
}

