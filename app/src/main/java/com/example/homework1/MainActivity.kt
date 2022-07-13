package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.homework1.constance.Constance
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bResult.setOnClickListener {
            var name = bindingClass.tvName.text.toString()
            bindingClass.imPhoto.visibility = View.VISIBLE
            Log.d("MyLog", "ID error = ${R.drawable.error_auth}")

            when (name){
                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Андрей (Директор) получает зарплату ${Constance.DIRECTOR_SALARY} тенге."
                    if(bindingClass.tvPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.face_1)
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.error_auth)
                    }
                }
                Constance.MANAGER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Василий (Менеджер) получает зарплату ${Constance.MANAGER_SALARY} тенге."
                    if(bindingClass.tvPassword.text.toString() == Constance.MANAGER_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.face_2)
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.error_auth)
                    }
                }
                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Сергей (Дворник) получает зарплату ${Constance.DVORNIK_SALARY} тенге."
                    if(bindingClass.tvPassword.text.toString() == Constance.DVORNIK_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.face_3)
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.error_auth)
                    }
                }
                else-> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Такой работник у нас не работает"
                    bindingClass.imPhoto.setImageResource(R.drawable.error_auth)
                }
            }
        }
    }
}