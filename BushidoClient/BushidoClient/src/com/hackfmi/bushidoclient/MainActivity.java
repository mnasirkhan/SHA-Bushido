package com.hackfmi.bushidoclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.hackfmi.bushidoclient.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
        Wifi.connect(MainActivity.this,"tester","password12345678901234567890");
        //System.out.println(BushidoHelper.getPhoneID(MainActivity.this));

        // RSA rsa = new RSA();
        // String s = rsa.Encrypt("Test");
        // System.out.println("RSA Encrypt : " + s);
        // System.out.println("RSA Decrypt : " + rsa.Decrypt(s));
        
        Intent intent = new Intent(this, PinActivity.class);
        startActivity(intent);


        Log.d("BUSHIDO", "Line: " + new Throwable().getStackTrace()[0].getLineNumber() + " | App created!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BUSHIDO", "App resumed!");

    }

}
