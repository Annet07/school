import java.util.Scanner;

public class Task2 {
    public static String toDelete(String str1){
        String str2 = "";
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) != '#'){
                str2 = str2.concat(String.valueOf(str1.charAt(i)));
            }
            else if(str2.length() != 0){
                str2 = str2.substring(0, str2.length() - 1);
            }
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toDelete(sc.nextLine()));
    }
}
