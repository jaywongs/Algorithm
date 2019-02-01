def reorder(nums, target_func):
    if not isinstance(nums, list) or len(nums) == 0:
        return

    for num in nums:
        if not isinstance(num, int):
            return

    i, j = 0, len(nums) - 1
    while i < j:
        if target_func(nums[i]):
            while target_func(nums[j]):
                j -= 1
            temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            j -= 1
        i += 1

    return nums


def is_even(num):
    return (num & 1) == 0


if __name__ == "__main__":
    nums = [1, 2, 3, 4, 5]
    reorder(nums=nums, target_func=is_even)
    print(nums)


