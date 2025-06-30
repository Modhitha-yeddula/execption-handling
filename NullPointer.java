class NullPointer{
    public static void main(String[] args){
        Integer eid=null;
        try{
            System.out.println(eid);

        }
        catch(Exception e){
            System.out.println("NullPointerException:" +e.getMessage());
        }
    }
}