package cn.zhangyuying.designpattern.builder;

/**
 * @author zyy.
 */
public class MessageBody {

    private String sender;

    private String sendType;

    private String context;

    private String receiveMethod;

    private String receiver;

    private String ext;

    public MessageBody() {
    }

    public MessageBody(Builder builder) {
        this.sender = builder.sender;
        this.sendType = builder.sendType;
        this.context = builder.context;
        this.receiveMethod = builder.receiveMethod;
        this.receiver = builder.receiver;
        this.ext = builder.ext;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getReceiveMethod() {
        return receiveMethod;
    }

    public void setReceiveMethod(String receiveMethod) {
        this.receiveMethod = receiveMethod;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        String result = getSendType() + "\n" + getSender() + "\n" + getContext() + "\n" + getReceiver() + "\n" + getReceiveMethod() + "\n";
        if (null != getExt()) {
            result += getExt() + "\n";
        }
        return result;
    }

    public static class Builder {
        private String sender;

        private String sendType;

        private String context;

        private String receiveMethod;

        private String receiver;

        private String ext;

        public Builder(String sendType, String sender, String context, String receiver, String receiveMethod) {
            this.sender = sender;
            this.context = context;
            this.receiver = receiver;
            this.receiveMethod = receiveMethod;
            this.sendType = sendType;
        }

        public Builder withExt(String ext) {
            this.ext = ext;
            return this;
        }

        public MessageBody buildMessageBody() {
            return new MessageBody(this);
        }
    }
}
