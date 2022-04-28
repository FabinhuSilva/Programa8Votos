
package programa8votos;

import java.util.Scanner;

/**
 *
 * @author Fabiano F Silva
 */
public class Programa8Votos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captaTeclado = new Scanner(System.in); 
        
       int votos1=0,votos2=0,votos3=0,votos4=0,votoNuloOpcao5=0,votoBrancoOpcao6=0;
        
       int opcao=99;
       float  percentualBranco,percentualNulo;
        
        do {
            System.out.println("===> Urna Eletronica <===\n"
                    + "Candidato João  - Código 1\n"
                    + "Candidato José  - Código 2\n"
                    + "Candidato Pedro - Código 3\n"
                    + "Candidato Paulo - Código 4\n"
                    + "Voto Nulo - Código 5\n"
                    + "Voto em Branco - Código 6\n\n"
                    + "Para Encerrar Digite 0 (Zero)" );
            opcao=captaTeclado.nextInt();
            
            switch(opcao){
                case 1:
                    votos1= votos1+1;
                    continue;
                case 2:
                    votos2= votos2+1;
                    
                    continue;
                case 3:
                    votos3= votos3+1;
                    
                    continue;
                case 4:
                   votos4= votos4+1;
                    continue;
                case 5:
                    //Votos Nulos
                    votoNuloOpcao5=votoNuloOpcao5+1;
                    continue;
                case 6:
                    //Votos em Branco
                    votoBrancoOpcao6=votoBrancoOpcao6+1;
                    continue;
                default:
                    if(opcao != 0){
                    System.out.println("Opção Invalida");
                    }
                    continue;
            }
            
        }while (opcao != 0);
                
                //Percentuais do Votos
                float totaisDeVotos=(votos1 + votos2 + votos3 + votos4 + 
                        votoBrancoOpcao6 + votoNuloOpcao5);

                percentualBranco = (totaisDeVotos/100)*votoBrancoOpcao6;
                
                percentualNulo = (totaisDeVotos /100)*votoNuloOpcao5;
                
                System.out.println("======> Total Votação <======\n"
                        + "Candidato 01 - "+votos1+" Votos \n"
                        + "Candidato 02 - "+votos2+" Votos \n"
                        + "Candidato 03 - "+votos3+" Votos \n"
                        + "Candidato 04 - "+votos4+" Votos \n"
                        + "Votos Nulos - "+votoNuloOpcao5+" Votos \n"
                        + "Votos em Branco - "+votoBrancoOpcao6+" Votos\n"
                                + "\n\n ====> Percentuais <====\n"
                                + "\n Nulos Sobre o Total - "+percentualNulo+"%\n"
                                + "Brancos Sobre o Total - "+percentualBranco+"%\n");
        
    }
    
}
