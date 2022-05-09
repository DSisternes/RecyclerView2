package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.databinding.ItemObjectBinding
import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemObjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int = videos.size

    class MainHolder(val binding: ItemObjectBinding): RecyclerView.ViewHolder(binding.root){
        fun render(video: JSONObject){
            binding.tvObjectName.setText(video.getString("name"))
            binding.tvFriends.setText(video.getString("friends"))
            binding.tvCommon.setText(video.getString("common"))
            binding.ivObjectThumbnail.setImageResource(R.drawable.object_placeholder)
        }
    }
}