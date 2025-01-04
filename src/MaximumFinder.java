public class MaximumFinder {
    //Method to find maximum of three integers
    public static Integer testMaximum(Integer v1, Integer v2, Integer v3){
        Integer max=v1;
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
        System.out.println("Maximum: "+ testMaximum(3,2,1));
        System.out.println("Maximum: "+ testMaximum(1,3,2));
        System.out.println("Maximum: "+ testMaximum(1,2,3));
    }
}
