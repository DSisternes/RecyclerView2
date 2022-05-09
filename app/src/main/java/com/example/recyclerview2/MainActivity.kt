package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview2.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"name\": \"Diego Sisternes\", \"friends\": \"Amigos en común\", \"common\": \"32 \"}"),
            JSONObject("{\"name\": \"Jessica MT\", \"friends\": \"Amigos en común\", \"common\": \"2 \"}"),
            JSONObject("{\"name\": \"Pamela SD\", \"friends\": \"Amigos en común\", \"common\": \"67 \"}"),
            JSONObject("{\"name\": \"Carlos Cesar Hernández\", \"friends\": \"Amigos en común\", \"common\": \"12 \"}"),
            JSONObject("{\"name\": \"Dulce Ácido\", \"friends\": \"Amigos en común\", \"common\": \"15 \"}")

        )

        binding.rvObjectEntries.adapter = MainAdapter(fakeVideoData)
    }

}