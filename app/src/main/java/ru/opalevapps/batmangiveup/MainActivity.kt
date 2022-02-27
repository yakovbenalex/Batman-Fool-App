package ru.opalevapps.batmangiveup

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBatman1: Button = findViewById(R.id.button_batman1)
        val buttonBatman2: Button = findViewById(R.id.button_batman2)
        val buttonBatman3: Button = findViewById(R.id.button_batman3)
        val buttonBatman4: Button = findViewById(R.id.button_batman4)
        val buttonBatman5: Button = findViewById(R.id.button_batman5)

        buttonBatman1.setOnClickListener {
            MediaPlayer.create(this, R.raw.you_dont_get_anything_giveup).start()
        }
        buttonBatman2.setOnClickListener {
            MediaPlayer.create(this, R.raw.i_am_not_afraid_you).start()
        }
        buttonBatman3.setOnClickListener {
            MediaPlayer.create(this, R.raw.giveup1).start()
        }
        buttonBatman4.setOnClickListener {
            MediaPlayer.create(this, R.raw.giveup2).start()
        }
        buttonBatman5.setOnClickListener {
            MediaPlayer.create(this, R.raw.giveup3).start()
        }
    }
}