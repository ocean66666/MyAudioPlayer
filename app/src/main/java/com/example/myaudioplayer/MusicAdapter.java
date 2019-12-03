package com.example.myaudioplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {

    private int resourceId;

    public MusicAdapter(Context context, int resource, List<Music> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        Music music = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.song_name = view.findViewById(R.id.song_name);
            viewHolder.singer = view.findViewById(R.id.singer);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.song_name.setText(music.getSongName().toString());
        viewHolder.singer.setText(music.getSinger().toString());
        return view;
    }

    class ViewHolder{
        TextView song_name;
        TextView singer;
    }
}