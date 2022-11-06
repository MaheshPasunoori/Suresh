
import java.util.Arrays;

public class ArraysAssignment {

	public static void main(String[] args) {

		
		int[] ar= {1,5,8,9,3,5,6,22,55,3,2,22};
		// This is Duplicate Value with sorting.
//		Arrays.sort(ar);
//		if(ar.length > 1) {
//		for(int i=1;i<ar.length;i++) {
//		   if(ar[i-1] == ar[i]) {
//			   System.out.println("Duplicates Found at Index's "+(i-1) +" and "+i + " Duplicate Values is "+ar[i]);
//		   }
//		}
//		} 
		
		// This is for Duplicate values with un-sorting
		int num = 0;
		for (int i=0;i<ar.length;i++) {
			int val = ar[i];
			int count = 0;
			
			  for (int j=i+1;j<ar.length;j++) {
				  if(val == ar[j]) {
				  count++;
				  num++;
				  continue;
				  }
				  
			  }
			 if(count >0) {
				 if(num==1)System.out.println("Duplicate Elements in a given array");
				 System.out.println(val);
			 }
			}
		
		 if(num==0) System.out.println("There is no Duplicates in a given array");
		 
		 
		 //  Quick Sort
		 int[] arr = {1,8,5,66,99,22,4,7,55,85,75,64,89};
		 ArraysAssignment qs= new ArraysAssignment();
		 qs.sort(arr,0,arr.length-1);
		 System.out.println("Array After QuickSorting");
		qs.printIntArray(arr);
		// Bubble Sort
		int arrb[]= {2,5,8,99,54,78,35,62,41,42,25,9,12};
		
		System.out.println();
		System.out.println("Array After Bubblesorting");
		 qs.bubbleSort(arrb);
		 qs.printIntArray(arrb);
 // Merge Sort
		 System.out.println();
		 System.out.println("Array After Merge Sorting");
		 int arrm[] = { 2,8,64,58,72,12,89, 96,54};
		 
	        System.out.println("Given Array");
	       
	        qs.sorted(arrm, 0, arrm.length - 1);
	 
	        System.out.println("\nArray After Merge Sorting");
	        qs.printIntArray(arrm);
	     
	        int arrs[] = { 2,8,64,58,72,12,89, 96,54};
			 
	       
	        qs.selectionSort(arrs);
	        
	        System.out.println("\nArray After Selection Sorting");
	        qs.printIntArray(arrs);
	        
	        //WAP to check whether an array is a subset of another array.
	        
	        int[] mjrarr= {1,2,3,4,5,6,7,8,9,10};
	        int[] mnrarr= {4,2,3,5,1,11};
	        boolean b= true;
	        for(int i=0;i<mnrarr.length;i++) {
	        	if(!qs.contains(mjrarr,mnrarr[i])) {
	        		b =false;
	        	}
	        }
	        if(b==false)System.out.println("\nSecond Array is not subset of First Array"); else System.out.println("\nSecond Array is subset of First Array");
	        
	        
	        
		 
		 
} // Main Method
	
public boolean contains(int mjrarr[],int x) {
	int j=0;
	for(int i:mjrarr) {
		if(i == x) ++j;
	}
	if(j >0) return true; else return false;
	
}
	
public void bubbleSort(int arr[]) {
	for(int i =0;i<arr.length;i++) {
		 for(int j=1;j<arr.length-i;j++) {
			if(arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		 }
		
		
	}
	
}

public void selectionSort(int arr[]) {
	for(int i =0;i<arr.length-1;i++) {
		int minidx=i;
		 for(int j=i+1;j<arr.length;j++) 
			if(arr[j] < arr[minidx])
				minidx=j;
			
				int temp = arr[minidx];
				arr[minidx]=arr[i];
				arr[i]=temp;
	}
	
}

public void printIntArray(int arr[]) {
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
	
	
	
	
	
public void sort(int ar[],int low,int high) {
		
		if(low < high) {
		int qid= partition(ar,low,high);
		sort(ar, low, qid-1);
        sort(ar, qid+1, high);
		
		}
	}
	
	public int partition(int ar[],int low,int high) {
		int i=low-1;
		 int pivot=ar[high];
		 
		 for(int j=low;j<high;j++) {
			 
			 if (ar[j] <= pivot)
	            {
	                i++;
	 
	                
	                int temp = ar[i];
	                ar[i] = ar[j];
	                ar[j] = temp;
	            }
		 	
		}
		 int temp = ar[i+1];
	        ar[i+1] = ar[high];
	        ar[high] = temp;
	 
	        return i+1;
	}
	void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sorted(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
	
	
}
