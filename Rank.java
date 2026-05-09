

public class Rank {
    public static void main(String[] args) {
        int n= 5;
        int cut = 0;
        int[] arr={4 ,2 ,3, 1, 5};
        int d = arr[0];
        for(int i=0;i<n-1;i++){
            if(d > arr[i+1]){
                d = arr[i+1];
                cut++;
            }
        }
        System.out.println(cut);
    }   
}
