# Hangman-java



---

## 🎯 Hangman Game in Java

This is a **console-based Hangman game** built in Java, where the player tries to guess a hidden word by suggesting letters within a limited number of wrong guesses.

### ✨ Features

* 🎲 **Random word selection** from a predefined list.
* ✏️ Player inputs single-letter guesses.
* 📝 Tracks and displays guessed letters.
* 💀 ASCII-art **Hangman display** that progresses with each wrong guess.
* 🚫 Input validation to prevent duplicate or invalid guesses.
* 🔄 Option to play multiple rounds in one session.

### 🖥 How It Works

1. The game randomly picks a secret word from the list.
2. The player guesses one letter at a time.
3. Correct guesses reveal the letter’s position(s) in the word.
4. Wrong guesses draw more of the hangman until the maximum limit is reached.
5. The game ends when the player guesses the full word or runs out of attempts.

### 🛠 Technologies Used

* **Java** (Core Java concepts: loops, arrays, ArrayList, Random, Scanner)
* **ASCII Art** for hangman stages

### 📷 Sample Gameplay

```
Let's play Hangman!  
The word has 6 letters.  

  +---+
  |   |
      |
      |
      |
      |
=========
Word: _ _ _ _ _ _  
Guessed letters: []  
Enter your guess: A  

Correct guess!
```

### 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/hangman-java.git
   ```
2. Compile the program:

   ```bash
   javac Hangman.java
   ```
3. Run the game:

   ```bash
   java Hangman
   ```

---

