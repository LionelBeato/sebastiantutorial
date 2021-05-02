package works.lionel.model;

public class House {

    // fields
    private Long id;
    private int windows;
    private String color;
    private int rooms;
    private boolean hasGarage;

    // behaviors (methods)

    // constructor

    public House(Long id, int windows, String color, int rooms, boolean hasGarage) {
        this.id = id;
        this.windows = windows;
        this.color = color;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
    }


    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }


    // tostring, equals and hashcode

}
