public class condicionalTernaria {
    public static void main(String[] args) throws Exception {
        //EXTRUTURA CONDICIONAL COMPOSTA
     /*   int nota = 6;

         if (nota >= 7)
         System.out.println("APROVADO");
         
         else if (nota >= 5 && nota < 7)
         System.out.println("RECUPERAÇÃO");
            
         else
         System.out.println("REPROVADO");  */


         // CONDIÇÃO TERNARIA (CENÁRIO 1) ternaria simples
       /*   int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado); */


        // CONDIÇÃO TERNARIA (CENÁRIO 2) ternaria composta

         int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
