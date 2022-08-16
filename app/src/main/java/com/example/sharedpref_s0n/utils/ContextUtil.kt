package com.example.sharedpref_s0n.utils

import android.content.Context

class ContextUtil {


    companion object {

        private val prefName="TestPref"  //메모장 파일 이름에 대응되는 개념

        private val AUTO_LOGIN = "AUTO_LOGIN"  //자동완성으로 오타실수 줄이기위해

        fun setAutoLogin(context:Context, autoLogin:Boolean) {

            val pref= context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()  //메모장 파일 열렷고, 수정모드로 . 불린을 자동로그인항목에 저장할거임.
            //어떤 값을 저장할지는 그때그때 넘겨받는 autoLogin에 들어있는 불린값이 저장되게할거임.
            //메모장의 저장버튼 같은 기능 -> apply()


        }
    }

}