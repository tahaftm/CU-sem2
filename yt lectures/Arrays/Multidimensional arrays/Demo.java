public class Demo{
    public static void main(String[] args) {
        String[][] record = new String[][] {{"Taha","32"},{"Ali","54"}};

        for (String[] sub_arr : record) {
            for (String details : sub_arr) {
                System.err.print(details + " ");
            }
            System.out.println();
        }
    }
}