package software.neocortex.model;

public class Message {

    public Message(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    private String helloMessage;

    public Message() {
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }


}
