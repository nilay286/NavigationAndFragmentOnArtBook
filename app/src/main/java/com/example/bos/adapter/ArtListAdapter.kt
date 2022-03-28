package com.example.bos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.bos.model.Art
import com.example.bos.databinding.ItemRowBinding
import com.example.bos.view.ArtListDirections


class ArtListAdapter(val artList : List<Art>) : RecyclerView.Adapter<ArtListAdapter.ArtHolder>() {

    class ArtHolder(val binding : ItemRowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArtHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtHolder, position: Int) {

        holder.binding.artNameText.text = artList[position].artName
        holder.itemView.setOnClickListener {
            val action = ArtListDirections.actionArtListToDetailFragment(
                id= artList[position].id,
                info = "old")
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return artList.size
    }

}
