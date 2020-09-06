package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ass5.Employee
import com.example.ass5.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? =intent.extras
        var newEmployee :Employee? = data?.getParcelable<Employee>("EmpData")
        nameText.text= "Employee Name : ${newEmployee?.name}"
        genderText.text = "Gender : ${newEmployee?.gender}"
        emailText.text = "E-mail : ${newEmployee?.email}"
        salaryText.text = "Salary : ${newEmployee?.salary}"

    }

    fun Close(view : View){
        finish()
    }

}
