package net.ws.model;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/13
 * Time: 12:58
 */
public class Feedback {

    private int distId;

    private String msg;

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getDistId() {
        return distId;
    }

    public void setDistId(int distId) {
        this.distId = distId;
    }
}
