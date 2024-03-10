class condicional{
    //Um breve teste do switch case visto no livro
    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 5;
        int nota3 = 5;
        int Nota_final = 10;
        //agora vamos calcular a média
        int media_inicial = ((nota1+nota2+nota3)/3);
        
        if (media_inicial >= 6) {
            System.out.println("Aluno Aprovado");
        }

        else if (media_inicial == 5) {

            System.out.println("Aluno em recuperação, Fazendo prova final.");

                if (((media_inicial + Nota_final)/2) >= 5 ) {
                    System.out.println("Aluno Aprovado");
                }
                    else{
                        System.out.println("Aluno Reprovado");
                    }
        }

        else{
                System.out.println("Aluno Reprovado");
                
            }
            
        
        }
    }
