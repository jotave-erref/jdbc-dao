
package db;
public class DbException extends RuntimeException{
	//Exceção personalizada para acesso aos dados
	
	private static final long serialVersionUID = 1L; // numero de versão

	public DbException(String msg) {
		super(msg);
	}
}
