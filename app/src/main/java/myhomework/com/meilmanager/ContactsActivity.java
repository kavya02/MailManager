package myhomework.com.meilmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import myhomework.com.meilmanager.adapter.ContactListViewAdapter;
import myhomework.com.meilmanager.adapter.EmailListViewAdapter;
import myhomework.com.meilmanager.model.EmailData;
import myhomework.com.meilmanager.model.UserInfomation;

public class ContactsActivity extends Activity {
    private ImageView mImgPlus, mImgFilter;
    private ListView mListContacts;

    public static List<UserInfomation> mainData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        initUI();
    }
    public void initUI() {
        mImgPlus = (ImageView)findViewById(R.id.imgPlus);
        mImgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ContactsActivity.this, ContactActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mImgFilter = (ImageView) findViewById(R.id.imgFilter);

        mainData = new ArrayList<UserInfomation>();
        for (int i = 0; i < 13; i ++) {
            UserInfomation sampleData = new UserInfomation("Sender"+i, "Subject"+i, "Body"+i,"MyName"+i, "LastName"+i);
            mainData.add(sampleData);
        }
        mListContacts = (ListView) findViewById(R.id.listContact);
        mListContacts.setAdapter(new ContactListViewAdapter(this, (ArrayList) mainData));

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent iner = new Intent(ContactsActivity.this, MainActivity.class);
        startActivity(iner);
        finish();
    }

}
