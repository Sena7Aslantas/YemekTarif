package com.senaaslantas.yemektarifi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tariflerArrayList: ArrayList<Tarifler>
    private lateinit var adapter: TarifAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val tarif1=Tarifler("Elibögrunde","jjfdkjdkjfhfjdsk","img.png")
        val tarif2=Tarifler("Tarhana corbası","nhdjsskjdh","img_1.png")
        val tarif3=Tarifler("Cökertme Kebabı","jddjsdhgdndhdh","img_2.png")
        val tarif4=Tarifler("Pizza","lskdjdhsjsshhd","img_3.png")
        val tarif5=Tarifler("Makarna","jdhdjshdgdjdhd","img_4.png")
        val tarif6=Tarifler("Tarator","skjuyddufyyf","img_5.png")
        val tarif7=Tarifler("Salata","kdjdhjshggdd","img_6.png")
        val tarif8=Tarifler("Sufle","jdhdhsjsjjd","img_7.png")
        val tarif9=Tarifler("Kurabiye","jjdjjhchmzja","img_8.png")
        val tarif10=Tarifler("magnolya","cjdfhdjdddksk","img_9.png")

        tariflerArrayList=ArrayList<Tarifler>()
        tariflerArrayList.add(tarif1)
        tariflerArrayList.add(tarif2)
        tariflerArrayList.add(tarif3)
        tariflerArrayList.add(tarif4)
        tariflerArrayList.add(tarif5)
        tariflerArrayList.add(tarif6)
        tariflerArrayList.add(tarif7)
        tariflerArrayList.add(tarif8)
        tariflerArrayList.add(tarif9)
        tariflerArrayList.add(tarif10)

        adapter= TarifAdapter(this,tariflerArrayList)
        rv.adapter=adapter


    }
}



