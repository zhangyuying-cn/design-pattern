package cn.zhangyuying.designpattern.prototype;

import java.io.Serializable;

/**
 * @author zyy.
 */
public class Receiver implements Serializable {
    String name;

    String phone;

    public Receiver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
