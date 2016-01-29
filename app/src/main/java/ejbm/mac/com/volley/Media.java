package ejbm.mac.com.volley;


        import java.util.HashMap;
        import java.util.Map;
/*
        import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;
*/

/**
 * Created by admin on 1/27/2016.
 */
public class Media {

    private String m;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The m
     */

    public String getM() {
        return m;
    }

    /**
     *
     * @param m
     * The m
     */

    public void setM(String m) {
        this.m = m;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
