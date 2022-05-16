package com.example.letsdoit.ui.getUser

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.letsdoit.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class GetUserFragment :DaggerFragment(){
    companion object{
        fun newInstance():GetUserFragment= GetUserFragment()
    }
    @Inject
    lateinit var getUserViewModel: GetUserViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_get_random_user,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize(){
        getUserViewModel.getRandomUser()
        getUserViewModel.userData.observe(this, Observer {
            Log.i("GetUserFragment","$it.")
        })

    }
}