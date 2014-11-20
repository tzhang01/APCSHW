public class WordGrid{
    private char[][]data;
    public WordGrid(int rows, int cols){
		char[][]data = new char [rows][cols];
		clear();
    }
	public void clear(){
		for(int i=0; i<data.length;i++){
			for(int j=0; j<data[i].length; j++){
				data[i][j] = ' ';
			}
		}
	}

		

	public static void main(String[]args){
		WordGrid grid = new WordGrid(5,5);
		System.out.println(grid);
	} 


}
