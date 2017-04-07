import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    private static Integer[] VALUES = { 5, 2, 1, 9, 50, 56 };

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        Arrays.sort(VALUES, new Comparator() {

           
            @SuppressWarnings("unused")
			public int compare(Integer lhs, Integer rhs) {
                String v1 = lhs.toString();
                String v2 = rhs.toString();

                return (v1 + v2).compareTo(v2 + v1) * -1;
            }

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
        });

        String result = "";
        for (Integer integer : VALUES) {
            result += integer.toString();
        }

        System.out.println(result);
    }   
}    