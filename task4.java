import java.util.Scanner;
import java.lang.Math;

public class task4 {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Task 4 ===");
    System.out.println("Select a task to run (1-32): ");
    int taskNumber = scanner.nextInt();

    switch (taskNumber) {
        case 1: testTask1(); break;
        case 2: testTask2(); break;
        case 3: testTask3(); break;
        case 4: testTask4(); break;
        case 5: testTask5(); break;
        case 6: testTask6(); break;
        case 7: testTask7(); break;
        case 8: testTask8(); break;
        case 9: testTask9(); break;
        case 10: testTask10(); break;
        case 11: testTask11(); break;
        case 12: testTask12(); break;
        case 13: testTask13(); break;
        case 14: testTask14(); break;
        case 15: testTask15(); break;
        case 16: testTask16(); break;
        case 17: testTask17(); break;
        case 18: testTask18(); break;
        case 19: testTask19(); break;
        case 20: testTask20(); break;
        case 21: testTask21(); break;
        case 22: testTask22(); break;
        case 23: testTask23(); break;
        case 24: testTask24(); break;
        case 25: testTask25(); break;
        case 26: testTask26(); break;
        case 27: testTask27(); break;
        case 28: testTask28(); break;
        case 29: testTask29(); break;
        case 30: testTask30(); break;
        case 31: testTask31(); break;
        case 32: testTask32(); break;
        default:
            System.out.println("Invalid task number. Please select 1-32.");
    }

    scanner.close();
}

    // Task 1:
    public static double task1(double x) {
        if (x == 0) return Double.POSITIVE_INFINITY;

        double temp = 256.0 / (x * x);
        for (int i = 254; i >= 2; i -= 2) {
            temp = x * x + i / temp;
        }
        return x / (x * x + 2.0 / temp);
    }

    public static void testTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x for Task 1: ");
        double x = scanner.nextDouble();
        double result = task1(x);
        System.out.printf("Task 1 result: y = %.6f\n", result);
    }

    // Task 2: Sum of functions f(a + i*h)
    public static double task2(double a, double h, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            double x = a + i * h;
            sum += (x * x + 1) * Math.cos(x);
        }
        return sum;
    }

    public static void testTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter h: ");
        double h = scanner.nextDouble();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double result = task2(a, h, n);
        System.out.printf("Task 2 result: sum = %.6f\n", result);
    }

    // Task 3:
    public static double[] task3() {
        double sum1 = 0;
        for (int i = 1; i <= 50; i++) {
            sum1 += 1.0 / (i * i * i);
        }

        double sum2 = 0;
        for (int i = 2; i <= 128; i += 2) {
            sum2 += 1.0 / (i * i);
        }

        return new double[]{sum1, sum2};
    }

    public static void testTask3() {
        double[] results = task3();
        System.out.printf("Task 3 - Sum 1: %.6f\n", results[0]);
        System.out.printf("Task 3 - Sum 2: %.6f\n", results[1]);
    }

    // Task 4: Nested square roots
    public static double task4() {
        double result = Math.sqrt(99);
        for (int i = 96; i >= 3; i -= 3) {
            result = Math.sqrt(i + result);
        }
        return result;
    }

    public static void testTask4() {
        double result = task4();
        System.out.printf("Task 4 result: %.6f\n", result);
    }

    // Task 5:
    public static double task5() {
        double sum = 0;
        for (double x = 1.0; x <= 2.0; x += 0.1) {
            sum += Math.sin(x);
        }
        return sum;
    }

    public static void testTask5() {
        double result = task5();
        System.out.printf("Task 5 result: %.6f\n", result);
    }

    // Task 6: Sum of products n*(n+1)*...*(2n)
    public static long task6(int n) {
        long totalSum = 0;
        for (int i = 1; i <= n; i++) {
            long product = 1;
            for (int j = i; j <= 2 * i; j++) {
                product *= j;
            }
            totalSum += product;
        }
        return totalSum;
    }

    public static void testTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 6: ");
        int n = scanner.nextInt();

        long result = task6(n);
        System.out.println("Task 6 result: " + result);
    }

    // Task 7:
    public static double task7a(double x) {
        double numerator = 1, denominator = 1;
        for (int i = 2; i <= 64; i += 2) {
            numerator *= (x - i);
        }
        for (int i = 1; i <= 63; i += 2) {
            denominator *= (x - i);
        }
        return numerator / denominator;
    }

    public static double task7b(double x, double a) {
        double result = x - a;
        for (int i = 0; i < 5; i++) {
            result = result * x - a;
        }
        return result;
    }

    public static void testTask7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x for Task 7: ");
        double x = scanner.nextDouble();
        System.out.print("Enter a for Task 7b: ");
        double a = scanner.nextDouble();

        double resultA = task7a(x);
        double resultB = task7b(x, a);
        System.out.printf("Task 7a result: %.6f\n", resultA);
        System.out.printf("Task 7b result: %.6f\n", resultB);
    }

    // Task 8:
    public static void task8() {
        System.out.println("Pythagorean triples up to 20:");
        for (int a = 1; a <= 20; a++) {
            for (int b = a; b <= 20; b++) {
                for (int c = b; c <= 20; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }

    public static void testTask8() {
        task8();
    }

    // Task 9:
    public static double task9(double x, int n) {
        double numerator = 1, denominator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= (x - 2 * i);
            denominator *= (x - (2 * i - 1));
        }
        return numerator / denominator;
    }

    public static void testTask9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x for Task 9: ");
        double x = scanner.nextDouble();
        System.out.print("Enter n for Task 9: ");
        int n = scanner.nextInt();

        double result = task9(x, n);
        System.out.printf("Task 9 result: %.6f\n", result);
    }

    // Task 10:
    public static long task10(long n) {
        long sum = 0;
        long a = 0, b = 1;

        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }
            long temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }

    public static void testTask10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 10: ");
        long n = scanner.nextLong();

        long result = task10(n);
        System.out.println("Task 10 result: " + result);
    }

    // Task 11:
    public static long task11(int n) {
        if (n <= 1) return n;

        long[][] matrix = {{1, 1}, {1, 0}};
        matrixPower(matrix, n - 1);
        return matrix[0][0];
    }

    private static void matrixPower(long[][] matrix, int power) {
        if (power <= 1) return;

        long[][] result = {{1, 0}, {0, 1}};
        while (power > 0) {
            if (power % 2 == 1) {
                multiplyMatrices(result, matrix);
            }
            multiplyMatrices(matrix, matrix);
            power /= 2;
        }

        matrix[0][0] = result[0][0];
        matrix[0][1] = result[0][1];
        matrix[1][0] = result[1][0];
        matrix[1][1] = result[1][1];
    }

    private static void multiplyMatrices(long[][] a, long[][] b) {
        long x1 = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        long x2 = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        long y1 = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        long y2 = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        a[0][0] = x1; a[0][1] = x2;
        a[1][0] = y1; a[1][1] = y2;
    }

    public static void testTask11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 11: ");
        int n = scanner.nextInt();

        long result = task11(n);
        System.out.println("Task 11 result: Fibonacci(" + n + ") = " + result);
    }

    // Task 12:
    public static long task12(long n) {
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;

        long a = 0, b = 0, c = 1;
        while (c < n) {
            long next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }

    public static void testTask12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 12: ");
        long n = scanner.nextLong();

        long result = task12(n);
        System.out.println("Task 12 result: " + result);
    }

    // Task 13:
    public static int task13(int a, int b) {
        int count = 0;
        int first = 1, second = 1;

        if (first >= a && first <= b) count++;
        if (second >= a && second <= b) count++;

        while (true) {
            int next = first + second + 1;
            if (next > b) break;
            if (next >= a) count++;
            first = second;
            second = next;
        }
        return count;
    }

    public static void testTask13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a for Task 13: ");
        int a = scanner.nextInt();
        System.out.print("Enter b for Task 13: ");
        int b = scanner.nextInt();

        int result = task13(a, b);
        System.out.println("Task 13 result: " + result);
    }

    // Task 14: Sum of i^K for i=1 to N
    public static double task14(int N, int K) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, K);
        }
        return sum;
    }

    public static void testTask14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N for Task 14: ");
        int N = scanner.nextInt();
        System.out.print("Enter K for Task 14: ");
        int K = scanner.nextInt();

        double result = task14(N, K);
        System.out.printf("Task 14 result: %.6f\n", result);
    }

    // Task 15:
    public static double task15(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, N - i + 1);
        }
        return sum;
    }

    public static void testTask15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N for Task 15: ");
        int N = scanner.nextInt();

        double result = task15(N);
        System.out.printf("Task 15 result: %.6f\n", result);
    }

    // Task 16:
    public static void task16(int N, int a) {
        if (N < 1) return;

        int A1 = 1, A2 = 2, A3 = 3;
        int sum = 0;

        System.out.print("Sequence: " + A1 + " ");
        if (A1 < a) sum += A1;

        if (N >= 2) {
            System.out.print(A2 + " ");
            if (A2 < a) sum += A2;
        }

        if (N >= 3) {
            System.out.print(A3 + " ");
            if (A3 < a) sum += A3;
        }

        int prev1 = A1, prev2 = A2, prev3 = A3;
        for (int k = 4; k <= N; k++) {
            int Ak = prev3 + prev2 - 2 * prev1;
            System.out.print(Ak + " ");
            if (Ak < a) sum += Ak;

            prev1 = prev2;
            prev2 = prev3;
            prev3 = Ak;
        }
        System.out.println("\nSum of elements < " + a + ": " + sum);
    }

    public static void testTask16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N for Task 16: ");
        int N = scanner.nextInt();
        System.out.print("Enter a for Task 16: ");
        int a = scanner.nextInt();

        task16(N, a);
    }

    // Task 17:
    public static double task17(int n) {
        double sum = 0;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            double term = (i + 1.0) / factorial;
            if (i % 2 == 1) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        return sum;
    }

    public static void testTask17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 17: ");
        int n = scanner.nextInt();

        double result = task17(n);
        System.out.printf("Task 17 result: %.6f\n", result);
    }

    // Task 18:
    public static int task18() {
        int count = 0;
        for (int num = 100; num <= 999; num++) {
            if (hasDigitsDifferingBy3(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasDigitsDifferingBy3(int num) {
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        return Math.abs(d1 - d2) >= 3 &&
                Math.abs(d1 - d3) >= 3 &&
                Math.abs(d2 - d3) >= 3;
    }

    public static void testTask18() {
        int result = task18();
        System.out.println("Task 18 result: " + result);
    }

    // Task 19: Two expressions
    public static double task19a(int n, double x) {
        double sum = 0;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += 1.0 / factorial + Math.sqrt(Math.abs(x));
        }
        return sum;
    }

    public static double task19b(int n, double x) {
        double product = 1;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            product *= 1 + Math.sin(i * x) / factorial;
        }
        return product;
    }

    public static void testTask19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 19: ");
        int n = scanner.nextInt();
        System.out.print("Enter x for Task 19: ");
        double x = scanner.nextDouble();

        double resultA = task19a(n, x);
        double resultB = task19b(n, x);
        System.out.printf("Task 19a result: %.6f\n", resultA);
        System.out.printf("Task 19b result: %.6f\n", resultB);
    }

    // Task 20:
    public static double task20(int m) {
        if (m == 1) return 0;
        if (m == 2) return 5.0 / 8;

        double x1 = 0, x2 = 5.0 / 8;
        double sum = x1 + x2;

        for (int i = 3; i <= m; i++) {
            double xi = x2 / 2 + 0.75 * x1;
            sum += xi;
            x1 = x2;
            x2 = xi;
        }
        return sum;
    }

    public static void testTask20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m for Task 20: ");
        int m = scanner.nextInt();

        double result = task20(m);
        System.out.printf("Task 20 result: %.6f\n", result);
    }

    // Task 21: Sum of another sequence
    public static double task21(int m) {
        if (m == 1) return 1;
        if (m == 2) return 1 + 0.3;

        double x1 = 1, x2 = 0.3;
        double sum = x1 + x2;

        for (int i = 3; i <= m; i++) {
            double xi = (i + 1) * x1;
            sum += xi;
            x1 = x2;
            x2 = xi;
        }
        return sum;
    }

    public static void testTask21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m for Task 21: ");
        int m = scanner.nextInt();

        double result = task21(m);
        System.out.printf("Task 21 result: %.6f\n", result);
    }

    // Task 22:
    public static int task22(int n) {
        int count = 0;
        for (int num = 100; num <= 999; num++) {
            if (hasExactlyTwoSameDigits(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
        }
        return 0;
    }

    private static boolean hasExactlyTwoSameDigits(int num) {
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        return (d1 == d2 && d1 != d3) ||
                (d1 == d3 && d1 != d2) ||
                (d2 == d3 && d2 != d1);
    }

    public static void testTask22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 22: ");
        int n = scanner.nextInt();

        int result = task22(n);
        System.out.println("Task 22 result: " + result);
    }

    // Task 23:
    public static int task23(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            if (hasAllOddDigits(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
        return 0;
    }

    private static boolean hasAllOddDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) return false;
            num /= 10;
        }
        return true;
    }

    public static void testTask23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 23: ");
        int n = scanner.nextInt();

        int result = task23(n);
        System.out.println("Task 23 result: " + result);
    }

    // Task 24:
    public static int task24() {
        int sum = 0;
        for (int num = 100; num <= 999; num++) {
            if (hasAllDifferentDigits(num)) {
                sum += num;
            }
        }
        return sum;
    }

    private static boolean hasAllDifferentDigits(int num) {
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;
        return d1 != d2 && d1 != d3 && d2 != d3;
    }

    public static void testTask24() {
        int result = task24();
        System.out.println("Task 24 result: " + result);
    }

    // Task 25:
    public static int task25(int n, int a, int b) {
        int count = 0;
        int sum = 0;
        int num = 1;

        while (count < n) {
            if (num % a == 0 && num % b != 0) {
                sum += num;
                count++;
            }
            num++;
        }
        return sum;
    }

    public static void testTask25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 25: ");
        int n = scanner.nextInt();
        System.out.print("Enter a for Task 25: ");
        int a = scanner.nextInt();
        System.out.print("Enter b for Task 25: ");
        int b = scanner.nextInt();

        int result = task25(n, a, b);
        System.out.println("Task 25 result: " + result);
    }

    // Task 26:
    public static int task26(int n) {
        if (n == 0) return 0;

        int count = 0;
        int num = 0;

        while (count <= n) {
            if (isPalindrome(num)) {
                if (count == n) {
                    return num;
                }
                count++;
            }
            num++;
        }
        return -1;
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) return false;
        if (num < 10) return true;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return original == reversed;
    }

    public static void testTask26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for Task 26: ");
        int n = scanner.nextInt();

        int result = task26(n);
        System.out.println("Task 26 result: " + result);
    }

    // Task 27:
    public static int task27(int A, int B) {
        int count = 0;
        for (int num = A; num <= B; num++) {
            if (hasExactlyThreePrimeFactors(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasExactlyThreePrimeFactors(int num) {
        int count = 0;
        int temp = num;

        for (int i = 2; i * i <= temp && count < 4; i++) {
            if (temp % i == 0) {
                count++;
                while (temp % i == 0) {
                    temp /= i;
                }
            }
        }

        if (temp > 1) count++;
        return count == 3;
    }

    public static void testTask27() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A for Task 27: ");
        int A = scanner.nextInt();
        System.out.print("Enter B for Task 27: ");
        int B = scanner.nextInt();

        int result = task27(A, B);
        System.out.println("Task 27 result: " + result);
    }

// Task 28:
public static int task28(int A, int B) {
    int count = 0;
    for (int num = A; num <= B; num++) {
        if (formsArithmeticOrGeometricProgression(num)) {
            count++;
        }
    }
    return count;
}

private static boolean formsArithmeticOrGeometricProgression(int num) {
    if (num < 100) return true; // All 1 and 2 digit numbers


    int digitCount = countDigits(num);
    if (digitCount <= 2) return true;


    int[] digits = new int[digitCount];
    int temp = num;
    for (int i = digitCount - 1; i >= 0; i--) {
        digits[i] = temp % 10;
        temp /= 10;
    }

    // Check arithmetic progression
    boolean isArithmetic = true;
    int diff = digits[1] - digits[0];
    for (int i = 2; i < digitCount; i++) {
        if (digits[i] - digits[i-1] != diff) {
            isArithmetic = false;
            break;
        }
    }

    boolean isGeometric = true;
    if (digits[0] == 0) {
        isGeometric = false;
    } else {
        double ratio = (double) digits[1] / digits[0];
        for (int i = 2; i < digitCount; i++) {
            if (digits[i] == 0 || Math.abs((double) digits[i] / digits[i-1] - ratio) > 1e-9) {
                isGeometric = false;
                break;
            }
        }
    }

    return isArithmetic || isGeometric;
}

private static int countDigits(int num) {
    if (num == 0) return 1;
    int count = 0;
    while (num > 0) {
        count++;
        num /= 10;
    }
    return count;
}

public static void testTask28() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter A for Task 28: ");
    int A = scanner.nextInt();
    System.out.print("Enter B for Task 28: ");
    int B = scanner.nextInt();

    int result = task28(A, B);
    System.out.println("Task 28 result: " + result);
}

// Task 29:
public static int task29(int k) {
    if (k <= 0) return -1;

    int num = 1;
    int position = 0;

    while (true) {
        int numDigits = countDigits(num);
        if (position + numDigits >= k) {
            // The kth digit is in this number
            int digitPosition = k - position - 1;
            return getDigitAtPosition(num, digitPosition);
        }
        position += numDigits;
        num++;
    }
}

private static int getDigitAtPosition(int num, int position) {
    int numDigits = countDigits(num);
    // Remove digits from the right until we get to the desired position
    for (int i = 0; i < numDigits - position - 1; i++) {
        num /= 10;
    }
    return num % 10;
}

public static void testTask29() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter k for Task 29: ");
    int k = scanner.nextInt();

    int result = task29(k);
    System.out.println("Task 29 result: " + result);
}

// Task 30:
public static int task30(int A, int B) {
    int sum = 0;
    for (int num = A; num <= B; num++) {
        if (hasEqualEvenOddDigits(num)) {
            sum += num;
        }
    }
    return sum;
}

private static boolean hasEqualEvenOddDigits(int num) {
    if (num == 0) return true; // 0 has 1 even digit (0 is even)

    int evenCount = 0, oddCount = 0;
    int temp = Math.abs(num); // Handle negative numbers

    while (temp > 0) {
        int digit = temp % 10;
        if (digit % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        temp /= 10;
    }

    return evenCount == oddCount;
}

public static void testTask30() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter A for Task 30: ");
    int A = scanner.nextInt();
    System.out.print("Enter B for Task 30: ");
    int B = scanner.nextInt();

    int result = task30(A, B);
    System.out.println("Task 30 result: " + result);
}

// Task 31:
public static int task31(int n) {
    if (n == 0) return 0;

    int count = 0;
    int num = 0;

    while (count <= n) {
        if (isMonotonic(num)) {
            if (count == n) {
                return num;
            }
            count++;
        }
        num++;
    }
    return -1;
}

private static boolean isMonotonic(int num) {
    if (num < 100) return true; // All 1 and 2 digit numbers

    int digitCount = countDigits(num);
    int[] digits = new int[digitCount];
    int temp = num;

    // Extract digits
    for (int i = digitCount - 1; i >= 0; i--) {
        digits[i] = temp % 10;
        temp /= 10;
    }

    boolean increasing = true;
    boolean decreasing = true;

    for (int i = 1; i < digitCount; i++) {
        if (digits[i] > digits[i-1]) {
            decreasing = false;
        } else if (digits[i] < digits[i-1]) {
            increasing = false;
        }
    }

    return increasing || decreasing;
}

public static void testTask31() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n for Task 31: ");
    int n = scanner.nextInt();

    int result = task31(n);
    System.out.println("Task 31 result: " + result);
}

// Task 32:
public static int task32(int n) {
    int count = 0;
    int sum = 0;
    int num = 2;

    while (count < n) {
        if (isPrime(num)) {
            sum += num;
            count++;
        }
        num++;
    }
    return sum;
}

private static boolean isPrime(int num) {
    if (num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;

    for (int i = 3; i * i <= num; i += 2) {
        if (num % i == 0) return false;
    }
    return true;
}

public static void testTask32() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n for Task 32: ");
    int n = scanner.nextInt();

    int result = task32(n);
    System.out.println("Task 32 result: " + result);
}


}



