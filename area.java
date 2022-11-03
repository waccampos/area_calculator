package area;

import java.util.Scanner;

public class AreaGeo {
    int escolha;
    float l;
    float area;
    float b;
    float h;
    float r;
    public String continuar;
    
    
    @SuppressWarnings("empty-statement")
    public void area(){
    
        Scanner dados = new Scanner(System.in); 
        
        do{
        
        System.out.println("--------- Sistems de formas geometricas --------");
        System.out.println("digite 1 para calcular o quadrado");
        System.out.println("digite 2 para calcular o retangulo");
        System.out.println("digite 3 para calcular o triângulo");
        System.out.println("digite 4 para calcular o círculo");
        System.out.println(" ");
        escolha = dados.nextInt();
        if (escolha > 4){
            System.out.println("opçao invalida tente novamente.");
            System.out.println(" ");
            System.exit(escolha);
        }
        System.out.println("-------------------------------------------------");
        
        switch (escolha) {
            case 1 -> {
                System.out.println("sua escolha foi quadrado");
                System.out.print("digite o valor do lado para calcular a area: ");
                l = dados.nextFloat();
                area = l * l;
                System.out.println("o valor da area do quadrado e de: "+area);
            }
            case 2 -> {
                System.out.println("sua escolha foi o retangulo");
                System.out.print("digite o valor da base: ");
                b = dados.nextFloat();
                System.out.print("digite o valor da altura: ");
                h = dados.nextFloat();
                area = b * h;
                System.out.println("o valor da area do retangulo e de : "+area);
            }
            case 3 -> {
                System.out.println("sua escolha foi o triangulo");
                System.out.print("digite o valor da base: ");
                b = dados.nextFloat();
                System.out.print("digite o valor da altura: ");
                h = dados.nextFloat();
                area = (b*h) /2;
                System.out.println("o valor da area do triangulo e de: "+area);
            }
            case 4 -> {
                System.out.println("sua escolha foi o circulo");
                System.out.print("digite o valor do raio: ");
                r = dados.nextFloat();
                area = (float) (Math.PI*(r*r));
                System.out.println("o valor da area do circulo e de: "+area);
            }
            }
                System.out.println(" ");
                System.out.println("quer calcular mais alguma area? [s/n]");
                continuar = dados.next();
        
        }while (continuar.equals("s"));       
}
}
