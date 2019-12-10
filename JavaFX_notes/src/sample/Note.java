package sample;

public class Note {
    public String name;
    public String text;
    public int number;

    public Note(int number, String name, String text){
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

    public void setText(String text) {
        this.text = text;
    }

    public String note_info() {
        String info = "" + number + name;
        return info;
    }
}
