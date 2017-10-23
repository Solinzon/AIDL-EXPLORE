package com.example.xushuzhan.aidltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by xushuzhan on 2017/10/23.
 */

public class BookService extends Service {
    private static final String TAG = "BookService";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return  iBookManager;
    }
    //采用直接初始系统通过.aidl文件自动生成的IBookManager.Stub这个Binder类，在onBind方法中返回给客户端
    IBookManager.Stub iBookManager = new IBookManager.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            //这个默认方法只是告诉我们AIDL支持的7中基本类型，没什么作用，定义的时候删掉都可

        }

        @Override
        public BookBean getBook() throws RemoteException {
            return new BookBean("第一行代码", 70);

        }

        @Override
        public void addBook(BookBean book) throws RemoteException {
            Log.d(TAG, "addBook: 执行添加一本书的方法");
        }


    };


}