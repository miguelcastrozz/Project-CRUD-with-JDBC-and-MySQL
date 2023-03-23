package org.example;

public class Messages {

    Integer idMessage;
    String message;
    String authorMessage;
    String dateMessage;

    public Messages(Integer idMessage, String message, String authorMessage) {
        this.idMessage = idMessage;
        this.message = message;
        this.authorMessage = authorMessage;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }

}
