# CoraConnect 📱✨

Welcome to the repository for **CoraConnect**, a native Android application built with Kotlin. 

## 🎯 Purpose of the App
CoraConnect was developed to help individuals—specifically designed with a busy friend named Cora in mind—maintain their social connections despite hectic daily schedules. The app simplifies social interactions by suggesting quick, actionable "social sparks" tailored to the specific time of day. Whether it's a prompt to send a "Good morning" text or a reminder to leave a thoughtful comment on a friend's post at night, the app ensures that staying in touch remains easy, fun, and manageable.

## 🎨 Design Considerations
The user interface was designed with a focus on simplicity and ease of use, ensuring that users can quickly grab a suggestion while on the move. Key design decisions include:
* **Clean Layout:** Utilizing a vertical `LinearLayout` with ample padding (24dp) and a soft `#FAFAFA` background to keep the interface uncluttered and easy on the eyes.
* **Intuitive Input:** A clearly marked `EditText` field allows users to manually type the time of day, promoting active engagement.
* **Constructive Feedback:** The app includes robust error handling. If a user inputs an unrecognized time or leaves the field blank, the app provides gentle, motivating error messages rather than crashing.
* **Reset Functionality:** A borderless, red "Reset" button allows users to quickly clear their input and start over without friction.


## ⚙️ GitHub and GitHub Actions Utilization
Version control and continuous integration are critical components of this project's development lifecycle. 

* **Version Control (GitHub):** Git and GitHub were used to track changes, maintain a history of the code, and securely back up the project. It allows for safe experimentation and easy rollback if errors occur during development.
* **Continuous Integration (GitHub Actions):** To ensure the application is robust and maintainable, a GitHub Actions workflow (`.github/workflows/android.yml`) was implemented. 
    * **Automated Building:** Every time code is pushed to the `main` branch, the workflow automatically sets up the Java JDK and runs the Gradle build process. 
    * **Cross-Environment Consistency:** This ensures that the code compiles successfully not just on the local development machine, but in a fresh, isolated environment, verifying that no local dependencies were accidentally left out of the repository.

**Developed with Kotlin in Android Studio.**
**Video Presentation.**
https://drive.google.com/file/d/1hZVsuXYOJcNMkWG_X621DSVo-rzSq_53/view?usp=sharing
