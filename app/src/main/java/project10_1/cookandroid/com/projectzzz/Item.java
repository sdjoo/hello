package project10_1.cookandroid.com.projectzzz;

import java.util.Objects;

public class Item {

    private String title;
    private String context;

    public Item(String title, String context){
        this.title = title ;
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(title, item.title) &&
                Objects.equals(context, item.context);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, context);
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
