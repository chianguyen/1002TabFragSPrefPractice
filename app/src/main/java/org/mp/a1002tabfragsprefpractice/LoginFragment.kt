package org.mp.a1002tabfragsprefpractice

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater!!.inflate(R.layout.fragment_login, container, false)

        val pref = activity!!.getPreferences(Context.MODE_PRIVATE)

        //CANNOT DO THIS WITHOUT INITIALIZING view, AND NOT IN onCREATE

        view.login_btn.setOnClickListener(){

            var logName = login_user.text.toString()
            var logPwd = login_pwd.text.toString()
            var logableName = pref.getString("key_username", "")
            var logablePwd = pref.getString("key_pwd", "")

            if(logName == logableName && logPwd == logablePwd){

                var myIntent = Intent(activity, HomePage::class.java)
                startActivity(myIntent)

            }
            else{
                Toast.makeText(context, "Wrong credentials", Toast.LENGTH_SHORT).show()
            }
        }

        return view

    }

}