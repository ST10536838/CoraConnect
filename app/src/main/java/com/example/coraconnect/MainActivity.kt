package com.example.coraconnect // Ensure this matches your package name

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btnGetSuggestion = findViewById<Button>(R.id.btnGetSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val edtSuggestionDisplay = findViewById<TextView>(R.id.edtSuggestionDisplay)


        btnGetSuggestion.setOnClickListener {
            val timeInput = edtTime.text.toString().trim().lowercase()


            if (timeInput.isEmpty()) {
                edtSuggestionDisplay.text = "Please enter a time of day to see a spark!"
            }

            else if (timeInput == "morning") {
                edtSuggestionDisplay.text = "Send a \"Good morning\" text to a family member."
            }
            else if (timeInput == "mid-morning") {
                edtSuggestionDisplay.text = "Reach out to a colleague with a quick \"Thank you.\""
            }
            else if (timeInput == "afternoon") {
                edtSuggestionDisplay.text = "Share a funny meme or interesting link with a friend."
            }
            else if (timeInput == "afternoon snack time") {
                edtSuggestionDisplay.text = "Send a quick \"thinking of you\" message."
            }
            else if (timeInput == "dinner") {
                edtSuggestionDisplay.text = "Call a friend or relative for a 5-minute catch-up."
            }
            else if (timeInput == "after dinner" || timeInput == "night") {
                edtSuggestionDisplay.text = "Leave a thoughtful comment on a friend's post."
            }

            else {
                edtSuggestionDisplay.text = "Try entering 'Morning', 'Afternoon', or 'Dinner' for better results."
            }
        }


        btnReset.setOnClickListener {
            edtTime.text.clear()
            edtSuggestionDisplay.text = ""
        }
    }
}