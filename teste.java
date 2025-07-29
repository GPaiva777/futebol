public class teste {
    public static void main(String[] args) {
        time localtime = new time ();
        time visitime = new time();
        localtime.setNome("Corithians");
        visitime.setNome("Palmeiras");

        partida p = new partida();
        p.setTl(localtime);
        p.setTv(visitime);

        System.out.println("==========================================Resultado da primeira partida======================");
        p.IP();
        p.MR();
        p.fP();

        System.out.println("==========================================Tabela de resultados======================");

        localtime.mostrar();
         System.out.println("\n");
        visitime.mostrar();

        System.out.println("==========================================Resultado da segunda partida======================");
        p.IP();
        p.MR();
        p.fP();

        System.out.println("==========================================Tabela de resultados======================");
        localtime.mostrar();
         System.out.println("\n");
        visitime.mostrar();

    }
}
