package com.ppa.recyclerviewproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ppa.recyclerviewproject.R
import com.ppa.recyclerviewproject.model.crush
import kotlinx.android.synthetic.main.findcrush_layout.view.*

class CrushViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
      var name = itemView.findViewById<TextView>(R.id.profile_name)

      var profileImage = itemView.findViewById<ImageView>(R.id.profile_image)

      var postImage = itemView.findViewById<ImageView>(R.id.post_image)
}
class CrushAdapter (var crushList: ArrayList<crush>):RecyclerView.Adapter<CrushViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrushViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.findcrush_layout, parent, false)
        return CrushViewHolder(view)
    }

    override fun getItemCount(): Int {
        return crushList.size
    }

    override fun onBindViewHolder(holder: CrushViewHolder, position: Int) {
        holder.name.text = crushList[position].name
        holder.profileImage.setImageResource(crushList[position].profile)
        holder.postImage.setImageResource(crushList[position].postImage)
    }
}
