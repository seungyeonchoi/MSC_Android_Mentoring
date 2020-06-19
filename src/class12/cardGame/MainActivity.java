package com.example.myapplication;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    public Boolean isSelect = false;
    public ArrayList<Block> btnBlocks = new ArrayList<>();
    public Button startBtn;
    public Button hintBtn;
    public TextView hideView;
    public Block card = new Block();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        //게임에 쓰일 block 생성
        makeBlock();
        //각종 컴포넌트 init
        startBtn = (Button) findViewById(R.id.startBtn);
        hintBtn = (Button) findViewById(R.id.hintBtn);
        hideView = (TextView) findViewById(R.id.hideView);
        //시작 버튼 눌렀을 때
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBtn.setEnabled(false);
                hintBtn.setEnabled(true);
                hideView.setVisibility(View.GONE);
            }
        });
        //hint버튼 눌렀을 때
        hintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "카드 한 쌍이 오픈됩니다.", Toast.LENGTH_SHORT).show();
                //난수 생성
                int rNum = r.nextInt(btnBlocks.size());
                while(btnBlocks.get(rNum).isTurn){
                    rNum = r.nextInt(btnBlocks.size());
                }
                for (Block block: btnBlocks) {
                    if(block.num == btnBlocks.get(rNum).num
                    && block != btnBlocks.get(rNum)){
                        block.turningT();
                        btnBlocks.get(rNum).turningT();
                        break;
                    }
                }
                hintBtn.setEnabled(false);
            }
        });
        //생성된 블록마다 클릭 이벤트 리스너 달아주기
        for (final Block block: btnBlocks) {
            block.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    block.button.setText(String.valueOf(block.num)); //해당 block이 가지고 있는 고유번호로 text 값 변경
                    if(!isSelect) { //첫 번쨰로 선택한 카드가 아니면
                        card = block;
                    }
                    else{
                        if(card.num == block.num && card != block){
                            card.turningT();
                            block.turningT();
                        }
                        else{
                            new Handler().postDelayed(new Runnable() { //1000ms(1초)가 지나면  아래 run()함수에 구현되어 있는게 실행됨
                                @Override
                                public void run() {
                                    card.turningF();
                                    block.turningF();
                                }
                            }, 1000);
                        }
                    }
                    isSelect = !isSelect;
                    if(checkWin()){ //게임이 끝났는지 검사
                        Toast.makeText(getApplicationContext(),
                                "승리하셨습니다.", Toast.LENGTH_SHORT).show();
                        startBtn.setEnabled(false);
                        hintBtn.setEnabled(false);
                        hideView.setText("축하합니다.\n 승리하셨습니다.");
                        hideView.setVisibility(View.GONE);
                    }
                }
            });
        }
    }
   public void makeBlock(){


       int[] arr = new int[]{0,0,0,0,0,0,0,0};
       for (int i = R.id.button01; i< R.id.button16;i++){
           int rand = r.nextInt(8);
           while(arr[rand]==2){
               rand = r.nextInt(8);
           }
           arr[rand]++;
           btnBlocks.add(new Block(rand, (Button)findViewById(i)));
       }
   }
   public Boolean checkWin(){
       for (Block block: btnBlocks) {
           if(block.isTurn)
               return false;
       }
       return true;
   }

}
class Block{ //c언어에서 구조체 개념
    public int num; //카드 블럭의 고유 번호
    public Boolean isTurn = false; //카드가 open되었는지 여부
    public Button button; //버튼
    public Block(){} //생성자 1
    public Block(int num, Button btn){ //생성자2
        this.num = num;
        this.button = btn;
        this.button.setEnabled(true);
        this.button.setText("♥");
    }
    public void turningF(){
        for (int i = 0; i < 1000000; i++) { //시간 지연
        }
        this.button.setText("♥");
        isTurn = false;
    }
    public void turningT(){
        this.button.setText(String.valueOf(num));
        this.button.setEnabled(false);
        isTurn = true;
    }

}
