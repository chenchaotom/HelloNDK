//
// Created by jimmyzhang on 16/3/26.
//
#include<stdio.h>
#include<stdlib.h>
#include<jni.h>
#include"com_hteng_ndk_hello_HelloManager.h"

JNIEXPORT jstring JNICALL Java_com_hteng_ndk_hello_HelloManager_getHelloString
  (JNIEnv * env, jobject clazz){
    return (*env)->NewStringUTF(env,"hello NDK");
}

