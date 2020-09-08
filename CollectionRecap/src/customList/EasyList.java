package customList;

import java.util.ArrayList;

public class EasyList<T> extends ArrayList {
    public boolean isSomewhatFull(){
        if (size() < 10) {
            return true;
        }
        else {
        return false;
        }
    }

}
