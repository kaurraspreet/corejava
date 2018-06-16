import java.util.Scanner;
class Waveform{
public static void main(String[] args){

int[] array={1,2,3,4,5,6,7,8,9};
int n,temp;
for(n=0;n<array.length-1;n=n+2){
if(array[n]<array[n+1]){
temp=array[n];
array[n]=array[n+1];
array[n+1]=temp;
}
} 
for(n=0;n<array.length-1;n++){
System.out.println(array[n]);
}

}
}