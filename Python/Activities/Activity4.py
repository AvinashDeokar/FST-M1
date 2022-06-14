#two-player Rock-Paper-Scissors game.
user1 = str(input("Enter player 1 Name"))
user2 = str(input("Enter Player 2 name"))

while True:
    user1_ans = input(user1 +" Select S for Scissor, P for Paper or R for Rock ").lower()
    user2_ans = input(user2 +" Select S for Scissor, P for Paper or R for Rock ").lower()
    if (user1_ans == user2_ans):
        print("Its a tie")
    elif user1_ans == 'r':
        if user2_ans == 's':
            print("Rock wins")
        else:
            print ("Paper wins")
    elif (user1_ans == 's'):
        if (user2_ans == 'p'):
            print("Scissor wins")
        else:
            print("Rock Wins")
    elif(user1_ans == "p"):
        if(user2_ans == 'r'):
            print("paper wins")
        else:
            print("Scissor Wins")
    else:
        print("invalid input")
    cont = input(" press y to continue or n to exit").lower()
    if(cont == "y"):
        pass
    elif(cont =="n"):
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
