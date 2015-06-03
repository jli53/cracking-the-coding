public class isRotation{
	public boolean isSubstring(String str1, String str2){
		if(str1.indexOf(str2)!= -1)
			return true;
		else
			return false;
	}
	public void check(String str1, String str2){
		if(str1.length()!=str2.length()){
			System.out.println("false");
			return;
		}
		String str3 = str1+str1;//str2 is rotation of str1 <==> str2 is substring of str1str1 !
		if(isSubstring(str3, str2)){
			System.out.println("true");
		}
		else
			System.out.println("false");
		return;
	}
}