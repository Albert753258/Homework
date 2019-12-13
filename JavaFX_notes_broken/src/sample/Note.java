package sample;

public class Note {
    public String name;
    public String text;
    public int number;
    public boolean deleted;
    public int id;

    public Note(boolean deleted, int id, int number, String name, String text){
        this.deleted = deleted;
        this.id = id;
        this.number = number;
        this.name = name;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String note_info() {
        String info = "" + number + name;
        return info;
    }
}
