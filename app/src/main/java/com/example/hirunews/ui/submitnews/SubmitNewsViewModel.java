package com.example.hirunews.ui.submitnews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SubmitNewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SubmitNewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is submit news fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}