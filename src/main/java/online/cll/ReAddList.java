package online.cll;

import java.util.ArrayList;

public class ReAddList<E> extends ArrayList<E> {
    public ReAddList<E> reAdd(E e){
        add(e);
        return this;
    }
}