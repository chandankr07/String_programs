public class MergeSort {

	public static void main(String[] args) {
	
	
	/*  a[] is the array, p is starting index, that is 0, 
	and r is the last index of array.  */

	int a[] = {32, 45, 67, 2, 7}; // as the array to be sorted.
	
	int p = 0,r=a.length-1;
	
	MergeSort m= new MergeSort();
	m.mergesort(a, p, r);
	
	}
	
	void mergesort(int a[], int p, int r)
	{
	  int q;
	  if(p < r)
	  {
	    q = (int) Math.floor((p+r) / 2);
	    System.out.println(q);
	    mergesort(a, p, q);
	    mergesort(a, q+1, r);
	    merge(a, p, q, r);
	  }
	}

	void merge(int a[], int p, int q, int r)
	{
	  int b[] = null;     //same size of a[]
	  int i, j, k;
	  k = 0;
	  i = p;
	  j = q+1;
	  while(i <= q && j <= r)
	  {
	    if(a[i] < a[j])
	    {
	      b[k++] = a[i++];       // same as b[k]=a[i]; k++; i++;
	    }
	    else
	    {
	      b[k++] = a[j++];
	    }
	  }
	  
	  while(i <= q)
	  {
	    b[k++] = a[i++];
	  }
	  
	  while(j <= r)
	  {
	    b[k++] = a[j++];
	  }
	  
	  for(i=r; i >= p; i--)
	  {
	    a[i] = b[--k];        // copying back the sorted list to a[]
	  } 

	}
	
	
}
