package com.bankasia.smartapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var imageViewHeaderMenuClose: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.draver_layout)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)
        val hView = navigationView.getHeaderView(0)
        imageViewHeaderMenuClose = hView.findViewById(R.id.closeHeader)
        imageViewHeaderMenuClose.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.END)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuToUse = R.menu.my_right_side_menu
        val inflater = menuInflater
        inflater.inflate(menuToUse, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun Menu(item: MenuItem?) {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END)
        } else {
            drawerLayout.openDrawer(GravityCompat.END)
        }
    }
}