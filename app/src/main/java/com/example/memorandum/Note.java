package com.example.memorandum;

import java.util.ArrayList;

public class Note {
    private String title;
    private String text;
    private String type;

    static ArrayList<Note> notes = new ArrayList<Note>();
    static ArrayList<Note> notesStu = new ArrayList<Note>();
    static ArrayList<Note> notesLife = new ArrayList<Note>();
    static ArrayList<Note> notesOther = new ArrayList<Note>();


    public Note(String title, String text, String type){
        this.title = title;
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getType(){
        return type;
    }


    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
