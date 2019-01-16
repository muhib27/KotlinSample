package com.classtune.kotlinsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onClick(v: View) {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        when(v){
//            button -> gotoActivitySecond();
//
//        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.text);
//        val button = findViewById<Button>(R.id.button);
//        button.setOnClickListener(this);


//        textView.setText("Test")
//        button.setOnClickListener {
//            textView.setText("Yes");
//        }
        fragmentTransaction()
    }

   fun gotoActivitySecond(){
      // Intent i = new Intent(this, SecondActivity.class )
       //val i = onNewIntent(MainActivity.this, SecondActivity.class);
       val intent = Intent(this, SecondActivity::class.java)
       startActivity(intent);

   }

    fun fragmentTransaction(){
        // Get the text fragment instance
        val imageFragment = FirstFragment()

        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container
        transaction.replace(R.id.container,imageFragment)
        transaction.addToBackStack(null)

        // Finishing the transition
        transaction.commit()
    }

    fun addFragmentToActivity(manager: FragmentManager, fragment: Fragment, frameId: Int) {
        val transaction = manager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()
    }
}
