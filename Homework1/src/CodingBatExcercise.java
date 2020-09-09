public class CodingBatExcercise {

    public static void main(String[] args) {

    }

    public boolean scoresIncreasing(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
