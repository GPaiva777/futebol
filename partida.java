import java.util.Date;
import java.util.Random;
public class partida extends panteon {
    private time tl;
    private time tv;

    public time getTl(){
    return tl;
    }
    public void setTl(time tl){
        this.tl = tl;
    }

    public time getTv(){
    return tv;
    }
    public void setTv(time tv){
        this.tv = tv;
    }
	private int scV;
	private int scL;
	private Date daP;    
    
    public int getScV(){
        return scV;
    }
    public void setScV(int scV){
        this.scV = scV;
    }
    public int getScL(){
        return scL;
    }
    public void setScL(int scL){
        this.scL = scL;
    }
    public Date getDaP(){
        return daP;
    }
    public void setDaP(Date dap){
        this.daP = dap;
    }

    Random r = new Random();

    @Override
    public void IP(){
        scV = r.nextInt(10);
		scL = r.nextInt(10);
    }
    @Override
    public void MR(){
        System.out.println("\n" + tl.getNome()+ " " + scL + " x " + scV + " " + tv.getNome()+"\n");
    }
    @Override
    public void fP(){
        if (scL > scV){
            tl.setPontos(tl.getPontos()+3);
            tl.setVitorias(tl.getVitorias()+1);
            tv.setDerrotas(tv.getDerrotas()+1);
        }else if(scL < scV){
            tv.setPontos(tv.getPontos()+3);
            tv.setVitorias(tv.getVitorias()+3);
            tl.setDerrotas(tl.getDerrotas()+1);
        }else if (scL == scV){
            tv.setPontos(tv.getPontos()+1);
            tv.setEmpates(tv.getEmpates()+1);
            tl.setPontos(tl.getPontos()+1);
            tl.setEmpates(tl.getEmpates()+1);
        }
    }
}
