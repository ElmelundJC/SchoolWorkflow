import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excercise6 {
    //skriv en metode der tager en liste a int's som parameter og returnere antal af unikke karaktere i listen


    int[] arr = {1,2,3,4,5,6,7,8,6,5,3,2,1,3,4,5,2,234,4,2,34,2};
    Map<Integer, Integer> sortMap = new HashMap<Integer, Integer >();
    public void countUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            sortMap.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        System.out.println(sortMap.keySet());
    }
}
