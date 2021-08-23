package com.neppplus.jicbangcopyapp_2021_08_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        로딩화면 3초 정도 노출 후에 메인화면으로 이동
//        인텐트 관련 코드를 3초 후에 실행을 배워보자(Handler / postDelayed 함수)
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed(
            {
                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
                finish()
                              }, 2000)
//        괄호 안에 뒤에 적은 3000millis(3초) 시간 후에 실행 될 코드를 넣어라

    }
}