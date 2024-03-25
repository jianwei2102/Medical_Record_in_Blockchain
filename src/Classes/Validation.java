package Classes;

public class Validation {
    private boolean isValid;
    private String message;
    private String messageType;

    public Validation(boolean isValid, String message, String messageType) {
        this.isValid = isValid;
        this.message = message;
        this.messageType = messageType;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
