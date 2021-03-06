package Functions.Sound;

public class Guitar extends AbstractSound {

    private static int id = 0;
    private int idSound;
    String notes;
    String type;

    public Guitar() {
        id++;
        idSound = id;
    }
    public int getId() {
        return idSound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AbstractSound showInfo() {
        return this;
    }

    void updateInfo(String notes) {
        this.notes = notes;
    }
}
