package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.calculator.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)
    }

    fun reset(view: View){
        num1.text = null
        num2.text = null
        result.text = "0"
    }
    fun click(view: View){
        val n1 = num1.text.toString()
        val n2 = num2.text.toString()
        when(view.id){
            R.id.add->{
                val added = n1.toInt()+n2.toInt()
                result.text = added.toString()
            }
            R.id.sub->{
                val added = n1.toInt()-n2.toInt()
                result.text = added.toString()
            }
            R.id.mul->{
                val added = n1.toInt()*n2.toInt()
                result.text = added.toString()
            }
            R.id.div->{
                val added = n1.toInt()/n2.toInt()
                result.text = added.toString()
            }
        }
    }

}