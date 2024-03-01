# CookiesProblem Documentation

Overview:

The CookiesProblem class provides a solution to a problem involving sweetness levels of cookies.

Method:

solve(int requiredSweetness, int[] cookiesSweetness): Parameters: requiredSweetness: The minimum sweetness level desired. cookiesSweetness: An array containing the sweetness levels of available cookies. Returns: An Integer representing the minimum number of steps required to achieve the desired sweetness level or -1 if it's not possible.

Algorithm: The method operates as follows:

* It initializes a priority queue to store the sweetness levels of cookies.
* It iterates over the provided array of cookie sweetness and adds each sweetness level to the priority queue.
* It retrieves the minimum sweetness level from the priority queue.
* It continues the process until the minimum sweetness level surpasses the required sweetness level or until there's only one cookie left.
* During each iteration, it combines the two least sweet cookies, updating the minimum sweetness level and incrementing the step count.
* If the final minimum sweetness level exceeds the required sweetness level, it returns the number of steps taken; otherwise, it returns -1 indicating the target sweetness level is unachievable.
