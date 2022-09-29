/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.sfl4j.Logger;
/**
 *
 * @author pipel
 */
public class AvesTruz extends Ave {
   public static final Logger logger= LoggerFactory.getLogger(Avestruz.class)
   public Avestruz(){
       
       logger.debug("instanciaciando avestruz");
       tipoSonido= new SinCanto();
       tipoVuelo= new SinVuelo();
   }

}
