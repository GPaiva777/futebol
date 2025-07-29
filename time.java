public class time{
    private String nome;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    public time() {
        pontos = 0 ;
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getPontos (){
        return pontos;
    }
    public void setPontos (int pontos){
        this.pontos = pontos;
    }
    public int getVitorias  (){
        return vitorias;
    }
    public void setVitorias (int vitorias){
        this.vitorias = vitorias;
    }
    public int getEmpates (){
        return empates;
    }
    public void setEmpates (int empates){
        this.empates = empates;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas (int derrotas){
        this.derrotas = derrotas;
    }
    public void mostrar (){
        System.out.println(nome);
        System.out.println("Pontos: "+pontos);
        System.out.println("Vitorias: "+vitorias);
        System.out.println("Empates: "+empates);
        System.out.println("Derrotas: "+derrotas);
    }
}