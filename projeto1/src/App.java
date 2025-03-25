public class App {
    public static void main(String[] args) throws Exception {
        int num = 5;
        String bin = "";
        while(num !=1){
            bin +=num%2;
            num/=2;
            
        }
        bin+=num;
        String binReverse = new StringBuilder(bin).reverse().toString();
        System.out.println(Long.parseLong(binReverse));

    }
}