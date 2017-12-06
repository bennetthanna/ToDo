package com.hannabennett.to_do;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HannaBennett on 12/5/17.
 */

public class ToDoListFragment extends Fragment {
    private RecyclerView mToDoRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_to_do_list, container, false);

        mToDoRecyclerView = (RecyclerView) view.findViewById(R.id.to_do_recycler_view);
        mToDoRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
