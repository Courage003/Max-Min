public class MaximumFinder {
    //Method to find maximum of three strings
    public static String testMaximum(String v1, String v2, String v3){
        String max=v1;
        //Assuming v1 is the maximum

        if(v2.compareTo(max)>0){
            max=v2;
        }
        if(v3.compareTo(max)>0){
            max=v3;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println("Find Maximum of Three Integers");
        System.out.println("Maximum: "+ testMaximum("Apple","Peach","Banana"));
        System.out.println("Maximum: "+ testMaximum("Apple","Banana","Peach"));
        System.out.println("Maximum: "+ testMaximum("Banana","Peach","Apple"));
    }
}
