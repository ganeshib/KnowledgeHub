package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cardsSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cards_section)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val android=findViewById<TextView>(R.id.android)
        val webDev=findViewById<TextView>(R.id.web)
        val java=findViewById<TextView>(R.id.java)
        val ml=findViewById<TextView>(R.id.ml)
        val bc=findViewById<TextView>(R.id.blockChain)
        val db=findViewById<TextView>(R.id.database)
        val btn=findViewById<Button>(R.id.button)

        android.setOnClickListener{
            intent= Intent(applicationContext,aboutAndroid::class.java)
            startActivity(intent);
        }


        webDev.setOnClickListener{
            intent=Intent(applicationContext,aboutWebdev::class.java)
            startActivity(intent)
        }


        java.setOnClickListener{
            intent= Intent(applicationContext,aboutJava::class.java)
            startActivity(intent);
        }


        ml.setOnClickListener{
            intent=Intent(applicationContext,aboutML::class.java)
            startActivity(intent)
        }



        bc.setOnClickListener{
            intent=Intent(applicationContext,aboutBlockchain::class.java)
            startActivity(intent)
        }


        db.setOnClickListener{
            val intent=Intent(applicationContext,aboutDB::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener{
            val intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:9741943696"));
            startActivity(intent);
        }
    }
}