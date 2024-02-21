import java.util.StringJoiner;

/**
 * @Author:gcz
 * @Date:2024/02/20/9:02
 * @Description:
 **/
public class selection_sort {
    static void print_array(int[] a){
        StringJoiner b = new StringJoiner(",","[","]");
        for (int i = 0; i < a.length; i++) {
            b.add(Integer.toString(a[i]));
        }
        System.out.println(b);
    }
    static void swap(int a[],int m,int n){
        int temp = a[m];
        a[m]= a[n];
        a[n]=temp;
    }
    static void selection_sort(int[] a,int n){
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
            swap(a,i,min);
            print_array(a);
        }
    }

    public static void main(String[] arr){
        int n = 15;
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= (int)(Math.random()*(n-1)+1);
        }
        print_array(a);
        selection_sort(a,n);

    }
}
