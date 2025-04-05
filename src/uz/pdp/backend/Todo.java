package uz.pdp.backend;

public class Todo {
    private String id;
    private String title;
    private Priority priority=Priority.low; //low,medium,high
    private Category category=Category.DEFAULT; //work,study,default
    private boolean completed;

    public Todo() {

    }

    public Todo(String id, String title, Priority priority, Category category, boolean completed) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.category = category;
        this.completed = completed;
    }

    public static TodoBuilder builder(){
        return new TodoBuilder();
    }

    public static class TodoBuilder {
        private String id;
        private String title;
        private Priority priority=Priority.low;
        private Category category=Category.DEFAULT;
        private boolean completed;

        public TodoBuilder id(String id) {
            this.id = id;
            return this;
        }

        public TodoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public TodoBuilder priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TodoBuilder category(Category category) {
            this.category = category;
            return this;
        }

        public TodoBuilder completed(boolean completed) {
            this.completed = completed;
            return this;
        }

        public  Todo build(){
            return new Todo(this.id,this.title,this.priority,this.category,this.completed);
        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                ", category=" + category +
                ", completed=" + completed +
                '}';
    }
}
