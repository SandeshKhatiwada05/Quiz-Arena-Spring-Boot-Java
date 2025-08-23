# Quiz Arena

Welcome to **Quiz Arena** – a fun and interactive Spring Boot web application that fetches trivia questions from the [Open Trivia DB](https://opentdb.com) API and lets users test their knowledge in a cool, game-like environment!

## Features

- ✅ Start a quiz by entering your name, age, and preferences
- 🔢 Choose number of questions
- 📚 Select question type: Multiple Choice or True/False
- 🧠 Questions fetched live from Open Trivia DB
- 🎨 Stylish and animated frontend using pure HTML/CSS/JS
- 💡 Built with Spring Boot REST API backend

## Screenshots

| Welcome Screen | Quiz Screen |
|----------------|-------------|
| ![Start Screen](https://user-images.githubusercontent.com/your-img1.png) | ![Quiz Screen](https://user-images.githubusercontent.com/your-img2.png) |

## Tech Stack

- **Backend:** Java, Spring Boot, REST API
- **Frontend:** HTML, CSS, JavaScript
- **API:** [Open Trivia DB](https://opentdb.com)

## Project Structure

```bash
QuizArena/
├── src/main/java/org/quizarena/
│ ├── QuizController.java
│ └── PlayerEntity.java
├── src/main/resources/static/
│ ├── index.html
│ └── quiz.html
└── README.md
```


## How It Works

1. User fills out name, age, number of questions, and type.
2. Frontend sends a `POST` request to `/api/start` with user input.
3. Backend fetches trivia questions from Open Trivia DB.
4. Data is saved in `localStorage` and used in `quiz.html` for the quiz game.

## Installation & Running

1. Clone the repository  
   ```bash
   git clone https://github.com/SandeshKhatiwada05/Quiz-Arena-Spring-Boot-Java.git
   ```
