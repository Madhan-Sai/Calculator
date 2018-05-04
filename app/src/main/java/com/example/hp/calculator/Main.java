package com.example.hp.calculator;

//import android.app.usage.UsageEvents;
//import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    Double fnum,snum,result;
    char operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0=(Button) findViewById(R.id.button0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("0");
            }
        });
        Button num1=(Button) findViewById(R.id.button1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("1");
            }
        });
        Button num2=(Button) findViewById(R.id.button2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("2");
            }
        });
        Button num3=(Button) findViewById(R.id.button3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("3");
            }
        });
        Button num4=(Button) findViewById(R.id.button4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("4");
            }
        });
        Button num5=(Button) findViewById(R.id.button5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("5");
            }
        });
        Button num6=(Button) findViewById(R.id.button6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("6");
            }
        });
        Button num7=(Button) findViewById(R.id.button7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("7");
            }
        });
        Button num8=(Button) findViewById(R.id.button8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("8");
            }
        });
        Button num9=(Button) findViewById(R.id.button9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.append("9");
            }
        });

        Button add=(Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                operation='+';
                editText.setText("");
            }
        });

        Button sub=(Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                operation='-';
                editText.setText("");
            }
        });

        Button mul=(Button) findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                operation='*';
                editText.setText("");
            }
        });

        Button div=(Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                operation='/';
                editText.setText("");
            }
        });

        Button eq=(Button) findViewById(R.id.equal);
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                snum=Double.valueOf(editText.getText().toString());
                switch(operation)
                {
                    case '+':result=fnum+snum;break;
                    case '-':result=fnum-snum;break;
                    case '*':result=fnum*snum;break;
                    case '/':result=fnum/snum;break;

                }
                editText.setText(result.toString());
            }
        });

        Button clr=(Button) findViewById(R.id.clear);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText("");
            }
        });

        Button pow=(Button) findViewById(R.id.power);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                result=fnum*fnum;
                editText.setText(result.toString());
            }
        });

        Button sqr=(Button) findViewById(R.id.sqr);
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                fnum=Double.valueOf(editText.getText().toString());
                Double temp=Math.sqrt(fnum);
                editText.setText(temp.toString());
            }
        });

    }
}
