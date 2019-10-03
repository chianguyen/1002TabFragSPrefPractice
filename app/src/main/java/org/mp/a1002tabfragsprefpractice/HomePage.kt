package org.mp.a1002tabfragsprefpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {

    val items : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //use function below to add item
        addJobs()

        //Call the layout manager (MUST) in 'this' context
        recycler_list.layoutManager = LinearLayoutManager(this)

        //Call the adapter to put items into the layout manager
        recycler_list.adapter = ItemAdapter(items, this)


    }

    fun addJobs() {
        //Add items
        items.add("Nuclear Engineer")
        items.add("Detective")
        items.add("Crime Scene Investigatior")
        items.add("Army Personnel")
        items.add("Chocolate Beer Specialist")
          }

}
