import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excercise6 {
    //skriv en metode der tager en liste a int's som parameter og returnere antal af unikke karaktere i listen
 int uniqueNumber = 0;


    public void countUnique(int[] arr, Map<Integer, Integer> sortMap){
        for (int i = 0; i < arr.length; i++) {
            sortMap.put(arr[i], i);
        }
        System.out.println(sortMap.keySet());
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,2,1,5,6,7,3,2,3,5,3,2};
        Map<Integer, Integer> sortMap = new HashMap<Integer, Integer >();
        Excercise6 excercise6 = new Excercise6();

        excercise6.countUnique(arr,sortMap);

    }
}
