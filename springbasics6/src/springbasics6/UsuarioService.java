package springbasics6;

import org.springframework.stereotype.Service;

//@Service//esta anotación hace que se autoinstancie (es como declararlo en el dispatcherservlet
public class UsuarioService implements UsuarioServiceInterface {
	


	@Override
	public boolean existeUsuario(LoginUsuario login_usuario) {
		//TODO Aquí comprobaría si ese usuario existe en la base de datos
		//ya lo haremos ;)
		return true;
	}

}
