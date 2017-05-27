package com.zkx.mykotlin

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new.*

/**
 * Author：zhangkx on 2017/5/26 18:30
 * Email：zkx9025@163.com
 */

class NewActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        //初始化控件
        initView()
    }
    fun initView(){
        method_add.setOnClickListener { Toast.makeText(this,""+add(3,5),Toast.LENGTH_SHORT).show() }
        method_add_two.setOnClickListener { Toast.makeText(this,""+add2(3,5),Toast.LENGTH_SHORT).show() }
    }

    /**
     * 正常加减法运算
     */
    fun add(a:Int,b:Int) :Int{
        return a+b;
    }

    /**
     * 自推导
     */
    fun add2(a:Int,b    : Int) = a + b
}
