import java.util.*;
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort implements SortingAlgorithm
{
    public SelectionSort(){}

    public void sort(int [] arr)
    {
        int min, temp;
        for (int i=0; i<arr.length-1; i++) // pass through, pick smallest item, swap 
        {
            min = i; 
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[j]<arr[min]){min = j;}
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static void main(String [ ] args)
    {
        int[] toSort = {5, 10, 47, 2, 59, 21, 94, 19};
        SelectionSort sorter = new SelectionSort();
        System.out.println(" Before Sort: "+Arrays.toString(toSort));
        sorter.sort(toSort);
        System.out.println(" After Sort: "+Arrays.toString(toSort));
    }
}

