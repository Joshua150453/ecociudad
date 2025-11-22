package com.example.ecociudad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        // *** Establecemos el Toolbar como ActionBar ***
        // Esto permite que NavigationUI maneje automáticamente el título y la flecha.
        setSupportActionBar(toolbar)

        // *** Forzar color NEGRO al título del Toolbar ***
        toolbar.setTitleTextColor(resources.getColor(android.R.color.black))

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // *** Vinculamos el NavController con el ActionBar ***
        setupActionBarWithNavController(navController)

        // *** Forzar la flecha de retroceso a color NEGRO ***
        // NavigationUI a veces la pone blanca, así que debemos volver a pintarla.
        toolbar.navigationIcon?.setTint(resources.getColor(android.R.color.black))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
