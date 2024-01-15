public class ID_EX16
{
    public static int countNegativesR(Queue <Integer> q)
    {
        if (!q.isEmpty()) {
            if (q.remove() < 0) {
                return countNegativesR(q) + 1;
            } else {
                return countNegativesR(q);
            }
        }

        return 0;
    }
    public static int sumEvenR(Queue<Integer> q) {
        if (q.isEmpty()) {
            return 0;
        }

        Integer value = q.remove();

        if (value != null) {

            if (value % 2 == 0) {
                return value + sumEvenR(q);
            } else {
                return sumEvenR(q);
            }
        }
        q.insert(q.head());
        return 0;
    }



    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.insert(-7);
        q.insert(-12);
        q.insert(24);
        q.insert(-9);
        q.insert(67);
        q.insert(-29);
        System.out.println(sumEvenR(q));
        System.out.println(countNegativesR(q));
    }
}
