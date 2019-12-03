package com.example.firstapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChatsFragment extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chats_fragment, container,false);
        listView = (ListView)view.findViewById(R.id.listview);
        List<Map<String, Object>> list = getData();
        listView.setAdapter(new ListViewAdapter(getActivity(), list));
        return view;
    }

    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 9; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
//            map.put("image", R.drawable.ic_launcher);
            map.put("title", "这是一个标题"+i);
            map.put("info", "这是一个详细信息" + i);
            list.add(map);
        }
        return list;
    }
}