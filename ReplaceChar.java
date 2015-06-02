public class ReplaceChar{
	public void replace(String str, int true_length){
		char new_str[] = str.toCharArray();
		for(int i = 0; i < true_length; i++){
			if(new_str[i] == ' '){
				for(int j = true_length-1; j > i; j--){
					new_str[j+2] = new_str[j];
				}
				true_length += 2;
				new_str[i] = '%';
				new_str[i+1] = '2';
				new_str[i+2] = '0';
			}
		}
		System.out.println(new_str);
	}
}