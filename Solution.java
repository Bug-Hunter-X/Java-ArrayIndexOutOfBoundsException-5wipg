public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        // Accessing a valid index
        System.out.println(arr[2]); 
        //Alternative way to prevent error
        try{
            System.out.println(arr[5]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
}