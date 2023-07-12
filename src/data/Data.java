package data;

import java.util.ArrayList;
import java.io.Serializable;
import model.Traje;

public class Data implements Serializable {
    public boolean addTrajes(Traje x) {
        data.add(x);
        return true;
    }

    ArrayList<Traje> data = new ArrayList<>();

}
