package com.example.lihengdong.sstars;

import org.litepal.crud.DataSupport;

/**
 * Created by Liheng Dong on 2019/2/9.
 */

public class Event extends DataSupport{
    private int id;
    String title;
    String content;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getContent()
    {
        return this.content;
    }
    public void setContent(String content)
    {
        this.content=content;
    }

}
