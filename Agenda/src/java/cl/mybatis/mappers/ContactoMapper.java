
package cl.mybatis.mappers;
import cl.mybatis.pojos.Contacto;
import java.util.List;



public interface ContactoMapper {
    void insertarContacto(Contacto contacto);
    List<Contacto> getContactos();
    
}
