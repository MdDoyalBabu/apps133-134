package com.example.apps133_134;

import android.widget.Button;
import android.widget.TextView;

public class DatasetGet {

    private String titile,descripiton,study;
    private int img;
    private Button calDemo;
    private String moblileNumber;



    public String getMoblileNumber() {
        return moblileNumber;
    }

    public void setMoblileNumber(String moblileNumber) {
        this.moblileNumber = moblileNumber;
    }

    public Button getCalDemo() {
        return calDemo;
    }

    public void setCalDemo(Button calDemo) {
        this.calDemo = calDemo;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }
   public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
