package com.example.drawablexmlpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1.기본액션바 불러내기
        val defaultActionBar = supportActionBar!!

        // 액션바 모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        // 어떤 커스텀뷰를 설정할건지 설정
        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)
    }
}