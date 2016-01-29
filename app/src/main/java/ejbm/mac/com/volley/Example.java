package ejbm.mac.com.volley;


        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
/*        import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;*/


public class Example {


    private String title;

    private String link;

    private String description;

    private String modified;

    private String generator;

    private List<Item> items = new ArrayList<Item>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The title
     */

    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The link
     */

    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The description
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The modified
     */

    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */

    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The generator
     */

    public String getGenerator() {
        return generator;
    }

    /**
     *
     * @param generator
     * The generator
     */

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    /**
     *
     * @return
     * The items
     */

    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
