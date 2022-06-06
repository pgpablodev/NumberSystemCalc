public abstract class Numero{	
	private int base;
	
	public Numero(int base){
		this.base = base;
	}
	
	public boolean baseValida(){
		return this.base==2 || this.base==8 || this.base==10 || this.base==16;
	}
	
	protected abstract boolean numValido();
}