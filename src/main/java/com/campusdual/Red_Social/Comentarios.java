package com.campusdual.Red_Social;

import java.util.Date;

public class Comentarios{
    protected double idcomment;
    protected String username;
    protected String dateComment;
    protected String comment;

    public Comentarios(double idcomment, String username, String dateComment, String comment){
        this.idcomment = idcomment;
        this.username = username;
        this.dateComment = dateComment;
        this.comment = comment;
    }

    public void setIdcomment(double idcomment) {
        this.idcomment = idcomment;
    }

    public double getIdcomment() {
        return idcomment;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }
    public String getDateComment() {
        return dateComment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }
}
