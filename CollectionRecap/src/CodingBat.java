public class CodingBat {

    public static void main(String[] args) {

    }

    static boolean increasing(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}