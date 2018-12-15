package cn.zhangyuying.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author zyy.
 */
public class MessagePrototype implements Cloneable, Serializable {

    private String context;

    private String sendType;

    private Receiver receiver;

    @Override
    public MessagePrototype clone() throws CloneNotSupportedException {
        MessagePrototype messagePrototype = (MessagePrototype) super.clone();
        return messagePrototype;
    }

    @Override
    public String toString() {
        return "消息发送方式：" + sendType + "\n" + "消息内容：" + context + "\n" + "接收人信息：名称" + receiver.getName() + ";联系方式：" + receiver.getPhone()
                + "\n" + "------------------";

    }

    /**
     * 利用序列化实现深度克隆
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public MessagePrototype deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (MessagePrototype) ois.readObject();

    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
