package deqo.mdel.mysimplestack;

/**
 * Created by Marianna on 04/11/2016.
 */
public class Item {

    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * Commentaire pour l'exigence #1
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
