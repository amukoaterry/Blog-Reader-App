package com.akirachix.blogreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter(var blogList: List<Blogs>):
    RecyclerView.Adapter<BlogsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
       var itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_card, parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blog = blogList[position]
        holder.date.text = blog.date
        holder.name.text = blog.name
        holder.title.text = blog.title
        holder.preview.text = blog.preview
        holder.seemore.text = blog.seemore
    }

    override fun getItemCount(): Int {
       return blogList.size
    }
}


class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var date = itemView.findViewById<TextView>(R.id.tvDate)
    var name = itemView.findViewById<TextView>(R.id.tvName)
    var title = itemView.findViewById<TextView>(R.id.tvTitle)
    var preview = itemView.findViewById<TextView>(R.id.tvPreview)
    var seemore = itemView.findViewById<TextView>(R.id.tvSeemore)

}