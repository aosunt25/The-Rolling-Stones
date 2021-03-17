package edu.itesm.primerexamen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter(private val albums : List<Album>)
    : RecyclerView.Adapter<AlbumAdapter.ActorViewHolder>() {

    inner class ActorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.titulo)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }
    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumAdapter.ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.renglon_album,parent, false)
        return ActorViewHolder(renglon_layout)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val album= albums[position]
        holder.nombre.text = album.titulo
        holder.foto.setImageResource(album.foto)
        holder.itemView.setOnClickListener {
            val action = AlbumsFragmentDirections.actionAlbumsFragmentToAlbumFragment(album)
            holder?.itemView.findNavController().navigate(action)

        }
    }

    override fun getItemCount(): Int {
        return albums.size
    }
}