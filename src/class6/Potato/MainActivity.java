package com.scjun.junny.app_1301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CheckBox> checkList; //체크박스 배열
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        //체크박스 배열 생성
        checkList = new ArrayList<>();
        //체크박스를 체크박스 배열에 삽입
        checkList.add((CheckBox)findViewById(R.id.checkbox01));
        checkList.add((CheckBox)findViewById(R.id.checkbox02));
        checkList.add((CheckBox)findViewById(R.id.checkbox03));
        checkList.add((CheckBox)findViewById(R.id.checkbox04));
        checkList.add((CheckBox)findViewById(R.id.checkbox05));
        checkList.add((CheckBox)findViewById(R.id.checkbox06));
        checkList.add((CheckBox)findViewById(R.id.checkbox07));
        checkList.add((CheckBox)findViewById(R.id.checkbox08));
        checkList.add((CheckBox)findViewById(R.id.checkbox09));
        checkList.add((CheckBox)findViewById(R.id.checkbox10));
        //각 체크박스마다 check event발생에 따른 동작 설정
        for (int i = 0; i < checkList.size(); i++) {
            checkList.get(i).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    int imgNum = getResources().getIdentifier(buttonView.getText().toString(),"id",getPackageName());
                    ImageView imgView = (ImageView) findViewById(imgNum);
                    //체크 하기
                    if(isChecked){
                        imgView.setVisibility(ImageView.VISIBLE);
                    }
                    //해제하기
                    else{
                        imgView.setVisibility(ImageView.INVISIBLE);
                    }
                }
            });
        }

    }



}
