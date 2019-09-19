
import java.util.*;

/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort implements SortingAlgorithm
{
    public BubbleSort(){}

    public void sort(int [] arr)
    {
        int j=arr.length; 
        int i=0; 
        boolean stop = false; 
        int temp;
        while (!stop && i<arr.length-1) // passes.  
        {
            stop = true; // if swap is made do not stop
            for (int k=0; k<j-1; k++)// last element checked decreases by 1 every time bc end of array is sorted.
            {
                if (arr[k] > arr [k+1]) //if bigger, swap. 
                {
                    stop = false;
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
            j--;
            i++;
        }
    }
    
    public static void main(String [ ] args)
    {
        int[] toSort = {5, 10, 47, 2, 59, 21, 94, 19};
        BubbleSort sorter = new BubbleSort();
        System.out.println(" Before Sort: "+Arrays.toString(toSort));
        sorter.sort(toSort);
        System.out.println(" After Sort: "+Arrays.toString(toSort));
    }
}
