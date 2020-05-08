package com.scjun.junny.app_1301;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        weight = (EditText) findViewById(R.id.weight); //ui에 있는 edit text 위젯과 연결
        height = (EditText) findViewById(R.id.height); //ui에 있는 edit text 위젯과 연결
        button = (Button) findViewById(R.id.button); //ui에 있는 edit text 위젯과 연결
        button.setOnClickListener(listener); //button을 눌렀을 때 프로그램이 감지할 수 있도록 listener 달아줌
    }
    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            String resultString="";
            double bmi=Integer.parseInt(weight.getText().toString()) / Math.pow(Integer.parseInt(height.getText().toString())/100.0,2.0);
            //bmi 지수 계산 수식을 코드로 구현함
            /*
            * Integer.parseInt(String s) : s로 들어온 문자열을 int형으로 변환해줌 (이때, s는 숫자 형식만 가능)
            * Math.pow(double a , double b): a^b 를 계산해줌
            * */
            if (bmi >= 35.0) { //bmi지수가 35 이상
                resultString = "고도 비만";
            }else if(bmi >= 23) { //bmi 지수가 23 이상
                resultString = "과체중";
            }else if(bmi >= 18.5){ //bmi 지수가 18.5 이상
                resultString = "정상";
            } else { //위의 3가지 경우를 제외한 모든 경우
                resultString = "저체중";
            }
            Toast.makeText(getApplicationContext(),resultString,Toast.LENGTH_SHORT).show();
        }
    };


}
