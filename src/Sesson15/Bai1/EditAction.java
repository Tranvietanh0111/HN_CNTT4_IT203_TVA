package Sesson15.Bai1;

public class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }
    public String getDescription() { return description; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return "[" + time + "] " + description;
    }
}