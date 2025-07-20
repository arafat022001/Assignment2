package com.example.myassssmentapplication

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameInput = findViewById<EditText>(R.id.usernameEditText)
        val passwordInput = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val errorText = findViewById<TextView>(R.id.errorTextView)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                errorText.text = "Please enter both username and password"
                return@setOnClickListener
            }

            val loginRequest = LoginRequest(username, password)

            lifecycleScope.launch {
                try {
                    val response = apiService.login(loginRequest)

                    if (response.isSuccessful && response.body() != null) {
                        val keypass = response.body()!!.keypass

                        if (keypass.isNotEmpty()) {
                            val intent = Intent(this@MainActivity, DashboardActivity::class.java)
                            intent.putExtra("KEYPASS", keypass)
                            startActivity(intent)
                            finish()
                        } else {
                            errorText.text = "Login succeeded but keypass missing"
                        }

                    } else {
                        errorText.text = "Login failed: ${response.code()} ${response.message()}"
                    }
                } catch (e: Exception) {
                    errorText.text = "Network error: ${e.localizedMessage}"
                }
            }
        }
    }
}
