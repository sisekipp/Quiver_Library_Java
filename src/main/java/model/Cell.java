package model;

/**
 * Created by sebastian on 25.01.15.
 */
public class Cell {

    private CellType type;

    private String data;

    private Language language;


    public Cell() {

    }

    public Cell(CellType type, String data) {
        this.type = type;
        this.data = data;
    }

    public Cell(CellType type, String data, Language language) {
        this.type = type;
        this.data = data;
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }
}
