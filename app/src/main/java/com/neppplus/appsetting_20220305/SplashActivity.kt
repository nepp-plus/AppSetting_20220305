package com.neppplus.appsetting_20220305

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        2.5초 후에, 메인화면으로 이동

        val myHandler = Handler( Looper.getMainLooper() )

        myHandler.postDelayed( {

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//            이동 후에는 Splash 화면 종료
            finish()

        }, 2500 )



    }
}