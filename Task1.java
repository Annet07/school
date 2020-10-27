import java.util.Scanner;

public class Task1 {

    public static String toSplit(Integer number){
        String str1 = number.toString();
        String str2 = "";
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) % 2 != 0){
                if(i == 0){
                    str2 = str2.concat(String.valueOf(str1.charAt(i)));
                    str2 = str2.concat("-");
                }
                else if(i == str1.length()-1){
                    if (str1.charAt(i - 1) == '-') {
                        str2 = str2.concat("-");
                    }
                    str2 = str2.concat(String.valueOf(str1.charAt(i)));
                }
                else{
                    if (str1.charAt(i - 1) % 2 == 0) {
                        str2 = str2.concat("-");
                    }
                    str2 = str2.concat(String.valueOf(str1.charAt(i)));
                    str2 = str2.concat("-");
                }
            }
            else{
                str2 = str2.concat(String.valueOf(str1.charAt(i)));
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toSplit(Integer.parseInt(sc.next())));
    }

}
