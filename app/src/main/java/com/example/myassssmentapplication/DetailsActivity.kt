package com.example.myassssessmentapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val entity = intent.getSerializableExtra("entity") as? Entity
        val descriptionView = findViewById<TextView>(R.id.descriptionTextView)
        descriptionView.text = entity?.description ?: "No Description"
    }

    companion object {
        fun newIntent(context: Context, entity: Entity): Intent {
            return Intent(context, DetailsActivity::class.java).apply {
                putExtra("entity", entity)
            }
        }
    }
}
