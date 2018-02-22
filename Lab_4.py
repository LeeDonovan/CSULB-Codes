keep_going = True
judge_numbers = 0
user_input = float(0)
total_score = 0
max_score = 0
low_score = 10
while keep_going:
    while judge_numbers <= 8:
        judge_numbers += 1
        user_input = float(input("Enter Judge "+str(judge_numbers)+" score between 0-10: "))
        total_score = total_score + user_input
        if user_input > max_score:
            max_score = user_input
        if user_input < low_score:
            low_score = user_input
            
        if user_input < 0 or user_input > 10:
            print("Reinput judge number value!")
            judge_numbers -= 1
            keep_going = True    

   
    else:
        total_score = total_score -(max_score + low_score)
        total_score = total_score/7
        print("Final score is ",total_score)
        keep_going = False

        

    