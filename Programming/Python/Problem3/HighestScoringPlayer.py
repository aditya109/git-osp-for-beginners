numPlayers = 11
highestScore = 0
hPlayerName = ""
for p in range(numPlayers):
    pname = input("Please enter Player's name:")
    pscore = int(input("Please enter Player's score:"))
    if pscore > highestScore:
        highestScore = pscore
        hPlayerName = pname

print("Player who scored highest runs: " + hPlayerName)
print("And player's score is: " + str(highestScore))
