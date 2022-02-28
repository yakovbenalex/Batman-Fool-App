package ru.opalevapps.batmangiveup

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
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
        buttonBatman6.setOnClickListener {
            MediaPlayer.create(this, R.raw.i_will_destroy_you_a_nursing_profession).start()
        }
        buttonBatman7.setOnClickListener {
            MediaPlayer.create(this, R.raw.giveup_if_you_want_live).start()
        }
    }
}