import hava.util.Scanner;
public class exe{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float soma,sub,multi,div,n1,n2;
        System.out.print("digite o primeiro número");
        n1 = leia.nextFloat();
        System.out.print("digite o segundo número");
        n2 = leia.nextFloat();
        soma =  n1+n2;
        sub = n1-n2;
        multi = n1*n2;
        div = n1/n2;
        System.out.print("A soma dos números é: " + soma);
        System.out.print("A subtração dos números é: " + sub);
        System.out.print("A multiplicação dos números é: " + multi);
        System.out.print("A divisão dos números é: " + div);
    }
}