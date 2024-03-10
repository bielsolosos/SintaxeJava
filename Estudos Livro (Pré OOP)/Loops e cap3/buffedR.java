//to entendendo absolutamente nada sobre isso.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class buffedR{
    public static void main(String[] args) {
        BufferedReader dadEnt = new BufferedReader(new InputStreamReader(System.in));
        String nome = "";
        System.out.println("Digite seu nome eu acho?");
        try {
            nome = dadEnt.readLine();
        } catch (Exception ex) {
            
            ex.printStackTrace();
        }
        System.out.println("Seja bem vindo " + nome);
        
    }
}