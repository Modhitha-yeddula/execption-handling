import java.io.PrintWriter;

class Test{
    public static  void main(String[] args){
        try{
             PrintWriter pw = new PrintWriter("abc.txt");
            pw.println("hello,World!");
            pw.close();
        }
        catch(Exception e){
            System.out.println("file is not there");
        }
    }
}