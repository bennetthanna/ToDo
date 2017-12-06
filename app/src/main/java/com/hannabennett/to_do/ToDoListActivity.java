package com.hannabennett.to_do;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDoListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ToDoListFragment();
    }
}
