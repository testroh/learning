/**
 * Created by Rohith on 12/3/2017.
 */
public class rshift {

    public static void main(String[] args) {

        int arr[] = new int[7];
        int newarr[] = {4,5,6,7,8};
        int length = 5;

        for(int i = 0 ; i < length; i++) {
            arr[i] = newarr[i];
        }
        int shift = 1;
        for(int i=length-1;i>=0;i--){
            arr[i+shift] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
