public class MaximumFinder {
    //Method to find maximum of three integers
    public static Float testMaximum(Float v1, Float v2, Float v3){
        Float max=v1;
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
        System.out.println("Maximum: "+ testMaximum(3.3f,2.2f,1.1f));
        System.out.println("Maximum: "+ testMaximum(1.1f,3.3f,2.2f));
        System.out.println("Maximum: "+ testMaximum(1.1f,2.2f,3.3f));
    }
}
