public class ZeroCheck{
	public void check(int[][] init){
		int row = init.length;
		int column = init[0].length;
		boolean zero = false;
		for(int i = 0; i< row; i++)
			for(int j = 0; j<column; j++){
				if(init[i][j] == 0){
					zero = true;
					break;
				}
			}
		if(zero == true){
			for(int i = 0; i< row; i++){
				java.util.Arrays.fill(init[i],0);
				System.out.println(java.util.Arrays.toString(init[i]));
			}
		}
		else
			for(int i = 0; i < row; i++){
				System.out.println(java.util.Arrays.toString(init[i]));
			}
	}
}