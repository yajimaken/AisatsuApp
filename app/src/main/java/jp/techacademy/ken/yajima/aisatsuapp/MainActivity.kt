package jp.techacademy.ken.yajima.aisatsuapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.app.TimePickerDialog
import android.util.Log
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)

    }

    override fun onClick(v:View){
        if(v.id==R.id.button){
            showAisatsu()
        }
    }
    private fun showAisatsu(){
        val aisatsu = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if ((hour >= 2) && (hour < 10)) {
                    textView.text = "おはよう"
                } else if ((hour >= 10) && (hour < 18)){
                    textView.text = "こんにちは"
                }else{
                    textView.text="こんばんは"
                }
            },
            0, 0, true)
        aisatsu.show()

    }
}
