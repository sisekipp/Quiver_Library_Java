package model;

import java.util.List;

/**
 * Created by sebastian on 25.01.15.
 */
public class Content {

    private String title;

    private List<Cell> cells;


    public Content() {

    }

    public Content(String title, List<Cell> cells) {
        this.title = title;
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
