import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
Skriv en metode minLength der tager imod et set a strings og returnere den string med den korteste længe. Hvis settet
tomt returneres der 0.
 */
public class Excercise8 {


    public int minLength(HashSet<String> hs){
        String str;
        int lengthMin = 1000;
        int stringLength = 0;

        if(hs.isEmpty()){
            return 0;
        }
        else {
            // vi omskriver settet til et array
            Object[] arr = hs.toArray();
            // vi går dernæst igennem Array'ets elementer
            for (int i = 0; i < arr.length; i++) {
                // gemmer hvert element i en string, hvortil det omskrives til længden af strengen
                String strLength = (String) arr[i];
                stringLength = strLength.length();

                // hvis længden af et index er mindre end det nuværende, "overskriv" den gamle længde med den nye
                if( stringLength < lengthMin){
                    lengthMin = stringLength;
                }
            }

        }
        System.out.println("The element with the shortest string has: " + lengthMin + " characters");
        return lengthMin;
    }

    public static void main(String[] args) {
        Excercise8 e8 = new Excercise8();
        HashSet<String> hs = new HashSet<>();
        hs.add("Skovsnegl");
        hs.add("Orangutang");
        hs.add("Tigermis");
        hs.add("Tudse");
        hs.add("Frø");
        hs.add("Løve");
        hs.add("Lillemor");
        hs.add("Kanin");



        System.out.println(hs);
        e8.minLength(hs);
    }

}
