package com.hteng.ndk.hello;

/**
 * NDK初步封装类
 * Created by jimmyzhang on 16/3/26.
 */
public class HelloManager {

    private HelloManager(){}

    private static HelloManager instance;

    public synchronized static HelloManager getInstance(){
        if(null == instance){
            instance = new HelloManager();
        }
        return instance;
    }



}
