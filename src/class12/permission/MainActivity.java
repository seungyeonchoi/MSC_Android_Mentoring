package com.example.myapplication;


import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    int PERMISSION_REQUEST = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPermission();
    }
    public void initPermission() { //permission 권한 정보 확인
        if (!checkAppPermission(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA, Manifest.permission.INTERNET})) {
            //예시: 카메라, 전화, 인터넷
            AlertDialog.Builder builder = new AlertDialog.Builder(this); //alert view dialog 생성작업
            builder.setTitle("권한 허용").setMessage("반드시 해당 데이터에 대한 권한이 허용되어야 합니다."); //title, 세부 message 설정
            builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){ //ok버튼 클릭했을 때의 동작
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //각 permission별로 수락 여부 확인 -> 비동의 상태이면 동의를 요청하는 alertview 띄움
                    askPermission(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA, Manifest.permission.INTERNET}, PERMISSION_REQUEST);
                }

            });
            AlertDialog alertDialog = builder.create(); //alertview 실제 생성
            alertDialog.show(); //alert view 보이기
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
    }

    public void askPermission(String[] requestPermission, int REQ_PERMISSION) { //권한 요청
        ActivityCompat.requestPermissions(this, requestPermission, REQ_PERMISSION);
    }
}
