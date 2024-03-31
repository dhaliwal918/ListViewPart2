package com.example.projectforlistview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.example.listviewpart2.R
import de.hdodenhof.circleimageview.CircleImageView


class MyAdapter (val context : Activity , val arrayList: ArrayList<UserData>) : ArrayAdapter<UserData>(context , R.layout.each_row_layout_inlistview , arrayList) {
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_row_layout_inlistview , null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val description = view.findViewById<TextView>(R.id.description)
        val phoneNo = view.findViewById<TextView>(R.id.PhoneNumber)

        name.text = arrayList[position].name.toString()
        description.text = arrayList[position].description.toString()
        phoneNo.text = arrayList[position].phoneNumber.toString()
        image.setImageResource(arrayList[position].imageID)

        return view
    }
}