import java.util.Scanner;

public class XOR_Strings_2 {
    public static String string_xor(String str1, String str2) {
        StringBuilder ansString = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                ansString.append('0');
            } else {
                ansString.append('1');
            }
        }
        return ansString.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string2=sc.nextLine();
        System.out.println(string_xor(string1,string2));
    }
}
