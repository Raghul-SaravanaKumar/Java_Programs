public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {23, 47, 54, 62, 78};

        int l1 = arr[0];
        int l2 = arr[1];

        if(l1 > l2){
            l1 = arr[0];
            l2 = arr[1];
        }
        else{
            l1 = arr[1];
            l2 = arr[0];
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > l1){
                l2 = l1;
                l1 = arr[i];
            }
            else if (arr[i] > l2){
                l2 = arr[i];
            }

        }
        System.out.println("Second largest element is: " + l2);
    }
}
