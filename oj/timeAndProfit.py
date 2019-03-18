n1 = input()
while True:
    try:
        n2 = input()
        s = [int(i) for i in input().split()]
        deadline, profit = [], []
        for i in range(1, len(s), 3):
            deadline.append(s[i])
            profit.append(s[i+1])
        temp = [[y, x] for x, y in sorted(zip(profit, deadline), reverse=True)]
        size = max(deadline)
        time_interval = [True for i in range(size)]
        total_profit = 0
        total_jobs = 0

        for i in range(len(temp)):
            current_deadline = temp[i][0]
            # print("current_deadline", current_deadline)
            for j in range((current_deadline - 1), -1, -1):
                # check if that interval is occupied
                if time_interval[j]:
                    # means we can allocate the job
                    total_jobs += 1
                    total_profit += temp[i][1]
                    time_interval[j] = False
                    break

        print(str(total_jobs) + " " + str(total_profit))

    except EOFError:
        break

