package com.ppa.recyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ppa.recyclerviewproject.adapter.CrushAdapter
import com.ppa.recyclerviewproject.model.crush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.recycler_crush)
        val crushPerson = ArrayList<crush>()

        crushPerson.add(crush("The Rock",R.drawable.relationship1,R.drawable.therock))

        crushPerson.add(crush("Chester",R.drawable.relationship2,R.drawable.chester))

        crushPerson.add(crush("Eminem",R.drawable.relationship3,R.drawable.eminem))

        val crushAdapter = CrushAdapter(crushPerson)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = crushAdapter
    }
}
