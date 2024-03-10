/**
 * Array_Ativ1
 */
public class Array_Ativ1 {
    public static void main(String[] args) {
        int n[] = new int[100];
        //para fazer a ativ2 só substituir o range do array p/ 101
        for (int i = 1; i < n.length; i+=1) {
            n[i] = i;
            System.out.println (n[i]);
            
        }   
        //System.out.println(n.length);
    }

    
}