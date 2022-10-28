package com.example.weatherkitandroidm3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // データを用意
        val data = listOf(
            mapOf("name" to "沖縄", "detail" to "晴れ"),
            mapOf("name" to "大阪", "detail" to "曇り"),
            mapOf("name" to "東京", "detail" to "雨"),
        )

        val list = findViewById<ListView>(R.id.list)
        list.adapter = SimpleAdapter(
            this,
            data,
            android.R.layout.simple_list_item_2,
            arrayOf("name", "detail"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )
    }
}