package com.senaaslantas.yemektarifi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarifAdapter(private val mContext: Context,private val tariflerListesi:List<Tarifler>)
    :RecyclerView.Adapter<TarifAdapter.cardnesneleritutucu>() {
    inner class cardnesneleritutucu(view: View):RecyclerView.ViewHolder(view){

        var imageViewYemekResim:ImageView
        var textViewBaslik:TextView
        var textViewTarifler:TextView

        init{
            imageViewYemekResim=view.findViewById(R.id.imageViewYemekResim)
            textViewBaslik=view.findViewById(R.id.textViewBaslik)
            textViewTarifler=view.findViewById(R.id.textViewTarif)
        }


    }

    override fun getItemCount(): Int {
        return tariflerListesi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardnesneleritutucu {

        val tasarim=LayoutInflater.from(mContext).inflate(R.layout.card_yemek_tasarim, parent, false)
        return cardnesneleritutucu(tasarim)
    }


    override fun onBindViewHolder(holder: cardnesneleritutucu, position: Int) {
        val tarif=tariflerListesi[position]
        holder.textViewBaslik.text=tarif.yemek_adi
        holder.textViewTarifler.text=tarif.yemek_tarif
        holder.imageViewYemekResim.setImageResource(mContext.resources.getIdentifier(tarif.yemek_resim,"drawable",mContext.packageName))


    }

}