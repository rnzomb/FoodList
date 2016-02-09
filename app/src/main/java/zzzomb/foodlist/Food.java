package zzzomb.foodlist;

import java.io.Serializable;
import java.util.HashMap;

public class Food extends HashMap<String, String> implements Serializable {

    public static final String NAME = "name";
    public static final String PRICE = "price";
    public static final String DESCRIPTION = "description";
    public static final String CALORIES = "calories";

    public Food(String name, String price) {
        super();
        super.put(NAME, name);
        super.put(PRICE, price);
    }

    public Food(String name, String price, String description, String calories) {
        super();
        super.put(NAME, name);
        super.put(PRICE, price);
        super.put(DESCRIPTION, description);
        super.put(CALORIES, calories);
    }
}