import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strs=str.split(" ");
        int a,key;
        a=Integer.parseInt(strs[0]);
        key=Integer.parseInt(strs[1]);
        int[] b=new int[a];
        for (int i = 0; i <=a-1; i++) {
            b[i]=i+1;
        }
        System.out.println(getTimes(b,key));

    }

    public static int getTimes(int[] a,int key){
        int flag=1;
        int low =0;
        int high=a.length-1;
        while(high>=low){
            if(((low+high)%2)==0){
                if(a[high]==key){
                   return flag;

                }
            }
            //找到中间数
            int mid=(low+high)/2;
            //判断中间数是否大于要找的数
            if(key<a[mid]){
                high=mid-1;
                flag++;
            }else if(key==a[mid]){
                return flag;
            }else {
                low=mid+1;
                flag++;
            }
        }
        return -1;
    }
}
