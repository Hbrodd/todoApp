package se.HB;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;

    public ToDoItemTask(boolean assigned, ToDoItem toDoItem, Person assignee) {
        this.assigned = assigned;
        this.toDoItem = toDoItem;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public ToDoItem getToDoItem() {
        return toDoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getSummary(){
        String summary;
        return summary = ("ID: " + id + " Assigned: " + assigned + " Assignee" + assignee.getSummary() + " Todo: " + toDoItem);
    }
}
