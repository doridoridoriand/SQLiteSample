package com.example.sqlitetest.app;

/**
 * Created by rpd on 14/05/09.
 */
public class Note {
    protected int id;
    protected String note;
    protected String lastupdate;

    public Note(int id, String note, String lastupdate) {
        this.id = id;
        this.note = note;
        this.lastupdate = lastupdate;
    }

    public String getNOte() {
        return note;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public int getId() {
        return id;
    }
}