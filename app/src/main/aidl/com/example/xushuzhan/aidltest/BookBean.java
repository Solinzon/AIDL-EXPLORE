package com.example.xushuzhan.aidltest;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xushuzhan on 2017/10/23.
 */

public class BookBean implements Parcelable {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookBean(String name, int price) {
        this.name = name;
        this.price = price;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.price);
    }

    public void readFromParcel(Parcel dest) {
        this.name = dest.readString();
        this.price = dest.readInt();
    }

    protected BookBean(Parcel in) {
        this.name = in.readString();
        this.price = in.readInt();
    }

    public static final Creator<BookBean> CREATOR = new Creator<BookBean>() {
        @Override
        public BookBean createFromParcel(Parcel source) {
            return new BookBean(source);
        }

        @Override
        public BookBean[] newArray(int size) {
            return new BookBean[size];
        }
    };
}
