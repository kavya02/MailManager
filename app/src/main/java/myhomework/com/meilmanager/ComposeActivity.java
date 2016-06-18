package myhomework.com.meilmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import myhomework.com.meilmanager.adapter.EmailListViewAdapter;
import myhomework.com.meilmanager.model.EmailData;

public class ComposeActivity extends Activity {
    private ImageView mImgDelete, mImgProcess;
    private Button mBtnSent;
    private EditText mETxtToEmail, mETxtSubject, mETxtBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        initUI();
    }
    public void initUI() {
        mImgDelete = (ImageView)findViewById(R.id.imgDelete);
        mImgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ComposeActivity.this, MainActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mImgProcess = (ImageView) findViewById(R.id.imgProcess);

        mBtnSent = (Button) findViewById(R.id.buttonSent);
        mBtnSent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ComposeActivity.this, MainActivity.class);
                startActivity(iner);
                finish();
            }
        });

        mETxtToEmail = (EditText) findViewById(R.id.etxtToEmail);
        mETxtToEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ComposeActivity.this, ContactsActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mETxtSubject = (EditText) findViewById(R.id.etxtSubject);
        mETxtBody    = (EditText) findViewById(R.id.etxtBody);


    }
}
