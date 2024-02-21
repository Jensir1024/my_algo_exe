import java.util.StringJoiner;

/**
 * @Author:gcz
 * @Date:2024/02/21/9:03
 * @Description:
 **/
public class bubble_sort {

    static void print_array(int [] a){
        StringJoiner b = new StringJoiner(",","[","]");
        for(int i=0;i<a.length;i++){
            b.add(Integer.toString(a[i]));
        }
        System.out.println(b);
    }
    
    static void swap(int[] a,int m,int n){
        int temp = a[m];
        a[m]=a[n];
        a[n]=temp;
    }

    static void bubble_sort(int[] a){
        print_array(a);
        for(int i= a.length;i>1;i--){
            boolean swap1 = false;
            for(int j=1;j<i;j++){
                if(a[j-1]>a[j]){
                    swap(a,j-1,j);
                    swap1=true;
                }
            }
            print_array(a);
            if(!swap1) {
                break;
            }
        }
    }

    public static void main(String[] args){
        int n=15;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= 1+(int)(Math.random()*(n-1));
        }
        bubble_sort(a);
    }

}
