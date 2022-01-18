public class MethodRefJ8 {
    public void printMSG(){
        System.out.println("Hiiiiii, From Instance Method...");
    }
    public static void main(String[] args) {
        Thread t2=new Thread(new MethodRefJ8()::printMSG);//Referencing method
        t2.start();
    }
}
