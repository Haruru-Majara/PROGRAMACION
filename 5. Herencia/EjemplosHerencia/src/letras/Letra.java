package letras;


public abstract class Letra{
	protected char c; // caracter de dibujo
	protected char s; // caracter a dibujar
	
	public Letra(char car,char cad){
		c=car;
		s=cad;
		}

	abstract public void dibuja();
			
	}