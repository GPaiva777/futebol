public class teste {
    public static void main(String[] args) throws InterruptedException {
        time localtime = new time ();
        time visitime = new time();
        localtime.setNome("Nautico");
        visitime.setNome("Sport");

        partida p = new partida();
        p.setTl(localtime);
        p.setTv(visitime);

        Thread.sleep(5000);
        System.out.println("==========================================Resultado da primeira partida======================");
        p.IP();
        p.MR();
        p.fP();
        
        Thread.sleep(5000);
        System.out.println("==========================================Tabela de resultados======================");

        localtime.mostrar();
         System.out.println("\n");
        visitime.mostrar();

        Thread.sleep(5000);
        System.out.println("==========================================Resultado da segunda partida======================");
        p.IP();
        p.MR();
        p.fP();

        Thread.sleep(5000);
        System.out.println("==========================================Tabela de resultados======================");
        Thread.sleep(5000);
        localtime.mostrar();
         System.out.println("\n");
        Thread.sleep(5000);
        visitime.mostrar();

    }
}
