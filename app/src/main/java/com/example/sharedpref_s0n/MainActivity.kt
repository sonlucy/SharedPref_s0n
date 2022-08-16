package com.example.sharedpref_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpref_s0n.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//체크값이 체인지되면 어떡할거니 .하는 setOnCheckedChangeListener 사용
        autoLoginCheckBox.setOnCheckedChangeListener { buttonView,  isChecked ->

// 지금 체크된 상황을 그대로 -> ContextUtil을 이용해 자동로그인 여부로 저장.

            ContextUtil.setAutoLogin(this, isChecked)  //이 화면에서, isChecked가 어떻게되었는지 그대로 체크할거야.

        }

//        화면이 만들어지면 -> 저장된 자동로그인 여부 값을 체크박스에 반영하는 작업.
        autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)

    }
}