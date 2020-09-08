package customList;

public class MyList<T> { // generics
    //Lav en "storage"
    private T[] list = (T[]) new Object[4]; // start med 4
    private int cursor = 0;
    // Lav en isEmpty() metode
    // easyList.isEmpty()

    public boolean add(T element){
        //precondition: there is always at least one empty slot
        list[cursor] = element;
        cursor++; // flyt cursor en position til højre
        // check om cursor er blevet for stor ift. list
        if (cursor > list.length - 1){ // skaf mere plads
            T[] newArray = (T[]) new Object[list.length * 2];
            System.arraycopy(list, 0, newArray, 0, cursor);
            list = newArray;
            System.out.println("nyt array: " + list.length);
        }
        return true; // venter tilbage til denne
    }

    public T get (int index) {
        if (index > -1 && index < cursor) {
            return list[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + index);
        }
    }

    public boolean contains(T element){
        for (int i = 0; i < cursor; i++) {
            if(element.equals(list[i])) {
                return true;
            }
        }
        return false;
    }


    public boolean remove(int index){
        // 1. check input
        if (index > -1 && index < cursor) {
            // 2. slette elementet på index + ryk
            for (int i = 0; i < cursor - 1; i++) {
                list[i] = list[i+1];
            }
            cursor--;
            // 3. evt. halvér list
            if (cursor < list.length / 2){
                T[] newArray = (T[]) new Object[list.length / 2];
                System.arraycopy(list, 0, newArray, 0, cursor);
                list = newArray;
                System.out.println("nyt array: " + list.length);
            }
        }
        else
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + index);
        }
        return true;
    }



    public String toString(){
        String out = "";
        for (int i = 0; i < cursor; i++) {
            out += list[i] + "\n";
        }
        return out;
    }

    public boolean isEmpty(){
        // return list[0] == null;
        return cursor < 1;
    }
}
