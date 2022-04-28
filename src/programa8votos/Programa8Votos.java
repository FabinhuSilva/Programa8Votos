
package programa8votos;

/**
 *
 * @author Fabiano F Silva
 */
public class Programa8Votos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int votos1,votos2,votos3,votos4,nuloOpcao5,votoBrancoOpcao6;
        
        int opcao;
        double percentualBranco,percentualNulo;
        
        do {
            switch(opcao){
                case 1:
                    votos1=+1;
                    
                    break;
                case 2:
                    votos2=+1;
                    
                    break;
                case 3:
                    votos3=+1;
                    
                    break;
                case 4:
                    votos4=+1;
                    break;
                case 5:
                    //Votos Nulos
                    nuloOpcao5=+1;
                    break;
                case 6:
                    //Votos em Branco
                    votoBrancoOpcao6=+1;
                    break;
                Default:
                    break;
                    System.out.println(votos1);
                        
            }
            
        }while (opcao==0)
                
                System.out.println("======> Total Votação <======\n"
                        + "Candidato 01 - "+votos1+" Votos \n"
                        + "Candidato 02 - "+votos2+" Votos \n"
                        + "Candidato 03 - "+votos3+" Votos \n"
                        + "Candidato 04 - "+votos4+" Votos \n"
                        + "Votos Nulos - "+nuloOpcao5+" Votos \n"
                        + "Votos em Branco - "+votoBrancoOpcao6+" Votos\n"
                                + "\n\n ====> Percentuais <====\n"
                                + "\n Nulos Sobre o Total - "++"Votos\n"
                                + "Brancos Sobre o Total - "++"Votos\n");
        
    }
    
}
