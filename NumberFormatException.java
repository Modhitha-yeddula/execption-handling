class NumberFormatException{
    public static void main(String[] args){
        int i=0;
        try{
             i=Integer.parseInt("prostack");
        }
        catch(Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println("plz learn java buddies");

        }
    }
}