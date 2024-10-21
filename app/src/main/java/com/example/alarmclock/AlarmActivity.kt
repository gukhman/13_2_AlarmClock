package com.example.alarmclock

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class AlarmActivity : BaseActivity() {

    private lateinit var stopAlarmButton: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        setupWindowInsets(R.id.alarm)
        setupToolbar(R.id.toolbar, true)

        stopAlarmButton = findViewById(R.id.stopAlarmButton)
        imageView = findViewById(R.id.imageView)

        Glide.with(this)
            .asGif()
            .load(R.drawable.ring)
            .override(600, 600)
            .into(imageView)

        stopAlarmButton.setOnClickListener {
            AlarmRingtoneManager.ringtone?.stop()
            finish()
        }
    }
}
