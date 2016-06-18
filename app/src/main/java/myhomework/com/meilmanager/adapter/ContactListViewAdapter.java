package myhomework.com.meilmanager.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import myhomework.com.meilmanager.ComposeActivity;
import myhomework.com.meilmanager.ContactActivity;
import myhomework.com.meilmanager.R;
import myhomework.com.meilmanager.model.UserInfomation;

public class ContactListViewAdapter extends BaseAdapter {

    ArrayList<UserInfomation> marrList;
    private LayoutInflater layoutInflater;
    private Context mContext;

    public ContactListViewAdapter(Context context, ArrayList listData) {
        this.marrList = listData;
        layoutInflater = LayoutInflater.from(context);
        mContext = context;
    }

    public int getCount() {
        return marrList.size();
    }
    @Override
    public Object getItem(int position) {
        return marrList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.row_contact, null);

            holder = new ViewHolder();
            holder.txtContactName = (TextView) convertView.findViewById(R.id.txtContactName);
            holder.imgSetting = (ImageView) convertView.findViewById(R.id.imgSetting);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final UserInfomation newsItem = marrList.get(position);
        holder.txtContactName.setText(newsItem.getFirstName());



        holder.imgSetting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent iner = new Intent(mContext, ContactActivity.class);
                mContext.startActivity(iner);
                // TODO Auto-generated method stub
//                Intent myIntent = new Intent(mContext, DetailActivity.class);
//                myIntent.putExtra("bookingID", newsItem.getBookingID());
//                myIntent.putExtra("OrderEmail", newsItem.getOrderEmail());
//                myIntent.putExtra("DoctorEmail", newsItem.getDoctorEmail());
//                myIntent.putExtra("BookingDate", newsItem.getBookingDate());
//                myIntent.putExtra("BookingTime", newsItem.getBookingTime());
//                mContext.startActivity(myIntent);
            }
        });
        convertView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent iner = new Intent(mContext, ComposeActivity.class);
                mContext.startActivity(iner);
                // TODO Auto-generated method stub
//                Intent myIntent = new Intent(mContext, DetailActivity.class);
//                myIntent.putExtra("bookingID", newsItem.getBookingID());
//                myIntent.putExtra("OrderEmail", newsItem.getOrderEmail());
//                myIntent.putExtra("DoctorEmail", newsItem.getDoctorEmail());
//                myIntent.putExtra("BookingDate", newsItem.getBookingDate());
//                myIntent.putExtra("BookingTime", newsItem.getBookingTime());
//                mContext.startActivity(myIntent);
            }
        });

        return convertView;
    }
//row datas to viewed in a line recored
    static class ViewHolder {
        protected TextView txtContactName;
        protected ImageView imgSetting;
    }
}
