package test;

import java.io.Serializable;

/**
 * Created by Zong on 2016/11/19.
 */
public class User implements Serializable {
    private String username;
    private String allname;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAllname() {
        return allname;
    }

    public void setAllname(String allname) {
        this.allname = allname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
