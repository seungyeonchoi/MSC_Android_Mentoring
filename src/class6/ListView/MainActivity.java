package com.scjun.junny.app_1301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init() {
        listView = findViewById(R.id.listView);
        ArrayList<HashMap<String,String>> array = new  ArrayList<HashMap<String,String>>(); //array
        HashMap<String, String> map = new HashMap<String, String>(); //map(key, value)
        //데이터 넣기
        map.put("item1","person1");
        array.add(map);
        map = new HashMap<String, String>();
        map.put("item1","person2");
        array.add(map);
        map = new HashMap<String, String>();
        map.put("item1","person3");
        array.add(map);
        //단일 선택모드(라디오 버튼)
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
  //      SimpleAdapter adapter = new SimpleAdapter(this,array,android.R.layout.simple_list_item_single_choice, new String[]{"item1},  new int[] {android.R.id.text1, android.R.id.text2});

        //체크박스(멀티플 초이스)
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        SimpleAdapter adapter = new SimpleAdapter(this,array,android.R.layout.simple_list_item_multiple_choice
                , new String[]{"item1"},  new int[] {android.R.id.text1, android.R.id.text2});


        //2중 데이터 보여주기 모드
//        ArrayList<HashMap<String,String>> array = new  ArrayList<HashMap<String,String>>(); //array
//        HashMap<String, String> map = new HashMap<String, String>(); //map(key, value)
//        //데이터 1 추가
//        map.put("item1","person1");
//        map.put("item2","person1-tel");
//        array.add(map);
//        //데이터2 추가
//        map = new HashMap<String, String>();
//        map.put("item1","person2");
//        map.put("item2","person2-tel");
//        array.add(map);
//        //데이터3 추가
//        map = new HashMap<String, String>();
//        map.put("item1","person3");
//        map.put("item2","person3-tel");
//        array.add(map);
//        //listview 와 데이터 연결
//        SimpleAdapter adapter = new SimpleAdapter(this,array,android.R.layout.simple_list_item_2, new String[]{"item1","item2"},  new int[] {android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
