player1 = input("Player1 Enter your name: ")
player2 = input("Player2 Enter your name: ")

secret_number = int(input(player1 + ", Enter the number to be secret number :"))
guess_number = ""
chances = 5
while chances != 0:
    guess_number = int(input(player2 + ", Enter you guess : "))
    if guess_number > secret_number:
        print("The number you guessed is greater than secret number.")
    elif guess_number < secret_number:
        print("The number you guessed is lesser than secret number.")
    else:
        print("Right Guess")
    chances -= 1
if chances == 0 and guess_number != secret_number:
    print(player1 +", You won")
else:
    print(player2 +", You Won")
