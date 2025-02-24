# Simple Beginner Java Socket Chat (Client-Server)


A beginner-friendly **Java Socket Chat** application where clients can send messages to the server, and the server responds back.  

## 🚀 Features
✅ Simple **client-server** messaging  
✅ **No threads** (handles one client at a time)  
✅ Uses only **Scanner & OutputStream** for I/O  
✅ **Easy to understand** and modify  

## 📦 Installation & Usage

### 1️⃣ Clone the Repository
```bach
git clone https://github.com/aboualine/java-socket-chat.git
cd java-socket-chat
```
### 2️⃣ Compile the Code
```bach
javac ChatServer.java ChatClient.java
```
### 3️⃣ Start the Server
```bach
java ChatServer
```
The server will start and wait for clients to connect.
### 4️⃣ Run a Client
```bach
java ChatClient
```
You can open multiple clients, but only one can communicate at a time.

## 💬 How It Works

1. The server listens on port 12345.
2. A client connects and sends a message.
3. The server receives the message and echoes it back.
4. The connection remains open until the client disconnects.

## 📜 Example Chat

Client:
Me: Hello, Server!
Server: Hello, Server!

Me: How are you?
Server: How are you?

## 📂 Project Files

```bach
Simple Beginner Java Socket Chat/
│
├── ChatServer.java           # Server-side application that handles client messages.
├── ChatClient.java        # Client-side application that connects to the server.
├── README.md     # Project documentation.
```

## 🔧 Customization

1. Change the Port: Modify PORT = 12345 in both ChatServer.java and ChatClient.java to use a different port.

2. Modify Server Responses: Edit the handleClient() method in ChatServer.java to customize server replies.

## ⚖️ License

This project is open-source under the **MIT License**.











