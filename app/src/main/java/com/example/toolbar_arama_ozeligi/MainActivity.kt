package com.example.toolbar_arama_ozeligi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import com.example.toolbar_arama_ozeligi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.title="arama"
        setSupportActionBar(binding.toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_arama,menu)

        //item'i arama butonuna dönüştürdük. Action_ara'nın id'si ile erişip iteme atadık. Ardından onu da SearchView'e bağladık ve böylece bizim action_ara'mız SerachVieW gibi çalışacak
        val item=menu.findItem(R.id.action_ara)
        val search_view=item.actionView as SearchView
        search_view.setOnQueryTextListener(this)





        return super.onCreateOptionsMenu(menu)

    }

    // her harfte arama yapar
    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e(" onQueryTextSubmit",query)
        return true
    }

    // metni tamamen yazdığımızda arama yapar
    override fun onQueryTextChange(newText: String): Boolean {
        Log.e(" onQueryTextSubmit",newText)
       return true
    }
}