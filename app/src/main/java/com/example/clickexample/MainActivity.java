package com.example.clickexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isTest = false; //Android Studio에서 수정함

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면을 담당하는 xml파일과 로직을 담당하는 Activity파일을 하나로 묶어주는 코드
        setContentView(R.layout.activity_main);
        //화면이 연결됬으니, 이 시점부터 xml에 작성한 뷰 위젯들을 찾아올 수 있다
        final EditText myEdit = findViewById(R.id.myEdit);
        Button getBtn = findViewById(R.id.getBtn);
        final TextView resultTxt = findViewById(R.id.resultTxt);

        String week = "asdas";
        //todo : 이거 아닌가?
        //TODO : git Test하


        //찾아온 버튼에 클릭이벤트 달기
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  버튼이 클릭되었을 때 실행되어야 할 코드를 이곳에서 작성

                //1. 에딧텍스트에서 사용자가 작성한 문자열 가져오기
                String getText = myEdit.getText().toString();
                //2. 가져온 문자열을 찾아온 텍스트뷰에 넣어주기
                resultTxt.setText(getText);
                //3. 토스트 메시지 띄우기
                /**
                 * context : 어떤 화면에서 띄우고 싶은지에 대한 정보값
                 * text : 띄우고 싶은 문자열
                 * duration : 몇 초간 화면에 띄울지의 시간
                 */
                Toast.makeText(MainActivity.this, getText, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
