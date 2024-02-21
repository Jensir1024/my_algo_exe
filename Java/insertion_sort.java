import java.util.Random;

/**
   *@Author:gcz
   *@Date:2024/02/19/9:54
   *@Description:

**/
    public class insertion_sort {
    static void print_array(int[] a){
        for(int i=0;i< a.length;i++){
            System.out.print(String.valueOf(a[i])+',');
        }
        System.out.println();
    }
    static void insertionSort(int[] a,int n){
        print_array(a);
        for(int i= 1;i<n;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1]= a[j];
                j--;
            }
            a[j+1] = key;
            print_array(a);
        }
    }

    public static void main(String[] args) {
        int n =10;
        int a[] = new int[n];
        Random random = new Random();
        for(int i = 0; i<n;i++){
            a[i] = random.nextInt(100);
        }
        insertionSort(a,n);
    }
}
