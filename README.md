# Quiz Arena

Welcome to **Quiz Arena** – a fun and interactive Spring Boot web application that fetches trivia questions from the [Open Trivia DB](https://opentdb.com) API and lets users test their knowledge in a cool, game-like environment!

## Features

- Start a quiz by entering your name, age, and preferences
- Choose number of questions
- Select question type: Multiple Choice or True/False
- Questions fetched live from Open Trivia DB
- Stylish and animated frontend using pure HTML/CSS/JS
- Built with Spring Boot REST API backend

## Screenshots

| Welcome Screen | Quiz Screen |
|----------------|-------------|
| <img width="777" height="722" alt="image" src="https://github.com/user-attachments/assets/e12f4dce-331b-466e-90c4-9aa112ebc793" /> | <img width="1153" height="841" alt="image" src="https://github.com/user-attachments/assets/93c48196-2f85-4ae4-b50d-56cd7b46f7f2" />|

## Tech Stack

- **Backend:** Java, Spring Boot, REST API
- **Frontend:** HTML, CSS, JavaScript
- **API:** [Open Trivia DB](https://opentdb.com)


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
