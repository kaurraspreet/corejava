import java.util.*;

class SubArray{

public static int lengthArray(int arr[],int n)
{
int max=1;
 int l=1,i;

for(i=1;i<n;i++)
{
if (arr[i]>arr[i-1])
l++;
else
{
if(max<l)
max=l;
l=1;
}
}
if(max<l)
max=l;
return max;
}
public static void main(String[] args)
{
int arr[]={5,6,3,5,7,8,9,1,2};
int n=arr.length;
System.out.println("length="+lengthArray(arr,n));
}
} 
