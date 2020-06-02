package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private EditText editTextYear;
    private Button buttonConfirm;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("");


        editTextYear = findViewById<View>(R.id.etBirth)
        buttonConfirm = findViewById<View>(R.id.btnGetAge)

    }

    public fun calculateAge(view:View){
        val dob:String = etBirth.text.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - dob.toInt()
        tvAge.setText("Your Age is $age")
    }
}
