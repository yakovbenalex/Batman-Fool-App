package ru.opalevapps.batmangiveup

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var mSound: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBatman1: Button = findViewById(R.id.buttonBatman1)
        val buttonBatman2: Button = findViewById(R.id.buttonBatman2)
        val buttonBatman3: Button = findViewById(R.id.buttonBatman3)
        val buttonBatman4: Button = findViewById(R.id.buttonBatman4)
        val buttonBatman5: Button = findViewById(R.id.buttonBatman5)
        val buttonBatman6: Button = findViewById(R.id.buttonBatman6)
        val buttonBatman7: Button = findViewById(R.id.buttonBatman7)

        buttonBatman1.setOnClickListener {
            playSoundFromRaw(R.raw.you_dont_get_anything_giveup)
        }
        buttonBatman2.setOnClickListener {
            playSoundFromRaw(R.raw.i_am_not_afraid_you)
        }
        buttonBatman3.setOnClickListener {
            playSoundFromRaw(R.raw.giveup1)
        }
        buttonBatman4.setOnClickListener {
            playSoundFromRaw(R.raw.giveup2)
        }
        buttonBatman5.setOnClickListener {
            playSoundFromRaw(R.raw.giveup3)
        }
        buttonBatman6.setOnClickListener {
            playSoundFromRaw(R.raw.i_will_destroy_you_a_nursing_profession)
        }
        buttonBatman7.setOnClickListener {
            playSoundFromRaw(R.raw.giveup_if_you_want_live)
        }
    }

    override fun onResume() {
        super.onResume()
        mSound = MediaPlayer()
    }

    private fun playSoundFromRaw(soundRawId: Int) {
        mSound = MediaPlayer.create(this, soundRawId)
        mSound.start()
        mSound.setOnCompletionListener { mediaPlayer ->
            mediaPlayer.release()
        }
    }
}