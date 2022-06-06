public class Decimal extends Numero{	
private int valor;
	
	public Decimal(int valor){
		super(10);
		this.valor = valor;	
	}
	
	public boolean numValido(){
		return this.valor>=0;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	@Override
	public String toString(){
		return this.valor +" (decimal)";
	}
	
	protected Binario decBin(){
		int exp = 0;
		double valorBinario = 0;
		while(this.valor!=0){
			valorBinario += (this.valor%2)*Math.pow(10, exp);
			exp++;
			this.valor/=2;
		}
		return new Binario((long) valorBinario);
	}
}