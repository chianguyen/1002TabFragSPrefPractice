package org.mp.a1002tabfragsprefpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_unit.view.*

class ItemAdapter (val item: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.textUnit.text = item.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_unit, parent, false))
    }

    override fun getItemCount(): Int {
        return item.size
    }

}


//
class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var textUnit = view.text_unit


}