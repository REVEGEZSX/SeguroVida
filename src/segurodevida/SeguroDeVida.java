package segurodevida;

/**
 *
 * @author Federico Boranchera
 */
public class SeguroDeVida {

    public SeguroDeVida(){
    
    }
    
    public long Calcular(long ValorBase, boolean fumador, boolean alcoholico, boolean drogadicto, boolean cardiaco){
        long total=0;
        double recFumador=0, recAlcoholico=0, recDrogadico=0, recCardiaco=0;
        if(fumador){
            recFumador = ValorBase * 0.10;
        }
        if(alcoholico){
            recAlcoholico = ValorBase * 0.20;
        }
        if(drogadicto){
            recDrogadico = ValorBase * 0.25;
        }
        if(cardiaco){
            recCardiaco = ValorBase * 0.30;
        }
        total = (long) (ValorBase - (recFumador+recAlcoholico+recDrogadico+recCardiaco));
        return total;
    }
    
}
