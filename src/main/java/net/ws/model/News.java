package net.ws.model;

import java.io.Serializable;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/13
 * Time: 16:30
 */
public class News implements Serializable{
    private static final long serialVersionUID = 3759976338947406656L;

    private String title;
    private String author;
    private String content;
    private String publishTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
