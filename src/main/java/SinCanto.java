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
public class SinCanto implements TipoSonido{

    public static final Logger logger= LoggerFactory.getLogger(SinCanto.class)
    public void makeSound(){
        logger.debug("<<Silencio>>");
        System.out.println("<<Silecio>>");
    }
    
    
    
}
