public class Task {
    String title;
    String description;

    public Task(String title, String description){
        this.title=title;
        this.description=description;
    }

    public String toString() {
        return "Title: " + title + "\nDescription: " + description;
    }
}
