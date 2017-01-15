package com.coolweather.app.util;

/**
 * Created by Fuzm on 2017/1/15 0015.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
