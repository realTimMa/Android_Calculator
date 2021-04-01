package com.qut.ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.qut.ex2.model.ItemInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    public FirstFragment() {
        // 添加一些账单信息
        List<ItemInfo> lists=new ArrayList<>();
        lists.add(new ItemInfo("五花肉",new Date(),100,"山东省菏泽市曹县王集镇"));
        lists.add(new ItemInfo("刘鸣",new Date(),10,"山东省东明市城关街道五四路南门"));
        lists.add(new ItemInfo("小马哥",new Date(),43,"山东省泰安市***********"));
        lists.add(new ItemInfo("李凯强",new Date(),32,"山东省东营市东营区中国石油大学"));
        lists.add(new ItemInfo("包容以",new Date(),180,"山东省聊城市临清***********"));
    }

}