public class ZeroCheck{
	public void check(int[][] init){
		int row = init.length;
		int column = init[0].length;
		boolean zero_row[] = new boolean[row];
		boolean zero_column[] = new boolean[column];
		for(int i = 0; i< row; i++)
			for(int j = 0; j<column; j++){
				if(init[i][j] == 0){
					zero_row[i] = true;
					zero_column[j] = true;
				}
			}
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(zero_row[i] == true || zero_column[j] == true){
					init[i][j] = 0;
				}
			}
			System.out.println(java.util.Arrays.toString(init[i]));
		}
	}
}