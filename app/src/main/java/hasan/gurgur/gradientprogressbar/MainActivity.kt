package hasan.gurgur.gradientprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hasan.gurgur.gradientprogressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var progressValue = 0
        var newProgressValue = progressValue
        binding.btnIncrease.setOnClickListener {
            var newProgressValue = progressValue + 10
            binding.activityMainProgressBarCalories.progress = newProgressValue
            progressValue = newProgressValue

            if (newProgressValue == 100) {
                Toast.makeText(this, "Proggress is done!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnDecrease.setOnClickListener {

            newProgressValue = progressValue - 10
            binding.activityMainProgressBarCalories.progress = newProgressValue
            progressValue = newProgressValue

            if (newProgressValue == 0) {
                Toast.makeText(this, "This value cannot be lower than 0", Toast.LENGTH_SHORT).show()
            }


        }

    }
}