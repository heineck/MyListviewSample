package com.heineck.mylistviewsample.buttoninsidelistview;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.heineck.mylistviewsample.R;
import com.heineck.mylistviewsample.swipelistview.MyGestureListener;

/**
 * Created by vheineck on 20/04/15.
 */
public class MyCustomListAdapter extends ArrayAdapter<Model> {

    private Context ctx;
    private Model[] rows;

    public MyCustomListAdapter(Context context, int resource, Model[] objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.rows = objects;
    }

    static class ViewHolder {
        
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int arg0) {
        return names[arg0];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(ctx).inflate(
                    R.layout.list_row_item, null);
            final ViewHolder holder = new ViewHolder();
            holder.container = (RelativeLayout) convertView
                    .findViewById(R.id.container);
            holder.userName = (TextView) convertView.findViewById(R.id.name);
            holder.mDetector = new GestureDetectorCompat(ctx,
                    new MyGestureListener(ctx, convertView));
            convertView.setTag(holder);

        }
        final ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.userName.setText(names[position]);
        holder.container.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                holder.mDetector.onTouchEvent(event);
                return true;
            }
        });

        return convertView;
    }

}
