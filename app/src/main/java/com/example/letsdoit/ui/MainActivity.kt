package com.example.letsdoit.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.letsdoit.R
import com.example.letsdoit.ui.getUser.GetUserFragment
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        showFragment(GetUserFragment.newInstance(), "GetUserFragment")
    }

    private fun showFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_main_container, fragment, tag)
            .addToBackStack(tag)
            .commit()
    }
}