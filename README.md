

NIT3213 Final Assignment – Android App

Developer
Name: Yeasin Arafat
Student ID: s8119081
Unit: NIT3213 – Mobile Application Development

Project Overview
This Android application was developed as part of the final assessment for the NIT3213 unit. It demonstrates core Android development skills, including:

* API integration using Retrofit
* Fragment-based navigation
* Dependency Injection via Hilt
* Clean Architecture principles
* Unit Testing with JUnit

The app includes:

* Login Screen
* Dashboard (RecyclerView implementation)
* Details Screen

API Information
Base URL: [https://nit3213api.onrender.com/](https://nit3213api.onrender.com/)

Endpoints:

1. Login (POST)
   /footscray/auth, /sydney/auth, or /ort/auth
   Request body:
   {
   "username": "YourFirstName",
   "password": "sYourStudentID"
   }

2. Dashboard (GET)
   /dashboard/{keypass}

Login Credentials Format
Username: Your first name (e.g., Yeasin)
Password: Your student ID (e.g., s8119081)

Features
Login Screen: Authenticates users using credentials via the API
Dashboard: Displays a list of entities using RecyclerView
Details Screen: Shows detailed data retrieved from the API
Dependency Injection: Implemented using Hilt
Unit Testing: Basic unit tests for ViewModel logic

Unit Tests

* Located in EntityUnitTest.kt
* Tests core ViewModel logic
* Run via Build > Run Tests in Android Studio

Tech Stack

* Kotlin
* Android SDK
* Retrofit
* Hilt
* ViewModel and LiveData
* RecyclerView
* JUnit

How to Build & Run

1. Clone the repository:
   git clone [https://github.com/your-username/NIT3213-Final-Assignment.git](https://github.com/your-username/NIT3213-Final-Assignment.git)
   cd NIT3213-Final-Assignment

2. Open the project in Android Studio

3. Run on an emulator or connected physical device

4. Ensure internet permission is enabled in AndroidManifest.xml: <uses-permission android:name="android.permission.INTERNET" />

License
This project is developed exclusively for academic purposes
Victoria University – NIT3213 Final Assignment


