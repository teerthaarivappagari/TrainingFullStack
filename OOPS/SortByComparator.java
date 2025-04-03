import java.util.Arrays;
 import java.util.Comparator;
  class SortByComparator  { 
    public static void main(String[] args) {
         Integer[] numbers = {5, 1, 3, 7, 2};
          Arrays.sort(numbers, new Comparator<Integer>() { 
            public int compare(Integer a, Integer b) {
                 return a - b; 
                }
             }
             );
              System.out.println(Arrays.toString(numbers));
            }
            }
