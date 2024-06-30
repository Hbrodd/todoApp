package se.HB;

import java.time.LocalDate;

public class ToDoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;
    private static LocalDate todaysDate = LocalDate.now();


    //public ToDoItem(int id) {
      //  this.id = id;
    //}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public Person getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public boolean isOverDue(){
        return todaysDate.isAfter(deadLine);
    }
    public String getSummary(){
        String summary;
        return summary = ("ID: " + id + " Title: " + title + " Taskdescription: " + taskDescription + " Deadline:" + deadLine + " Done: " + done);
    }
}
