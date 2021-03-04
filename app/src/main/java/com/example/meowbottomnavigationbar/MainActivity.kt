package com.example.meowbottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.meowbottomnavigationbar.databinding.ActivityMainBinding
import com.example.meowbottomnavigationbar.fragment.*


class MainActivity : AppCompatActivity() {
    private lateinit var bindind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bindind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindind.root)
        addFragment(HomeFragment())
        bindind.bottomNavigation.show(0)
        bindind.bottomNavigation.add(MeowBottomNavigation.Model(0,R.drawable.ic_home))
        bindind.bottomNavigation.add(MeowBottomNavigation.Model(4,R.drawable.ic_person))
        bindind.bottomNavigation.add(MeowBottomNavigation.Model(1,R.drawable.ic_explorer))
        bindind.bottomNavigation.add(MeowBottomNavigation.Model(2,R.drawable.ic_chat))
        bindind.bottomNavigation.add(MeowBottomNavigation.Model(3,R.drawable.ic_notify))

        bindind.bottomNavigation.setOnClickMenuListener {
            when(it.id){
                0 ->{
                    replaceFragment(HomeFragment())

                }1 ->{
                replaceFragment(ExplorerFragment())

                }2 ->{
                replaceFragment(ChatFragment())

                }3 ->{
                replaceFragment(NotificationFragment())

                }4 ->{
                replaceFragment(ProfileFragment())

                }
                else ->{
                    replaceFragment(HomeFragment())
                }
            }
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(bindind.fragmentContainer.id,fragment) .addToBackStack(Fragment::class.java.simpleName).commit()
        }
    private fun addFragment(fragment: Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(bindind.fragmentContainer.id,fragment) .addToBackStack(Fragment::class.java.simpleName).commit()
    }
    }
