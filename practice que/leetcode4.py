def findMedianSortedArrays(nums1, nums2):
    """
    :type nums1: List[int]
    :type nums2: List[int]
    :rtype: float
    """
    num3 = nums1 + nums2   # merge lists
    num3.sort()            # sort them
    n = len(num3)

    # check if length is odd or even
    if n % 2 == 1:  # odd → middle element
        return float(num3[n // 2])
    else:  # even → average of 2 middle elements
        mid1 = num3[n // 2 - 1]
        mid2 = num3[n // 2]
        return (mid1 + mid2) / 2.0


# Test cases
print(findMedianSortedArrays([1, 3], [2]))       # Output: 2.0
print(findMedianSortedArrays([1, 2], [3, 4]))    # Output: 2.5
print(findMedianSortedArrays([0, 0], [0, 0]))    # Output: 0.0
print(findMedianSortedArrays([], [1]))           # Output: 1.0
print(findMedianSortedArrays([2], []))           # Output: 2.0
