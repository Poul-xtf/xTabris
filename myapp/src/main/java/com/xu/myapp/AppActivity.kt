package com.xu.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xu.tabrisdemo.MainActivity

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }

    fun enter(view: View) {
        startActivity(Intent(this,MainActivity::class.java))
    }
}
