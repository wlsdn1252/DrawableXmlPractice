package com.example.drawablexmlpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    // 액션바에 있는 UI를 담아둘 변수
    // 변수 : 맴버변수 => 담아주는 행위 : onCerate
    lateinit var toastBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1.기본액션바 불러내기
        val defaultActionBar = supportActionBar!!

        // 액션바 모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        // 어떤 커스텀뷰를 설정할건지 설정
        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

        // 커스텀뷰를 들고있는 툴바 저장
        val toolbar = defaultActionBar.customView.parent as Toolbar

        // 액션바의 여백 설정 여부
        toolbar.setContentInsetsAbsolute(0,0)

        // 커스텀 액션바에 달아둔 버튼의 id찾는 방법
        toastBtn = defaultActionBar.customView.findViewById(R.id.toastBtn)
        
        toastBtn.setOnClickListener {
            Toast.makeText(this, "액션바를 통한 토스트", Toast.LENGTH_SHORT).show()
        }


    }
}