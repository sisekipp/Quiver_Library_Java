package model;

/**
 * Created by sebastian on 25.01.15.
 */
public class Notebook {

    private String name;
    private String uuid;

    public Notebook() {

    }

    public Notebook(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
