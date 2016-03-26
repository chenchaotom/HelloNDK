package com.hteng.ndk.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invokeHello(View view){
        Toast.makeText(view.getContext(),HelloManager.getInstance().getHelloString(),Toast.LENGTH_LONG).show();
    }
}
