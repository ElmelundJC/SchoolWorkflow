package customList;

public class UseCustomList {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Charlie");
        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);

    }


}
