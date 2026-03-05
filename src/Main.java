import java.util.Random;

public class Main {
    //1.
    static double average(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return (double) sum / arr.length;
    }
    static int countAboveAverage(int[] arr) {
        double avg = average(arr);
        int count = 0;

        for (int x : arr)
            if (x > avg)
                count++;

        return count;
    }

    static boolean hasFail(int[] arr) {
        for (int x : arr)
            if (x < 3)
                return true;

        return false;
    }

    static void bestStudents(int[] arr) {
        int max = arr[0];

        for (int x : arr)
            if (x > max)
                max = x;

        for (int x : arr)
            if (x == max)
                System.out.print(x + " ");

        System.out.println();
    }

    static boolean isGroupSuccessful(int[] arr) {
        return average(arr) >= 4 && !hasFail(arr);
    }

    //2.

    static int maxTemp(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        return max;
    }

    static int minTemp(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            if (x < min) min = x;
        return min;
    }

    static int countHotDays(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x > 25) count++;
        return count;
    }

    static int countColdDays(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x < 0) count++;
        return count;
    }

    static int longestHotStreak(int[] arr) {
        int max = 0, current = 0;

        for (int x : arr) {
            if (x > 25) {
                current++;
                if (current > max) max = current;
            } else current = 0;
        }
        return max;
    }

    static boolean isClimateAbnormal(int[] arr) {
        return countColdDays(arr) > 10 || maxTemp(arr) > 40;
    }

    //3.

    static boolean hasUpperCase(char[] arr) {
        for (char c : arr)
            if (Character.isUpperCase(c))
                return true;
        return false;
    }

    static boolean hasLowerCase(char[] arr) {
        for (char c : arr)
            if (Character.isLowerCase(c))
                return true;
        return false;
    }

    static boolean hasDigit(char[] arr) {
        for (char c : arr)
            if (Character.isDigit(c))
                return true;
        return false;
    }

    static boolean hasSpecialChar(char[] arr) {
        for (char c : arr)
            if (!Character.isLetterOrDigit(c))
                return true;
        return false;
    }

    static int countDigits(char[] arr) {
        int count = 0;
        for (char c : arr)
            if (Character.isDigit(c))
                count++;
        return count;
    }

    static boolean isStrongPassword(char[] arr) {
        return arr.length >= 8 &&
                hasDigit(arr) &&
                hasUpperCase(arr) &&
                hasSpecialChar(arr);
    }

    //4.
    static int totalIncome(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static double averageIncome(int[] arr) {
        return (double) totalIncome(arr) / arr.length;
    }

    static int monthsAboveAverage(int[] arr) {
        double avg = averageIncome(arr);
        int count = 0;

        for (int x : arr)
            if (x > avg) count++;

        return count;
    }

    static int maxIncomeMonth(int[] arr) {
        int max = arr[0];
        int month = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                month = i + 1;
            }
        }
        return month;
    }

    static boolean isStableBusiness(int[] arr) {
        double avg = averageIncome(arr);
        int belowAvg = 0;

        for (int x : arr) {
            if (x < 0) return false;
            if (x < avg) belowAvg++;
        }

        return belowAvg <= 2;
    }

    //5.
    static int countPositive(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x > 0) count++;
        return count;
    }

    static int countNegative(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x < 0) count++;
        return count;
    }

    static int sumEven(int[] arr) {
        int sum = 0;
        for (int x : arr)
            if (x % 2 == 0) sum += x;
        return sum;
    }

    static int sumOdd(int[] arr) {
        int sum = 0;
        for (int x : arr)
            if (x % 2 != 0) sum += x;
        return sum;
    }

    static int findFirstPositive(int[] arr) {
        for (int x : arr)
            if (x > 0) return x;
        return -1;
    }

    static boolean allPositive(int[] arr) {
        for (int x : arr)
            if (x <= 0) return false;
        return true;
    }

    static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    return true;
        return false;
    }

    //6.
    static int[] filterEven(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 == 0) count++;

        int[] result = new int[count];
        int index = 0;

        for (int x : arr)
            if (x % 2 == 0)
                result[index++] = x;

        return result;
    }

    static int[] filterPositive(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x > 0) count++;

        int[] result = new int[count];
        int index = 0;

        for (int x : arr)
            if (x > 0)
                result[index++] = x;

        return result;
    }

    static int[] filterRange(int[] arr, int min, int max) {
        int count = 0;
        for (int x : arr)
            if (x >= min && x <= max) count++;

        int[] result = new int[count];
        int index = 0;

        for (int x : arr)
            if (x >= min && x <= max)
                result[index++] = x;

        return result;
    }

    static int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int x : arr)
            if (x >= min && x <= max)
                count++;
        return count;
    }

    static boolean isAllInRange(int[] arr, int min, int max) {
        for (int x : arr)
            if (x < min || x > max)
                return false;
        return true;
    }

    //7.
    static boolean isCorrectGuess(int[] attempts, int secret) {
        for (int x : attempts)
            if (x == secret)
                return true;
        return false;
    }

    static int countAttempts(int[] attempts) {
        return attempts.length;
    }

    static boolean wasClose(int[] attempts, int secret) {
        for (int x : attempts)
            if (Math.abs(x - secret) <= 2)
                return true;
        return false;
    }

    static int bestAttempt(int[] attempts, int secret) {
        int minDiff = Math.abs(attempts[0] - secret);

        for (int x : attempts) {
            int diff = Math.abs(x - secret);
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    static boolean playerWon(int[] attempts, int secret) {
        return isCorrectGuess(attempts, secret) && attempts.length <= 5;
    }

    //8.
    static boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }

    static boolean isSortedDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[i - 1])
                return false;
        return true;
    }

    static int countBreakPoints(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                count++;
        return count;
    }

    static boolean canBeSortedByOneSwap(int[] arr) {
        int first = -1, second = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (first == -1)
                    first = i;
                else
                    second = i + 1;
            }
        }

        if (first == -1) {
            return true;
            }
        if (second == -1) {
            second = first + 1;
        }
        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
        boolean sorted = isSortedAscending(arr);
        t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
        return sorted;
    }
    static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1])
                return false;
        return true;
    }

    //9.
    static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][i];
        return sum;
    }

    static int sumSecondaryDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][m.length - 1 - i];
        return sum;
    }

    static boolean isSymmetric(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = i + 1; j < m.length; j++)
                if (m[i][j] != m[j][i])
                    return false;
        return true;
    }

    static int countPositive(int[][] m) {
        int count = 0;
        for (int[] row : m)
            for (int x : row)
                if (x > 0)
                    count++;
        return count;
    }
    static int maxElement(int[][] m) {
        int max = m[0][0];
        for (int[] row : m)
            for (int x : row)
                if (x > max)
                    max = x;
        return max;
    }
    static boolean isMagicSquare(int[][] m) {
        int target = 0;

        for (int j = 0; j < m.length; j++) {
            target += m[0][j];
        }
        for (int i = 1; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++)
                sum += m[i][j];
            if (sum != target)
                return false;
        }

        return true;
    }

    //10.
    static int countLate(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x > 9)
                count++;
        return count;
    }

    static int longestLateStreak(int[] arr) {
        int max = 0, current = 0;

        for (int x : arr) {
            if (x > 9) {
                current++;
                if (current > max) max = current;
            } else current = 0;
        }
        return max;
    }

    static boolean isDisciplined(int[] arr) {
        if (countLate(arr) > 3) return false;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > 9 && arr[i - 1] > 9)
                return false;

        return true;
    }

    static double averageArrivalTime(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return (double) sum / arr.length;
    }

    static int earliestArrival(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            if (x < min)
                min = x;
        return min;
    }

    //11.
    static int totalSales(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    static int peakHour(int[] arr) {
        int max = arr[0];
        int hour = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                hour = i;
            }
        }
        return hour; // индекс часа
    }

    static int countLowSales(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x < 100)
                count++;
        return count;
    }

    static int longestZeroSales(int[] arr) {
        int max = 0, current = 0;

        for (int x : arr) {
            if (x == 0) {
                current++;
                if (current > max) max = current;
            } else current = 0;
        }
        return max;
    }

    static boolean isProfitableDay(int[] arr) {
        int zeroCount = 0;

        for (int x : arr)
            if (x == 0)
                zeroCount++;
        return totalSales(arr) > 5000 && zeroCount <= 5;
    }

    //12.
    static int countPrime(int[] arr) {
        int count = 0;

        for (int x : arr) {
            if (isPrime(x))
                count++;
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return second;
    }

    static double median(int[] arr) {
        int[] copy = arr.clone();
        for (int i = 0; i < copy.length - 1; i++)
            for (int j = 0; j < copy.length - 1 - i; j++)
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }

        if (copy.length % 2 == 0)
            return (copy[copy.length / 2 - 1] + copy[copy.length / 2]) / 2.0;
        else
            return copy[copy.length / 2];
    }

    static int[] removeDuplicates(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            if (!duplicate) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }

            if (!duplicate) {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    static double percentageEven(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 == 0)
                count++;

        return (double) count * 100 / arr.length;
    }

    static boolean isBalancedArray(int[] arr) {
        int even = 0, odd = 0;

        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }

        return Math.abs(even - odd) <= 5;
    }

    public static void main(String[] args) {
        //1.
        int[] grades = {5, 4, 3, 5, 2, 4, 5, 3};
        System.out.println("Average: " + average(grades));
        System.out.println("Above average: " + countAboveAverage(grades));
        System.out.println("Has fail: " + hasFail(grades));
        System.out.print("Best students: ");
        bestStudents(grades);
        System.out.println("Group successful: " + isGroupSuccessful(grades));

        //2.
        int[] temp = {5, 7, 30, 32, -3, 10, 28, 41, -2, 26};
        System.out.println("Max temp: " + maxTemp(temp));
        System.out.println("Min temp: " + minTemp(temp));
        System.out.println("Hot days: " + countHotDays(temp));
        System.out.println("Cold days: " + countColdDays(temp));
        System.out.println("Longest hot streak: " + longestHotStreak(temp));
        System.out.println("Climate abnormal: " + isClimateAbnormal(temp));
        System.out.println();

        //3.
        char[] password = {'A','b','1','@','x','Z','9','k'};
        System.out.println("Has upper: " + hasUpperCase(password));
        System.out.println("Has lower: " + hasLowerCase(password));
        System.out.println("Has digit: " + hasDigit(password));
        System.out.println("Has special: " + hasSpecialChar(password));
        System.out.println("Digit count: " + countDigits(password));
        System.out.println("Strong password: " + isStrongPassword(password));
        System.out.println();

        //4.
        int[] income = {1200,1500,1800,900,2000,2100,1700,1600,800,1900,2200,2500};
        System.out.println("Total income: " + totalIncome(income));
        System.out.println("Average income: " + averageIncome(income));
        System.out.println("Months above average: " + monthsAboveAverage(income));
        System.out.println("Max income month: " + maxIncomeMonth(income));
        System.out.println("Stable business: " + isStableBusiness(income));

        //5.
        int[] numbers = {3, -2, 7, 4, -5, 4};
        System.out.println("Positive: " + countPositive(numbers));
        System.out.println("Negative: " + countNegative(numbers));
        System.out.println("Sum even: " + sumEven(numbers));
        System.out.println("Has duplicates: " + hasDuplicates(numbers));
        System.out.println();

        //6.
        int[] filtered = filterEven(numbers);
        System.out.print("Even numbers: ");
        for (int x : filtered) {
            System.out.print(x + " ");
        }
        System.out.println();

        //7.
        int[] attempts = {10, 15, 18, 20};
        int secret = 18;
        System.out.println("Correct guess: " + isCorrectGuess(attempts, secret));
        System.out.println("Was close: " + wasClose(attempts, secret));
        System.out.println("Best attempt diff: " + bestAttempt(attempts, secret));
        System.out.println("Player won: " + playerWon(attempts, secret));
        System.out.println();

        //8.
        int[] sortedTest = {1,2,3,5,4};
        System.out.println("Ascending: " + isSortedAscending(sortedTest));
        System.out.println("One swap possible: " + canBeSortedByOneSwap(sortedTest));
        System.out.println();

        //9.
        int[][] matrix = {{2,7,6}, {9,5,1}, {4,3,8}};
        System.out.println("Main diagonal sum: " + sumMainDiagonal(matrix));
        System.out.println("Symmetric: " + isSymmetric(matrix));
        System.out.println("Magic square: " + isMagicSquare(matrix));
        System.out.println();

        //10.
        int[] arrivals = {8,9,10,11,8,10,9};
        System.out.println("Late count: " + countLate(arrivals));
        System.out.println("Longest late streak: " + longestLateStreak(arrivals));
        System.out.println("Disciplined: " + isDisciplined(arrivals));

        //11.
        int[] sales = {
                200,150,0,0,300,400,600,1000,900,0,50,80,
                120,200,500,700,0,0,300,400,600,100,200,300
        };
        System.out.println("Total sales: " + totalSales(sales));
        System.out.println("Peak hour: " + peakHour(sales));
        System.out.println("Profitable day: " + isProfitableDay(sales));
        System.out.println();

        //12.
        Random rand = new Random();
        int[] randomArr = new int[100];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rand.nextInt(100);
        }
        System.out.println("Prime count: " + countPrime(randomArr));
        System.out.println("Second max: " + findSecondMax(randomArr));
        System.out.println("Median: " + median(randomArr));
        System.out.println("Even %: " + percentageEven(randomArr));
        System.out.println("Balanced array: " + isBalancedArray(randomArr));
    }
}