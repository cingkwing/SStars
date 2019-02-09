package com.example.lihengdong.sstars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Event event=new Event();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //------------------数据库添加数据函数
    private boolean  addEvent(String title,String content)
    {
        event.setContent(content);
        event.setTitle(title);
        if(event.save())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //数据库更改数据函数。
    private void updateEvent(long id,String title,String content)
    {
        event.setTitle(title);
        event.setContent(content);
        event.update(id);
    }
    //----数据库删除函数--------------
    private void deleateEvent(long id)
    {
        event.delete(Event.class,id);
    }
    //-----------数据库查询数据-------根据listview还需要进行修改
    private void queryEvent()
    {
        List<Event> events= DataSupport.findAll(Event.class);
        for(Event event:events)
        {
            event.getTitle();
            event.getContent();
        }
    }
}