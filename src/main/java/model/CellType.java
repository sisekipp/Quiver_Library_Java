package model;

/**
 * Created by sebastian on 25.01.15.
 */
public enum CellType {

    Text("text"),
    Code("code"),
    Markdown("markdown"),
    Latex("latex");


    private final String text;

    private CellType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
