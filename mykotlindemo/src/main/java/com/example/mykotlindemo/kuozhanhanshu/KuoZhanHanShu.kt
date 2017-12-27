package com.example.mykotlindemo.kuozhanhanshu

import android.content.Context
import android.widget.TextView
import android.widget.Toast

/**
 * Created by zhangxutong on 2017/12/27.
 */
class KuoZhanHanShu {
    public var TextView.text: CharSequence
        get() = text
        set(value) {
            text = value
        }
}

fun Context.myToast(msg: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()

}