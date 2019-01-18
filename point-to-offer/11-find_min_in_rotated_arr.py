def find_in_order(nums):
    min_index = 0
    for i in range(len(nums)):
        if nums[i] < nums[min_index]:
            min_index = i
    return min_index, nums[min_index]


def find_min_in_rotated_arr(nums):
    if not isinstance(nums, list) or len(nums) == 0:
        return
    p1, p2 = 0, len(nums) - 1

    while nums[p1] >= nums[p2]:
        if p2 - p1 == 1:
            return p2, nums[p2]

        mid = (p1 + p2) // 2
        if nums[mid] == nums[p1] and nums[mid] == nums[p2]:
            return find_in_order(nums[p1: p2 + 1])
        elif nums[mid] > nums[p1]:
            p1 = mid
        else:
            p2 = mid

    return p1, nums[p1]