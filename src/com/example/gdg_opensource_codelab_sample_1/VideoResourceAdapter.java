package com.example.gdg_opensource_codelab_sample_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class VideoResourceAdapter extends ArrayAdapter<JsonVideoResource>{

    public VideoResourceAdapter(Context context, List<JsonVideoResource> objects) {
        super(context, 0, objects);
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.video_resource_item, null);
        }
        
        
        JsonVideoResource res = getItem(position);
        
        TextView tv1 = (TextView) convertView.findViewById(R.id.video_title);
        TextView tv2 = (TextView) convertView.findViewById(R.id.video_description);
        
        tv1.setText(res.snippet.title);
        tv2.setText(res.snippet.description);
        
        return convertView;
    }


}//end of class