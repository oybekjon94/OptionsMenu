package uz.oybekdev.optionsmenu

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import uz.oybekdev.optionsmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            android.R.id.home -> {
                onBackPressed()
            }
            R.id.white -> {
                binding.root.setBackgroundColor(Color.WHITE)
            }
            R.id.black -> {
                binding.root.setBackgroundColor(Color.BLACK)

            }
            R.id.red -> {
                binding.root.setBackgroundColor(Color.RED)

            }
            R.id.green -> {
                binding.root.setBackgroundColor(Color.GREEN)

            }

        }

        return super.onOptionsItemSelected(item)
    }
}