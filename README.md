NIT3213 Final Assignment – Android App
Developer
Name: Rezaul Karim
Student ID: s8112591
Unit: NIT3213 – Mobile Application Development

Project Overview
This Android application was developed for the NIT3213 final assignment to demonstrate proficiency in:
•	API integration
•	Fragment-based navigation
•	Dependency Injection using Hilt
•	Clean architecture
•	Unit testing with JUnit
The app includes:
•	Login Screen
•	Dashboard with RecyclerView
•	Details Screen

API Information
Base URL: https://nit3213api.onrender.com/
Endpoints:
1.	Login (POST)
/footscray/auth or /sydney/auth or /ort/auth
Request body:
2.	{
3.	  "username": "YourFirstName",
4.	  "password": "sYourStudentID"
5.	}
6.	Dashboard (GET)
/dashboard/{keypass}

Login Credentials Format
•	Username: Your first name (e.g., Rezaul)
•	Password: Your student ID (e.g., s8112591

Features
Login Screen: Authenticates users using provided credentials
 
Dashboard: Displays list of entities using RecyclerView
 

Details Screen: Shows detailed information from the API
    


Dependency Injection: Implemented with Hilt 
 Unit Testing: Includes test cases for core components
  

 Unit Tests
•	Includes basic unit test for ViewModel logic.
•	Test class: EntityUnitTest.kt
•	Run via Build > Run Tests in Android Studio

Tech Stack
•	Kotlin
•	Android SDK
•	Retrofit
•	Hilt
•	ViewModel + LiveData
•	RecyclerView
•	JUnit

 How to Build & Run
1.	Clone the repository
2.	git clone https://github.com/your-username/NIT3213-Final-Assignment.git
3.	cd NIT3213-Final-Assignment
4.	Open in Android Studio
5.	Run the App using emulator or physical device
6.	API Usage: Ensure internet permission is enabled in AndroidManifest.xml.

 License
This project is for academic purposes only (Victoria University – NIT3213).


