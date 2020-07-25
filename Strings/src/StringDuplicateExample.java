import java.util.Scanner;

public class StringDuplicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1");
		String str1=sc.next();
		System.out.println("Enter string2");
		String str2=sc.next();
		String str3="";
		for(char c:str2.toCharArray()) {
			if(!str1.contains(""+c)) {
				str3+=c;
			}
		}
   System.out.println(str3);
	}

}
