import java.util.Arrays;

public class AscendingOrderArray{

 public static void main(String[] args){

int n[]={1,1,1,1,0,0,1,0};
sortArray(n);
System.out.println("sorted array is: "+ Arrays.toString(n));
 }

private static void sortArray(int[] n){

int low=0;
int high=n.length-1;
int temp;
while(low<high){

while(n[low]==0 && low<high)
low++;

while(n[high]==1 && low<high)
high--;

if(low<high){

temp=n[high];
n[high]=n[low];
n[low]=temp;
low++;
high--;
}
}
return;
}
} 

