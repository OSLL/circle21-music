package com.bigri239.easymusic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_help.*

@Suppress("DEPRECATION")
class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }

    override fun onStart() {
        super.onStart()

        val intent = Intent(this, MainActivity::class.java)
        back_H.setOnClickListener {
            back_H.isClickable = false
            startActivity(intent)
        }

        val intent11 = Intent(this, AuthorsActivity::class.java)
        authors.setOnClickListener {
            authors.isClickable = false
            startActivity(intent11)
        }

        val intent12 = Intent(this, FaqActivity::class.java)
        frequently.setOnClickListener {
            terms.isClickable = false
            startActivity(intent12)
        }

        val intent13 = Intent(this, TermsActivity::class.java)
        terms.setOnClickListener {
            terms.isClickable = false
            intent13.putExtra("isStart", "false")
            startActivity(intent13)
        }
    }
}