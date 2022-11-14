package com.flknlabs.dagger

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var profile: Profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile = injector.profile
        initUI()
    }

    private fun initUI() {
        txtNombre.text = profile.nombre
        txtCompania.text = profile.compania
        txtProfesion.text = profile.profesion
        txtCorreo.text = profile.correo

        txtCorreo.visible()
        txtCorreo.gone()
    }

    fun greetings(view: View) {
        Toast.makeText(this, profile.greetings(), Toast.LENGTH_SHORT).show()
    }
}