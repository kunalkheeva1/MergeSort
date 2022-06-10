public class MergeSort {
    public static void mergeSort(int[]arr){
        int lengthOfArr = arr.length;
        //creating a condition for one element or null
        if(lengthOfArr<2){
            return;         //it will return by seeing only one element, which means cant divide further
        }
        //getting the midpoint and leftHalf of the array and rightHalf
        int midpoint = lengthOfArr/2;
        int []leftHalf= new int[midpoint]; // as the max length will not exceed the mid of the original array
        int []rightHalf= new int[lengthOfArr- midpoint]; //I did not take midpoint here as it wont work with odd numbers

        //now running a for loop to fill the elements in leftHalf
        for(int i= 0; i<midpoint; i++){
            leftHalf[i]= arr[i];
        }
        //now creating a loop for the rightHalf storage
        for(int i= midpoint; i<lengthOfArr; i++){
            //i did here i-midpoint as by this index of right half will start from 0 onwards wrt condition of the loop
            rightHalf[i-midpoint] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
    }


    public static void main(String[] args) {

    }
}
