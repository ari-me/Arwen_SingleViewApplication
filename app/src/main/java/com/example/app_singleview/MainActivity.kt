package com.example.app_singleview

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import android.widget.TextView
import android.speech.tts.TextToSpeech
import java.util.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    lateinit var tts: TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //Variables connecting XML Elements to Kotlin File
        val button = findViewById(R.id.button) as Button
        val Cheese_b = findViewById(R.id.cheese) as ImageButton
        val Egg_b = findViewById(R.id.egg) as ImageButton
        val Fries_b = findViewById(R.id.fries) as ImageButton
        val Bread_b = findViewById(R.id.bread) as ImageButton
        val Rice_b = findViewById(R.id.rice) as ImageButton
        val Noodles_b = findViewById(R.id.noodles) as ImageButton
        val Candy_b = findViewById(R.id.candy) as ImageButton
        val Hotdog_b = findViewById(R.id.hotdog) as ImageButton

        //Boolean Variables
        var cheese = false
        var egg = false
        var fries = false
        var bread = false
        var rice = false
        var noodles = false
        var candy = false
        var hotdog = false

        //Event Listeners for Image Buttons
        Cheese_b.setOnClickListener {
            Toast.makeText(this, "CHEESE", Toast.LENGTH_LONG).show()
            cheese = true
        }
        Egg_b.setOnClickListener {
            Toast.makeText(this, "EGG", Toast.LENGTH_LONG).show()
            egg = true
        }
        Fries_b.setOnClickListener {
            Toast.makeText(this,"FRIES", Toast.LENGTH_LONG).show()
            fries = true
        }
        Bread_b.setOnClickListener {
            Toast.makeText(this,"BREAD", Toast.LENGTH_LONG).show()
            bread = true
        }
        Rice_b.setOnClickListener {
            Toast.makeText(this,"RICE", Toast.LENGTH_LONG).show()
            rice = true
        }
        Noodles_b.setOnClickListener {
            Toast.makeText(this,"NOODLES", Toast.LENGTH_LONG).show()
            noodles = true
        }
        Candy_b.setOnClickListener {
            Toast.makeText(this,"CANDY", Toast.LENGTH_LONG).show()
            candy = true
        }
        Hotdog_b.setOnClickListener {
            Toast.makeText(this,"HOTDOG", Toast.LENGTH_LONG).show()
            hotdog = true
        }

        //Equals Button Event Listener
        button.setOnClickListener {
            showDialog(cheese, egg, fries, bread, rice, noodles, candy, hotdog);
            //Code to reset the Boolean Variables
            cheese = false
            egg = false
            fries = false
            bread = false
            rice = false
            noodles = false
            candy = false
            hotdog = false
        }
    }
    
    //Pop-up View Function
    private fun showDialog(cheese: Boolean, egg: Boolean, fries: Boolean, bread: Boolean, rice: Boolean, noodles: Boolean, candy: Boolean, hotdog: Boolean){
        val mContext: Context = this 

        val dialog = Dialog(mContext)
        dialog.setContentView(R.layout.popup_design);
        dialog.create()
        val Image = dialog.findViewById<View>(R.id.combinationImage) as ImageView

        //Else If Statement Verifying what Image to show and Speech to Say depending on the buttons pressed
        if (egg == true){
            if (fries==true) {
                Image.setImageResource(R.drawable.fries_egg);
                Speech("You have combined Egg and Fries to make Frigg! A norse mythology!")
            }
            else if (bread==true){
                Image.setImageResource(R.drawable.bread_egg);
                Speech("You have made an Egg Sandwich!")
            }
            else if (cheese==true){
                Image.setImageResource(R.drawable.cheese_egg);
                Speech("You have made some Cheesy Scrambled Eggs!")
            }
            else if (candy==true){
                Image.setImageResource(R.drawable.egg_candy);
                Speech("You have made a Chocolate Egg!")
            }
            else if (rice==true){
                Image.setImageResource(R.drawable.rice_egg);
                Speech("You have made an Egg Sushi!")
            }
            else if (noodles==true){
                Image.setImageResource(R.drawable.egg_noodles);
                Speech("You have made an Egg Noodle!")
            }
            else if (hotdog==true){
                Image.setImageResource(R.drawable.egg_hotdog);
                Speech("You have made Egg and Hotdogs!")
            }
        }
        else if (fries==true){
            if (bread==true){
                Image.setImageResource(R.drawable.bread_fries);
                Speech("You have made Bread Sticks!")
            }
            else if (cheese==true){
                Image.setImageResource(R.drawable.cheese_fries);
                Speech("You have made Cheesy Fries!")
            }
            else if (candy==true){
                Image.setImageResource(R.drawable.fries_candy);
                Speech("You have made Gummy Fries!")
            }
            else if (rice==true){
                Image.setImageResource(R.drawable.fries_rice);
                Speech("You have made Fried Rice!")
            }
            else if (noodles==true){
                Image.setImageResource(R.drawable.fries_noodles);
                Speech("You have combined Fries and Noodles to make a Froodle! A type of dog breed.")
            }
            else if (hotdog==true){
                Image.setImageResource(R.drawable.hotdog_fries);
                Speech("You have made a Hotdog & Fries Meal!")
            }
        }
        else if (bread==true){
            if (cheese==true){
                Image.setImageResource(R.drawable.cheese_bread);
                Speech("You have made a Grilled Cheese Sandwich!")
            }
            else if (candy==true){
                Image.setImageResource(R.drawable.bread_candy);
                Speech("You have made a Donut!")
            }
            else if (rice==true){
                Image.setImageResource(R.drawable.bread_rice);
                Speech("You have made Onigiri!")
            }
            else if (noodles==true){
                Image.setImageResource(R.drawable.bread_noodles);
                Speech("You have made a Noodle Taco!")
            }
            else if(hotdog==true){
                Image.setImageResource(R.drawable.bread_hotdog);
                Speech("You have made a Hotdog Sandiwch!")
            }
        }
        else if (cheese==true){
            if (candy==true){
                Image.setImageResource(R.drawable.cheese_candy);
                Speech("You have made Cheese Flavored Candy!")
            }
            else if (rice==true){
                Image.setImageResource(R.drawable.rice_cheese);
                Speech("You have combined the words Rice and Cheese to make Reeses!")
            }
            else if (noodles==true){
                Image.setImageResource(R.drawable.cheese_noodles);
                Speech("You have made Macaroni and Cheese!")
            }
            else if (hotdog==true){
                Image.setImageResource(R.drawable.cheese_hotdog)
                Speech("You have made some Cheesy Hotdogs!")
            }
        }
        else if (candy==true){
            if (rice==true){
                Image.setImageResource(R.drawable.rice_candy);
                Speech("You have made a Rice Crispy!")
            }
            else if (noodles==true){
                Image.setImageResource(R.drawable.noodles_candy);
                Speech("You have combined the words Candy and Noodles to make a Candle!")
            }
            else if (hotdog==true){
                Image.setImageResource(R.drawable.hotdog_candy);
                Speech("You have made Hotdog Gummies!")
            }
        }
        else if (rice==true){
            if (noodles==true){
                Image.setImageResource(R.drawable.rice_noodles);
                Speech("You have made combined the words Rice and Noodles to make Riddles!")
            }
            else if (hotdog==true){
                Image.setImageResource(R.drawable.hotdog_rice);
                Speech("You have made Hotdog and Rice!")
            }
        }
        else if (noodles==true){
            if (hotdog==true){
                Image.setImageResource(R.drawable.hotdog_noodles);
                Speech("You have made Noodles with Hotdogs!")
            }
        }

        //Event listener to close Pop-Up Window
        Image.setOnClickListener{
            dialog.dismiss()
        }

        dialog.show()
    }
    
    //Audio Function
    private fun Speech(combination: String){
        tts=TextToSpeech(applicationContext, TextToSpeech.OnInitListener{
            if(it==TextToSpeech.SUCCESS) {
                tts.language = Locale.US
                tts.setSpeechRate(2.05F)
                tts.speak(combination, TextToSpeech.QUEUE_ADD, null)
            }
        });
    }
}
