package fibonacciSequence;

public class FibonacciSequence {
    public static long[] generate(int length) {
        long[] sequence = new long[length];
        sequence[0] = 1;
        sequence[1] = 1;
        for (int a = 2; a < length; ++a) {
            sequence[a] = sequence[a - 2] + sequence[a - 1];
        }
        return sequence;
    }
}