import java.io.BufferedReader;
import java.io.InputStreamReader;
public class bufR_Ativ1 {
    public static void main(String[] args) {
        BufferedReader dadEnt = new BufferedReader(new InputStreamReader(System.in));
        String nomes[] ={"","","","",""};
        System.out.println("Junta 5 Strings");
        try {
            nomes[0] = dadEnt.readLine();
            nomes[1] = dadEnt.readLine();
            nomes[2] = dadEnt.readLine();
            nomes[3] = dadEnt.readLine();

        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        } 
        System.out.println(nomes[0] + " " + nomes[1]+ " " + nomes[2] + " " + nomes[3]);
    }
    
}
//Pag 86 atividade 1