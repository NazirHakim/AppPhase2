package com.zealplex.appphase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nazir on 08-Nov-17.
 */

public class MyAdapter extends ArrayAdapter <String>{

    String[] names;
    int [] logo;
    Context mContext;

    public MyAdapter(Context context, String[] companyNames, int[] companyLogo) {
        super(context, R.layout.listview_item);
        this.names = companyNames;
        this.logo = companyLogo;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mLogo = (ImageView) convertView.findViewById(R.id.logoView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.companyNameText);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder =(ViewHolder)convertView.getTag();
        }
            mViewHolder.mLogo.setImageResource(logo[position]);
            mViewHolder.mName.setText(names[position]);
        return convertView;
    }

    static class ViewHolder{
        ImageView mLogo;
        TextView mName;
    }
}
