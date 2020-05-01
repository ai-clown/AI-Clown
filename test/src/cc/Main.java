package cc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        String time=scanner.nextLine();
        String[] times=time.split("");
        int[] a=new int[6];
        for (int i = 0; i <6; i++) {
            a[i]=Integer.parseInt(times[i]);
        }
        int[] c=getMixTime(a);
        String timess = "";
        for (Integer anum : c) {
            timess +=anum;
        }
        SimpleDateFormat format = new SimpleDateFormat("HHmmss");
        Date date = format.parse(timess);
        format.applyPattern("HH:mm:ss");
        System.out.println(format.format(date));

    }

    public static  int[]  getMixTime(int[] time){
        int[] b=new int[6];
        int i=0;
        int a=0;
        a= getMax(time,2);
        b[i]=a;
        i++;
        if(a==2){
            a=getMax(time,4);
            b[i]=a;
            i++;
        }else {
            a=getMax(time,9);
            b[i]=a;
            i++;
        }

        if(a==4){
            a=getMax(time,0);
            b[i]=a;
            i++;
        }else {
            a=getMax(time,6);
            b[i]=a;
            i++;
        }
        if(a==6){
            a=getMax(time,0);
            b[i]=a;
            i++;
        }else {
            a=getMax(time,9);
            b[i]=a;
            i++;
        }
        if(a==6){
            a=getMax(time,0);
            b[i]=a;
            i++;
        }else {
            a=getMax(time,6);
            b[i]=a;
            i++;
        }
        if(a==6){
            a=getMax(time,0);
            b[i]=a;
            i++;
        }else {
            a=getMax(time,9);
            b[i]=a;
            i++;
        }

        return b;
    }

    public static  int[] sort(int[] a){
        for (int i = 0; i <a.length-1; i++) {
            for (int j = 0; j <a.length-i-1; j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int getMax(int a[],int temp){
        a=sort(a);
        for (int i=5;i>=0;i--) {
            if (a[i]<=temp&&a[i]>=0) {
                int temp2=a[i];
                a[i]=-1;
                return temp2;
            }

        }
        return -1;
    }
}
