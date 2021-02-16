import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> newArray=new ArrayList<>();
        for (int i=0; i<list.length()-1; i++){
            int quack=list.get(i);
            int melon=list.get(i+1);
            while (quack<melon){
                //im not sure what to do here. 
                //probably a conditional type of statement but i don't know what to do.
            }
            //i need some sort of checker method to check if my second integer is greater than what other elements?
        }
        return null;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int [] outputArray=new int[arr1.length+arr2.length];
        for (int i=0; i<arr1.length; i++){
            if (arr1[i]>arr2[i]){
                int temp=arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=temp;
                outputArray[i]=arr1[i];
            }
        }
        for (int j=outputArray.length/2; j<outputArray.length; j++){
            int m=0;
            outputArray[j]=arr2[m];
            m++;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
