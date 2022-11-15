package com.example.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.model.DataClassRecycler

class MainActivity : AppCompatActivity() {

    private lateinit var recycler : RecyclerView
    private lateinit var buttonFragment1: Button
    private lateinit var buttonFragment2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<fragmentFirst>(R.id.fragment)
            }
        }

        buttonFragment1 = findViewById(R.id.fragment1)
        buttonFragment1.setOnClickListener {

        }



        val listNames = mutableListOf<DataClassRecycler>()

        recycler = findViewById(R.id.recycler)
        recycler.adapter = WhatsappAdapter(listNames)
        recycler.layoutManager = LinearLayoutManager(this)


        listNames.add(
            DataClassRecycler(R.drawable.image, "Tayna", "Te amo cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Erick", "Você é o cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Alessandra", "Você é o melhor")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Pedro", "Vamos andar de skate cara ?")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Haroldo", "Vamos para Minas Gerais")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Neide", "Vamos para a igreja")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Tayna", "Te amo cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Erick", "Você é o cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Alessandra", "Você é o melhor")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Pedro", "Vamos andar de skate cara ?")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Haroldo", "Vamos para Minas Gerais")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Neide", "Vamos para a igreja")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Tayna", "Te amo cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Erick", "Você é o cara")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Alessandra", "Você é o melhor")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Pedro", "Vamos andar de skate cara ?")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Haroldo", "Vamos para Minas Gerais")
        )
        listNames.add(
            DataClassRecycler(R.drawable.image, "Neide", "Vamos para a igreja")
        )




    }
    inner class WhatsappAdapter(val list: List<DataClassRecycler>): RecyclerView.Adapter<WhatsappViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhatsappViewHolder {
            val inflater = layoutInflater.inflate(R.layout.recycler, parent, false)
            return WhatsappViewHolder(inflater)
        }

        override fun onBindViewHolder(holder: WhatsappViewHolder, position: Int) {
            val posi = list[position]
            holder.bind(posi)
        }

        override fun getItemCount(): Int {
            return list.size
        }

    }
    inner class WhatsappViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(view: DataClassRecycler){

            val image : ImageView = itemView.findViewById(R.id.img_person)
            val txtName : TextView = itemView.findViewById(R.id.name_person)
            val txtText : TextView = itemView.findViewById(R.id.txt_person)

            image.setImageResource(view.img)
            txtName.text = view.name
            txtText.text = view.txt
        }
    }
}