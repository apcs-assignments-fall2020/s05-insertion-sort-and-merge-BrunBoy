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
        int[] arr3=new int[arr1.length+arr2.length];
        int count=0;
        for (int i=0; i<arr1.length; i++){
            count++;
            for (int j=0; j<arr2.length; j++){
                if (arr1[i]<arr2[count]){
                    arr3[j]=arr1[i];
                }
                else{
                    arr3[j]=arr2[count];
                }
            }
        }
        //im not sure how to add the remaining elements to the array
        return null;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
