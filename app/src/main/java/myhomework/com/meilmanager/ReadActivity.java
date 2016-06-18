package myhomework.com.meilmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ReadActivity extends Activity {
    private ImageView mImgDelete;
    private Button mBtnReply, mBtnTTL;
    private TextView mTxtToEmail, mTxtSubject, mTxtBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        initUI();
    }
    public void initUI() {
        mImgDelete = (ImageView)findViewById(R.id.imgDelete);
        mImgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ReadActivity.this, MainActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mBtnReply = (Button) findViewById(R.id.btnReply);
        mBtnReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ReadActivity.this, ComposeActivity.class);
                startActivity(iner);
                finish();
            }
        });

        mTxtToEmail = (TextView) findViewById(R.id.etxtFilter);
        mTxtSubject = (TextView) findViewById(R.id.txtSubject);
        mTxtBody    = (TextView) findViewById(R.id.txtBody);


    }
}
