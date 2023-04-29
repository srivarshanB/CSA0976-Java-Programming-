import java.util.Arrays;
class MthmaxNthmin
{
	public static void main(String[] args)
	{
        	int[]arr={14,16,87,36,25,89,34};
        	int m=1;
        	int n=3;
       		Arrays.sort(arr);
        	int mthMax=arr[arr.length-m];
       		int nthMin=arr[n-1];	
        	int sum=mthMax+nthMin;
        	int diff=mthMax-nthMin;	
        	System.out.println("1st Maximum Number="+mthMax);
        	System.out.println(n+"th Minimum Number="+nthMin);
        	System.out.println("Sum="+sum);
        	System.out.println("Difference="+diff);
	}
}