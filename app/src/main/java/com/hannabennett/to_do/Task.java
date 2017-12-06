package com.hannabennett.to_do;

import java.util.Date;
import java.util.UUID;

/**
 * Created by HannaBennett on 12/5/17.
 */

public class Task {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mCompleted;

    public Task() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mCompleted = false;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isCompleted() {
        return mCompleted;
    }

    public void setCompleted(boolean completed) {
        mCompleted = completed;
    }
}
