
package db;
public class DbException extends RuntimeException{
	//Exce��o personalizada para acesso aos dados
	
	private static final long serialVersionUID = 1L; // numero de vers�o

	public DbException(String msg) {
		super(msg);
	}
}
