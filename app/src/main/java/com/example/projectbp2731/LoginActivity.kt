package com.example.projectbp2731

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.projectbp2641.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin: Button = findViewById(R.id.buttonLog)
        val txtUsername:EditText = findViewById(R.id.editText)
        val txtPassword : EditText = findViewById(R.id.editText2)
        val logObj = Login()


        btnLogin.setOnClickListener{

            //input
            logObj.username = txtUsername.text.toString()
            logObj.password = txtPassword.text.toString()

            if(logObj.loginCheck() && true){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else {
                Toast.makeText(this, "Login gagal",Toast.LENGTH_SHORT).show()
            }
        }



//        btnLogin.setOnClickListener{
//            if(txtUsername.text.toString().equals("dimas") && txtPassword.text.toString().equals("123")){
//                val intent = Intent(this,HomeActivity::class.java)
//                startActivity(intent)
//            }else{
//                Toast.makeText(this, "Login gagal",Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}