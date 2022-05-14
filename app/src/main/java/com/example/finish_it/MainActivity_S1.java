package com.example.finish_it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.util.Locale;

public class MainActivity_S1 extends AppCompatActivity {
    private Button button;
    private EditText edittext;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_s1);
        button= findViewById(R.id.button);
        edittext= findViewById(R.id.input);
        textview= findViewById(R.id.output);
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }



    }





    public boolean check(String to_check,String input){
        boolean flag= true;
        if(to_check.length()<=input.length()){
            int length= to_check.length();
            for(int i=0;i<length;i++){
                if(to_check.charAt(i)!=input.charAt(i))
                { flag=false;break;}
            }
            return flag;
        }
         return false;
    }

    public void rest_of_Task(String output,String input){

    }

    public void translate_get_input(View view){
        String input= edittext.getText().toString();
        String output="";
        input=input.toLowerCase();

        Python py=Python.getInstance();
        final PyObject pyobj =py.getModule("script");
        PyObject obj=pyobj.callAttr("main",3,5);
        String demo_output="finish_it";
        textview.setText(obj.toString()+"This is a demo output "+demo_output+"This is the input "+input );

   }


}