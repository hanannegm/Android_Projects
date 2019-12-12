package android.section.listview;

/**
 * Created by A on 12/4/2015.
 */
public class Drink {
    private String name;
    private int imageResourceId;


    public Drink(String name, int imageResourceId) {
        this.name = name;

        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }

}
