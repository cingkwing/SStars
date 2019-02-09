package com.example.lihengdong.sstars;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Liheng Dong on 2019/1/25.
 */

public class Login {
    private String account;//登录的账户
    private String password;//登录的密码
    public Login(String account,String password)//构造函数
    {
        this.account=account;
        this.password=password;
    }
    public int connect()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    RequestBody requestBody = new FormBody.Builder()
                            .add("account", account)
                            .add("password", password)
                            .build();
                    Request request = new Request.Builder()
                            .url("127.0.0.1")
                            .post(requestBody)
                            .build();
                    Response response=client.newCall(request).execute();
                    String responseData=response.body().string();
                    int state=dealResponseData(responseData);//处理返回的数据,state表示此次登录的状态比如1代表登录成功，2代表密码错误。。。

                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }).start();
        return 0;
    }
    private int dealResponseData(String responseData)
    {
        ////
        return 0;
    }

}
