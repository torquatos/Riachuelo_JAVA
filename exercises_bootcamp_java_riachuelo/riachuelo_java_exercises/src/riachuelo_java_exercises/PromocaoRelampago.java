package riachuelo_java_exercises;
import java.math.*;
import java.util.*;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Insira o valor da compra: ");
        
        String valorCompra = scanner.nextLine(); 
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal desconto10 = new BigDecimal("0.1");
        BigDecimal desconto20 = new BigDecimal("0.2");
        
        
        double valorDaCompra = Double.parseDouble(valorCompra);
        
       
        // TODO: Verifique se o valor é menor que 50.00:
      

       // TODO: Verifique se o valor é entre 50.00 e 100.00 (inclusive):
       

        // TODO: Caso contrário, o valor é maior que 100.00:
        
        
        // TODO: Retorne a string formatada com o desconto aplicado, conforme exigido no desafio:
        if (valorDaCompra<50) {
    //      
          System.out.println ("Desconto de 0%");
          System.out.println ("Valor a pagar: R$ " + valor);
        }
        
        else if (valorDaCompra>=50 && valorDaCompra<=100) {
          System.out.println ("Desconto de 10%");
          BigDecimal valorDesconto10 = valor.multiply(desconto10);
          BigDecimal valorPagar = valor.subtract(valorDesconto10);
          System.out.println ("Valor a pagar: R$ " + valorPagar);
          
        }
        
        else {
          System.out.println ("Desconto de 20%");
          BigDecimal valorDesconto20 = valor.multiply(desconto20);
          BigDecimal valorAPagar = valor.subtract(valorDesconto20);
          System.out.println ("Valor a pagar: R$ " + valorAPagar);
          
        }
        
    

    }
}