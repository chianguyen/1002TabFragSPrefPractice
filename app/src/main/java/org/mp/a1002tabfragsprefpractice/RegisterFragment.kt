package org.mp.a1002tabfragsprefpractice

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater!!.inflate(R.layout.fragment_register, container, false)
        var sp = activity!!.getPreferences(Context.MODE_PRIVATE)

        view.reg_btn.setOnClickListener() {

            var regname = reg_user.text.toString()
            var regpwd = reg_pwd.text.toString()

            var editor = sp.edit()

            editor.putString("key_username", regname)
            editor.putString("key_pwd", regpwd)

            editor.commit()
        }

        return view
    }
}

