package nl.johannisk.input.model;

public class Message {
    private int index;
    private String text;

    public Message() {}

    public Message(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
