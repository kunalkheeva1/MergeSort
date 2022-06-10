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
        merge(arr,leftHalf,rightHalf);
    }
    //now creating a method to merge the elements
    //will take the input of lefthalf and righthalf and add them in arr wrt ascending order

    public static void merge(int[]arr, int[] leftHalf,int []rightHalf){
        int leftSize= leftHalf.length;
        int rightSize= rightHalf.length;
        int i= 0, j=0, k=0;
        // now creating a scenario in the loop
        while(i<leftSize && j<rightSize ){            // this means, until the both arrays got emptied

           // if the element in left side is smaller then it will be stored in new array

            if (leftHalf[i]<=rightHalf[j]){
                    arr[k]= leftHalf[i];
                    i++;        //then moves to next element on left side

            }else{                      //else the right side's element will be stored
                arr[k]= rightHalf[j];
                j++;            //then moves to the next element of right side
            }k++;               // and yes move to next positions of new array too
        }

        //now if the loops condition is not true then there will be two cases

        // basically these two loops are for the remaining elements of left side and right side
        while(i<leftSize){
            arr[k]= leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize){
            arr[k]= rightHalf[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

    }
}
