package aaron.springcrafter.springframework;

/**
 * @author Ziqi Wang
 * @date 12/4/22 14:32
 */

public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
