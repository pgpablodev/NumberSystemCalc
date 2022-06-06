public class Octal extends Numero{	
	private String valor;
	
	public Octal(String valor){
		super(8);
		this.valor = valor;
	}
	
	public boolean numValido(){
		boolean bueno = true;
		int longitud = valor.length();
		for(int i=0;i<longitud;i++){
			char cifra = this.valor.charAt(i);
			if(cifra<'0' || cifra>'7') bueno = false;
		}
		return bueno;
	}
	
	public String getValor(){
		return this.valor;
	}
	
	@Override
	public String toString(){
		return this.valor +" (octal)";
	}
	
	private static String cifraBin(char oct){
		switch(oct){
			case '0':
				return "000";
			case '1':
				return "001";
			case '2':
				return "010";
			case '3':
				return "011";
			case '4':
				return "100";
			case '5':
				return "101";
			case '6':
				return "110";
			case '7':
				return "111";
			default:
				return "";
		}
	}
	
	protected Binario octBin(){
		String resultado = "";
		for(int i=0;i<this.valor.length();i++){
			resultado += cifraBin(this.valor.charAt(i));
		}
		long valorBinario;
		try{
			valorBinario = Long.parseLong(resultado);
		}catch(NumberFormatException nfe){
			valorBinario = 0;
		}
		return new Binario(valorBinario);
	}
}