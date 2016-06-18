package myhomework.com.meilmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactActivity extends Activity {
    private ImageView mImgProfilePhoto, mImgDelete, mImgSearch;
    private TextView mTxtName, mTxtPublicKey;
    private Button mBtnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initUI();
    }
    public void initUI() {
        mImgProfilePhoto = (ImageView)findViewById(R.id.imgProfilePhoto);
        mImgDelete = (ImageView) findViewById(R.id.imgDelete);
        mImgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ContactActivity.this, ContactsActivity.class);
                startActivity(iner);
                finish();
            }
        });
        mImgSearch = (ImageView) findViewById(R.id.imgFilter);

        mTxtName = (TextView) findViewById(R.id.etxtFilter);
        mTxtPublicKey = (TextView) findViewById(R.id.txtPublicKey);

        mBtnSave = (Button) findViewById(R.id.btnSave);
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iner = new Intent(ContactActivity.this, ContactsActivity.class);
                startActivity(iner);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent iner = new Intent(ContactActivity.this, ContactsActivity.class);
        startActivity(iner);
        finish();
    }
}
