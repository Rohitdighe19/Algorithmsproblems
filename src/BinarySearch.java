public class BinarySearch {
    public static void main(String[] args) {
        String[] name = {"Anirudha", "Abhijit", "Akash", "Lokesh", "Rohit", "Pravin", "Shubham"};
        String Search = "Akash";
        int li = 0;
        int hi = name.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (name[mi] == Search) {
                System.out.println("Element is at " + mi + " index position.");
                break;
            } else if (Search.compareTo(name[mi]) > 0) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(li>hi){
            System.out.println("Element Not Found");
        }
    }
}