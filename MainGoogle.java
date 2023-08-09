import java.util.ArrayList;

class MainGoogle {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> n = new ArrayList<>();         //contains() with Integer Arraylist

        // insert element to the arraylist
        n.add(2);
        n.add(3);
        n.add(5);
        System.out.println("Number ArrayList: " + n);

        // checks if 3 is present in the arraylist
        System.out.print("Is 3 present in the arraylist: ");
        System.out.println(n.contains(3));


        // checks if 1 is present in the arraylist
        System.out.print("Is 1 present in the arraylist: ");
        System.out.println(n.contains(1));

    }
}
