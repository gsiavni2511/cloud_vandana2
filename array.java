import java.util.Arrays;
import java.util.Random;
public class array{
    public static void main(String args[]){

int[] a={1,2,3,4,5,6,7,8,9};
Random rand = new Random();

for(int i=0;i<a.length;i++){
    int shuffle =rand.nextInt(a.length);
    int temp=a[shuffle];
    a[shuffle]=a[i];
    a[i]=temp;
}
System.out.println(Arrays.toString(a));
    }
}