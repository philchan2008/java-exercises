    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = Integer.MIN_VALUE;
             HashSet<Integer> set = new HashSet<>();
             boolean isDebug = false;
             for (int i = 0; i < n; i++) {
                    int input = in.nextInt();

                    deque.add(input);
                    set.add(input);
                    if (isDebug) printVar(deque);
                    if (isDebug) printVar(set);
                    if (deque.size() == m) {
                        if (isDebug) System.out.printf("-- max(old) = %d; ", max);
                        if (set.size() > max) max = set.size();
                        if (isDebug) System.out.printf("max(new) = %d\n", max);
                        int first = deque.remove();
                        if (!deque.contains(first)) set.remove(first);
                        if (isDebug) System.out.print("-- removed: ");
                        if (isDebug) printVar(deque);
                    }
                    if (isDebug) System.out.println("==========================");
                }

                System.out.println(max);
        }

        public static void printVar(Iterable list) {
            System.out.print(list.getClass().getSimpleName() + ": ");
            for (Object i: list) {
                System.out.printf("%d, ", i);
            }
            System.out.println("");
        }
    }



