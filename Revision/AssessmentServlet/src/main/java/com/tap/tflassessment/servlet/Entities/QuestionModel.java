package com.tap.tflassessment.servlet.Entities;

public class QuestionModel {
    private int id ;
    private String title;
    

    public QuestionModel(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    public QuestionModel() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "QuestionModel [id=" + id + ", title=" + title + "]";
    }

}
