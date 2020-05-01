package b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int str=scanner.nextInt();
        System.out.println(getExcleNumber(str));
    }
    public static String getExcleNumber(int n){
        StringBuilder s=new StringBuilder();
        char ch;
        while (n>=1){
            int i=n%26;
            if(i!=0){
                ch=(char)('A'+i-1);
                s=s.append(ch);
            }else {
                ch='Z';
                s=s.append(ch);
                n--;
            }
            n/=26;
        }
        return s.reverse().toString();

    }
}
