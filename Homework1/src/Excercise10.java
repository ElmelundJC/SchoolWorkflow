/*
* Skriv en metode removeOddLength der tager imod en string som parameter og fjerner alle de strings i "settet" med
* odd length.
* */


import java.util.HashSet;

public class Excercise10 {


    public String removeOddLength(String str){

        char[] word = str.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if(i%2 == 0){
                System.out.println(" " + word[i]);
            }
        }
        return str;
    }


    public static void main(String[] args) {
        String str = "Oodddd  cchhaarraacctteerrss  rreemmoovveedd";

        Excercise10 e10 = new Excercise10();
        //e10.removeOddLength(str);
    }
}
