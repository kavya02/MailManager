package myhomework.com.meilmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import myhomework.com.meilmanager.adapter.EmailListViewAdapter;
import myhomework.com.meilmanager.model.EmailData;

public class MainActivity extends Activity {
    private ImageView mImgSetting, mImgUser, mImgEdit;
    private ListView mListEmail;

    public static List<EmailData> mainData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }
    public void initUI() {
        mImgSetting = (ImageView)findViewById(R.id.imgSetting);
        mImgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mImgUser = (ImageView) findViewById(R.id.imgUser);
        mImgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(iner);
                finish();
            }
        });

        mImgEdit = (ImageView) findViewById(R.id.imgEdit);
        mImgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(MainActivity.this, ComposeActivity.class);
                startActivity(iner);
                finish();
            }
        });

        mainData = new ArrayList<EmailData>();
        for (int i = 0; i < 3; i ++) {
            EmailData sampleData = new EmailData("Sender"+i, "Subject"+i, "Body"+i);
            mainData.add(sampleData);
        }
        mListEmail = (ListView) findViewById(R.id.listEmail);
        mListEmail.setAdapter(new EmailListViewAdapter(this, (ArrayList) mainData));

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
