public class Binario extends Numero{

	private long valor;
	
	public Binario(long valor){
		super(2);
		this.valor = valor;
	}
	
	public boolean numValido(){
		boolean bueno = true;
		if(this.valor<0) bueno = false;
		String cadena = Long.toString(this.valor);
		for(int i=0;i<cadena.length();i++)
			if(cadena.charAt(i)<'0' || cadena.charAt(i)>'1') bueno = false;
		return bueno;
	}
	
	public long getValor(){
		return this.valor;
	}
	
	@Override
	public String toString(){
		return this.valor +" (binario)";
	}
	
	protected Decimal binDec(){
		int posicion = 0;
		int valorDecimal = 0;
		while(this.valor>0){
			valorDecimal += (this.valor - ((this.valor/10)*10))*Math.pow(2, posicion);
			posicion++;
			this.valor/=10;
		}
		return new Decimal(valorDecimal);
	}
	
	private static String cifraOctal(String bin){
		switch(bin){
			case "0":
				return "0";
			case "1":
				return "1";
			case "10":
				return "2";
			case "11":
				return "3";
			case "000":
				return "0";
			case "001":
				return "1";
			case "010":
				return "2";
			case "011":
				return "3";
			case "100":
				return "4";
			case "101":
				return "5";
			case "110":
				return "6";
			case "111":
				return "7";
			default:
				return "";
		}
	}
	
	protected Octal binOct(){
		String cadena = Long.toString(this.valor);
		if(cadena.length()>3){
			while(!(cadena.length()%3==0)){
				cadena = "0"+cadena;
			}
		}
		String resultado = "";
		if(cadena.length()>3){
			for(int i=0;i<cadena.length()-2;i+=3){
				resultado += cifraOctal(cadena.substring(i,i+3));
			}
		}else{
			resultado = cifraOctal(cadena);
		}
		return new Octal(resultado);
	}
	
	private static String cifraHex(String bin){
		switch(bin){
			case "0":
				return "0";
			case "1":
				return "1";
			case "10":
				return "2";
			case "11":
				return "3";
			case "100":
				return "4";
			case "101":
				return "5";
			case "110":
				return "6";
			case "111":
				return "7";
			case "0000":
				return "0";
			case "0001":
				return "1";
			case "0010":
				return "2";
			case "0011":
				return "3";
			case "0100":
				return "4";
			case "0101":
				return "5";
			case "0110":
				return "6";
			case "0111":
				return "7";
			case "1000":
				return "8";
			case "1001":
				return "9";
			case "1010":
				return "A";
			case "1011":
				return "B";
			case "1100":
				return "C";
			case "1101":
				return "D";
			case "1110":
				return "E";
			case "1111":
				return "F";
			default:
				return "";
			}
	}
	
	protected Hexadecimal binHex(){
		String cadena = Long.toString(this.valor);
		if(cadena.length()>4){
			while(!(cadena.length()%4==0)){
				cadena = "0"+cadena;
			}
		}
		String resultado = "";
		if(cadena.length()>4){
			for(int i=0;i<cadena.length()-3;i+=4){
				resultado += cifraHex(cadena.substring(i,i+4));
			}
		}else{
			resultado = cifraHex(cadena);
		}
		return new Hexadecimal(resultado);
	}
}