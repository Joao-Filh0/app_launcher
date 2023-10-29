package com.example.app_launcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.view.View
import com.example.app_launcher.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity;


class MainActivity : AppCompatActivity() ,View.OnClickListener{
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)
        binding.callFlutterStart.setOnClickListener(this)
        supportActionBar!!.hide()
    }

    override fun onClick(v: View) {
        if(v.id == R.id.call_flutter_start){

            startActivity(
                FlutterActivity
                    .withNewEngine()
                    .initialRoute("home")
                    .build(this)
            )
        }
    }
}