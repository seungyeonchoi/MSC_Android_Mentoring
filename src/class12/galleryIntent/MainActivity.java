package com.example.myapplication;


import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    int SELECT_IMAGE = 100;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);   //imageview 객체 생성
        initPermission(); //permission 정보 확인 및 획득
    }

    public void onClick(View view) { //이미지 가져오기 버튼 눌렀을 떄 작동
        Intent intent = new Intent(Intent.ACTION_PICK); //intent 타입으로 action_pick 설정
        intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);  //intent로 주고받을 데이터를 image데이터로 설정
        intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, SELECT_IMAGE); //intent 넘겨주기

    }

    public void initPermission() { //갤러리 접근 권한 확인
        if (!checkAppPermission(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE})) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("권한 허용").setMessage("반드시 이미지 데이터에 대한 권한이 허용되어야 합니다.");
            builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    askPermission(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, SELECT_IMAGE);
                }

            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } else {
            Toast.makeText(getApplicationContext(),
                    "권한이 승인되었습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean checkAppPermission(String[] requestPermission) { //권한이 승인되어있는지 확인
        Boolean[] requestResult = new Boolean[requestPermission.length];
        for (int i = 0; i<requestPermission.length;i++){
            requestResult[i] = ContextCompat.checkSelfPermission(this, requestPermission[i]) == PackageManager.PERMISSION_GRANTED;
            if (!requestResult[i]) {
                return false;
            }
        }
        return true;
    } // checkAppPermission

    public void askPermission(String[] requestPermission, int REQ_PERMISSION) { //권한 요청
        ActivityCompat.requestPermissions(this, requestPermission, REQ_PERMISSION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) { //갤러리에서 이미지 선택했을 때 이미지뷰에 띄워줌
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SELECT_IMAGE) {
            if (resultCode == Activity.RESULT_OK) {
                imageView.setImageURI(data.getData()); //'data' 타입으로 값 들어옴
            }
        }
    }


}
