
public class ReverseString {

	public static void main(String[] args) {
		String str = "Geeks";
		String ans = reverseWord1(str); // Using extra string variable // TC = O(|s|), SC = O(1)
		System.out.println(ans);
	}
	
	public static String reverseWord1(String str)
    {
       String ans = "";
       for(int i = str.length()-1; i >= 0; i--) {
           ans += str.charAt(i);
       }
       
       return ans;
    }

}
