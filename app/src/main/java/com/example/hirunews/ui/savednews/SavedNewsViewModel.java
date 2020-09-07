package com.example.hirunews.ui.savednews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SavedNewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SavedNewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is saved news fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}