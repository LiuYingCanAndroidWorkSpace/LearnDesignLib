package com.example.yingcanliu.learndesignlib.Model;

/**
 * Created by yingcan.liu on 2016/3/16.
 */
public class CardVM {

    private String imgUrl;
    private String description;

    public CardVM(String url, String des){
        imgUrl = url;
        description = des;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
