// IBookManager.aidl
package com.example.xushuzhan.aidltest;

// Declare any non-default types here with import statements
import com.example.xushuzhan.aidltest.BookBean;//虽然在同一个包下面，但是依然需要导包
interface IBookManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
    //定义返回书本的方法
    BookBean getBook();
    //定义添加书本的方法，这里的 in 代表数据的流向是：客户端->服务端，服务端对数据的任何修改都不会影响到客户端
    void addBook(in BookBean book);
}