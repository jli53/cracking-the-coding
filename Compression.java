public class Compression{
	public void compress(String str){
		int count = 1;
		int index = 0;
		int length = str.length();
		boolean worth = true;
		char[] compressed = new char[length];
		compressed[index] = str.charAt(0);
		for(int i = 1; i< length; i++){
			if(str.charAt(i) == compressed[index]){
				count++;
			}
			else{
				if(index >= length-1){
					worth = false;
					break;
				}
				compressed[++index] = String.valueOf(count).charAt(0);
				compressed[++index] = str.charAt(i);
				count = 1;
			}
		}
		if(index >= length-2 || worth == false){
			worth = false;
		}
		else{
			compressed[++index] = String.valueOf(count).charAt(0);
		}
		String compressed_string = new String(compressed);
		if(worth == true){
			System.out.println(compressed_string);
		}
		else{
			System.out.println(str);
		}
		return;
	}
}