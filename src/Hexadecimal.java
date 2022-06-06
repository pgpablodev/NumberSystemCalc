public class Hexadecimal extends Numero{	
	private String valor;
	
	public Hexadecimal(String valor){
		super(16);
		this.valor = valor;
	}
	
	public boolean numValido(){
		boolean bueno = true;
		int longitud = valor.length();
		for(int i=0;i<longitud;i++){
			int letra = this.valor.charAt(i);
			if(letra<'0' || letra>'9'){
				bueno = false;
				if(letra>='A' && letra<='F') bueno = true;
			}
		}
		return bueno;
	}
	
	@Override
	public String toString(){
		return "0x" +this.valor;
	}
	
	public String getValor(){
		return this.valor;
	}
	
	private static String cifraBin(char hex){
		switch(hex){
			case '0':
				return "0000";
			case '1':
				return "0001";
			case '2':
				return "0010";
			case '3':
				return "0011";
			case '4':
				return "0100";
			case '5':
				return "0101";
			case '6':
				return "0110";
			case '7':
				return "0111";
			case '8':
				return "1000";
			case '9':
				return "1001";
			case 'A':
				return "1010";
			case 'B':
				return "1011";
			case 'C':
				return "1100";
			case 'D':
				return "1101";
			case 'E':
				return "1110";
			case 'F':
				return "1111";
			default:
				return "";
		}
	}
	
	protected Binario hexBin(){
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