# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview
This project is a simple WhatsApp chatbot backend simulation built using Spring Boot.  
It accepts JSON messages and returns predefined responses.

## 🚀 Features
- REST API endpoint `/webhook`
- Handles POST requests
- Predefined responses (Hi → Hello, Bye → Goodbye)
- Logging of incoming messages
- JSON response with timestamp
- Deployed on Render

## 🌍 Live API
https://chatbot-h2zv.onrender.com/webhook

## 🧪 Sample Request
POST /webhook

{
  "message": "hi"
}

## 📤 Sample Response
{
  "reply": "Hello !!",
  
}

## 🛠 Tech Stack
- Java
- Spring Boot
- REST API
- Docker
- Render
