package com.example.listviewpart2

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listviewpart2.R.*
import com.example.listviewpart2.R.id.*
import de.hdodenhof.circleimageview.CircleImageView

class DisplayUserData : AppCompatActivity() {


    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_display_user_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val name = intent.getStringExtra("name")
//        val phoneNumber = intent.getStringExtra("phone")
//        val imageId = intent.getIntExtra("imageId", R.drawable.pic3)
//
//        val nameTv = findViewById<TextView>(R.id.txtName)
//        val phoneTv = findViewById<TextView>(R.id.txtPN)
//        val image = findViewById<CircleImageView>(R.id.profile_image)
//
//        nameTv.text = name
//        phoneTv.text = phoneNumber
//        image.setImageResource(imageId)

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val pn = intent.getStringExtra("number")
        val imgID = intent.getIntExtra("imgID" , R.drawable.pic3)


        val txtName = findViewById<TextView>(txtName)
        val txtDescription = findViewById<TextView>(txtDescription)
        val txtNumber = findViewById<TextView>(txtPN)
        val img = findViewById<CircleImageView>(R.id.profile_image)

        txtName.text = name.toString()
        txtDescription.text = description.toString()
        txtNumber.text = pn.toString()
        img.setImageResource(imgID)
    }
}