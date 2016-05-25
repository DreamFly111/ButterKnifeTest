package duoy.cn.butterknifetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn)
    Button btn;

    @Bind(R.id.text1)
    TextView textView1;

    @Bind(R.id.text2)
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注册
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.btn,R.id.text1,R.id.text2})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn:
                Toast.makeText(this,"btn",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.text1:
                Toast.makeText(this,"text1",Toast.LENGTH_LONG).show();
                break;
            case R.id.text2:
                Toast.makeText(this,"text2",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
