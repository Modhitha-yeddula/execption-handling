class Test1{
    public static void main(String[] args){
     int[] arr={1,2,3,4};
     try{
        System.out.println(arr[4]);
     }   
     catch(Exception e){
        System.out.println("AIOBE");
     }
    }
}