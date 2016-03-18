package com.example.yingcanliu.learndesignlib.ViewModel;

import android.databinding.BaseObservable;

import com.example.yingcanliu.learndesignlib.Model.CardVM;

/**
 * Created by yingcan.liu on 2016/3/16.
 */
public class CardViewModel extends BaseObservable {

    private CardVM mCardVM;

    public CardViewModel(CardVM cardVM){
        if(cardVM == null){
            throw  new NullPointerException("cardVM cannot be null");
        }
        mCardVM = cardVM;
    }

    public void setImgUrl(String url){
        mCardVM.setImgUrl(url);
        notifyChange();
    }

    public void setDescription(String des){
        mCardVM.setDescription(des);
        notifyChange();
    }

    public String getDescription(){
        return mCardVM.getDescription();
    }

    public String getImgUrl(){
        return mCardVM.getImgUrl();
    }
}
