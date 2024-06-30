package com.akirachix.blogreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }

    private fun displayBlogs(){
        val blog1 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog2 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog3 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog4 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog5 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog6 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")
        val blog7 = Blogs("2003-18-04", "Terry", "A little life", "I am happy", "", "link", "")

        val blogList = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7)
        val blogsAdapter = BlogsAdapter(blogList)
        binding.rvBlogs.adapter = blogsAdapter
    }
}