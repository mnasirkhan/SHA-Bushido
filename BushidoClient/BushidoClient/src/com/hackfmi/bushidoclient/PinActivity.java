package com.hackfmi.bushidoclient;

import com.hackfmi.bushidoclient.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class PinActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        
        EditText et = (EditText) findViewById(R.id.editText1);
        
        et.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after){}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count){
                //System.out.println(et.getText().toString());
                System.out.println(s);
            }
        });         
        
    }
}
