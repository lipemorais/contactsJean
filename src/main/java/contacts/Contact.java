package contacts;


import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class Contact {

    @JsonProperty
    String name;

    @JsonProperty
    String phone;

    @JsonCreator
    public Contact(@JsonProperty String name, @JsonProperty String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
