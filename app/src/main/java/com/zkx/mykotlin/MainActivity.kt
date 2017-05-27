package com.zkx.mykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import butterknife.ButterKnife

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var mHellow: Button? = null
    private var mToast: Button? = null
    private var mJump: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        //初始化控件
        initView()
    }

    private fun initView() {
        mHellow = findViewById(R.id.hellow) as Button
        mToast = findViewById(R.id.toast) as Button
        mJump = findViewById(R.id.jum) as Button
        //为控件设置点击监听
        mHellow!!.setOnClickListener(this)
        mToast!!.setOnClickListener(this)
        mJump!!.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    override fun onClick(view: View) {
        when (view.id) {
            R.id.hellow -> mHellow!!.text = "Hellow Kotlin!"
            R.id.toast -> Toast.makeText(applicationContext, "Hellow Kotlin!", Toast.LENGTH_SHORT).show()
            R.id.jum -> startActivity(Intent(this, NewActivity::class.java))
        }
    }
}
