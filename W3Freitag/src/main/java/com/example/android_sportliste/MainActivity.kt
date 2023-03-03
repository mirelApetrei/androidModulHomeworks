package com.example.android_sportliste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android_sportliste.adapter.ItemAdapter
import com.example.android_sportliste.data.Datasource
import com.example.android_sportliste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val tennismen = Datasource().loadPlayers()

        binding.recycleView.adapter = ItemAdapter(this, tennismen)
        binding.recycleView.setHasFixedSize(true)


    }
}