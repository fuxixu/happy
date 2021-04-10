package com.example.mes.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mes.R;

public class TabThirdfragment extends Fragment {


    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 根据布局文件fragment_tab_first.xml生成视图对象
      mView = inflater.inflate(R.layout.fragment_tab_third, container, false);
        String desc = String.format("我是%s页面，来自%s",
                "第三页", getArguments().getString("tag"));
        TextView tv_first = mView.findViewById(R.id.tv_third);
        tv_first.setText( desc);

        return mView;




    }
}
