package com.example.lihengdong.sstars;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Liheng Dong on 2019/2/9.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String ipAddress,okhttp3.Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
            .url(ipAddress)
            .build();
        client.newCall(request).enqueue(callback);
    }
}