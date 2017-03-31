package software.neocortex.model;

public class Message {

    public Message() {
    }

    public Message(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }


}
