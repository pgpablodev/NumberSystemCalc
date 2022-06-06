import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;

public class CalculadoraGUI{

	protected Shell shell;
	private Text numDisplay;
	private int baseActual;	
	private Decimal memoria;
	private char ultimaAccion;
	private boolean luz;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CalculadoraGUI window = new CalculadoraGUI();
			window.baseActual = 10;
			window.ultimaAccion=' ';
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		shell.setSize(357, 552);
		shell.setText("Calculadora de programador");
		shell.setMinimumSize(357, 552);
		shell.setLayout(null);	
		
		Label baseDisplay = new Label(shell, SWT.NONE);
		baseDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		baseDisplay.setAlignment(SWT.CENTER);
		baseDisplay.setBounds(303, 47, 34, 21);
		baseDisplay.setText("DEC");
		
		Label versionDisplay = new Label(shell, SWT.NONE);
		versionDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		versionDisplay.setBounds(298, 15, 34, 21);
		versionDisplay.setText("v 0.0.5");
		
		numDisplay = new Text(shell, SWT.BORDER);
		numDisplay.setEditable(false);
		numDisplay.setText("0");
		numDisplay.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		numDisplay.setBounds(140, 75, 192, 56);
		
		Button teclaA = new Button(shell, SWT.NONE);
		teclaA.setEnabled(false);
		teclaA.setText("A");
		teclaA.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaA.setBounds(282, 163, 50, 50);
		teclaA.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("A");
				}else{
					numDisplay.setText(numDisplay.getText().concat("A"));
				}
			}
		});
		
		Button teclaB = new Button(shell, SWT.NONE);
		teclaB.setText("B");
		teclaB.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaB.setEnabled(false);
		teclaB.setBounds(282, 219, 50, 50);
		teclaB.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("B");
				}else{
					numDisplay.setText(numDisplay.getText().concat("B"));
				}
			}
		});
		
		Button teclaC = new Button(shell, SWT.NONE);
		teclaC.setText("C");
		teclaC.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaC.setEnabled(false);
		teclaC.setBounds(282, 275, 50, 50);
		teclaC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("C");
				}else{
					numDisplay.setText(numDisplay.getText().concat("C"));
				}
			}
		});
		
		Button teclaD = new Button(shell, SWT.NONE);
		teclaD.setText("D");
		teclaD.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaD.setEnabled(false);
		teclaD.setBounds(282, 331, 50, 50);
		teclaD.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("D");
				}else{
					numDisplay.setText(numDisplay.getText().concat("D"));
				}
			}
		});
		
		Button teclaE = new Button(shell, SWT.NONE);
		teclaE.setText("E");
		teclaE.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaE.setEnabled(false);
		teclaE.setBounds(282, 387, 50, 50);
		teclaE.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("E");
				}else{
					numDisplay.setText(numDisplay.getText().concat("E"));
				}
			}
		});
		
		Button teclaF = new Button(shell, SWT.NONE);		
		teclaF.setText("F");
		teclaF.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaF.setEnabled(false);
		teclaF.setBounds(282, 443, 50, 50);
		teclaF.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("F");
				}else{
					numDisplay.setText(numDisplay.getText().concat("F"));
				}
			}
		});
		
		Button tecla8 = new Button(shell, SWT.NONE);
		tecla8.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla8.setBounds(140, 275, 50, 50);
		tecla8.setText("8");
		tecla8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("8");
				}else{
					numDisplay.setText(numDisplay.getText().concat("8"));
				}
			}
		});

		
		Button tecla7 = new Button(shell, SWT.NONE);
		tecla7.setText("7");
		tecla7.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla7.setBounds(84, 275, 50, 50);
		tecla7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("7");
				}else{
					numDisplay.setText(numDisplay.getText().concat("7"));
				}
			}
		});
		
		Button tecla9 = new Button(shell, SWT.NONE);
		tecla9.setText("9");
		tecla9.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla9.setBounds(196, 275, 50, 50);
		tecla9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("9");
				}else{
					numDisplay.setText(numDisplay.getText().concat("9"));
				}
			}
		});
		
		Button tecla4 = new Button(shell, SWT.NONE);
		tecla4.setText("4");
		tecla4.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla4.setBounds(84, 331, 50, 50);
		tecla4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("4");
				}else{
					numDisplay.setText(numDisplay.getText().concat("4"));
				}
			}
		});
		
		Button tecla5 = new Button(shell, SWT.NONE);
		tecla5.setText("5");
		tecla5.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla5.setBounds(140, 331, 50, 50);
		tecla5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("5");
				}else{
					numDisplay.setText(numDisplay.getText().concat("5"));
				}
			}
		});
		
		Button tecla6 = new Button(shell, SWT.NONE);
		tecla6.setText("6");
		tecla6.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla6.setBounds(196, 331, 50, 50);
		tecla6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("6");
				}else{
					numDisplay.setText(numDisplay.getText().concat("6"));
				}
			}
		});
		
		Button tecla1 = new Button(shell, SWT.NONE);
		tecla1.setText("1");
		tecla1.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla1.setBounds(84, 387, 50, 50);
		tecla1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("1");
				}else{
					numDisplay.setText(numDisplay.getText().concat("1"));
				}
			}
		});
		
		Button tecla2 = new Button(shell, SWT.NONE);
		tecla2.setText("2");
		tecla2.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla2.setBounds(140, 387, 50, 50);
		tecla2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("2");
				}else{
					numDisplay.setText(numDisplay.getText().concat("2"));
				}
			}
		});
		
		Button tecla3 = new Button(shell, SWT.NONE);
		tecla3.setText("3");
		tecla3.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla3.setBounds(196, 387, 50, 50);
		tecla3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("3");
				}else{
					numDisplay.setText(numDisplay.getText().concat("3"));
				}
			}
		});
		
		Button tecla0 = new Button(shell, SWT.NONE);
		tecla0.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		tecla0.setBounds(84, 443, 162, 50);
		tecla0.setText("0");
		tecla0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion=='S'||ultimaAccion=='R'||ultimaAccion=='M'||ultimaAccion=='D'){
					numDisplay.setText("0");
					if(ultimaAccion=='S') ultimaAccion='s';
					if(ultimaAccion=='R') ultimaAccion='r';
					if(ultimaAccion=='M') ultimaAccion='m';
					if(ultimaAccion=='D') ultimaAccion='d';
				}
				if(numDisplay.getText().equals("0")){
					numDisplay.setText("0");
				}else{
					numDisplay.setText(numDisplay.getText().concat("0"));
				}
			}
		});
		
		Button teclaBorrar = new Button(shell, SWT.NONE);
		teclaBorrar.setText("CE");		
		teclaBorrar.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaBorrar.setBounds(84, 219, 106, 50);
		teclaBorrar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numDisplay.setText("0");
			}
		});
		
		Button teclaRetro = new Button(shell, SWT.NONE);		
		teclaRetro.setImage(SWTResourceManager.getImage("693774.png"));
		teclaRetro.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaRetro.setBounds(196, 219, 50, 50);
		teclaRetro.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e){			
				if(numDisplay.getText().length()>0){
					numDisplay.setText(numDisplay.getText().substring(0,numDisplay.getText().length()-1));
					if(numDisplay.getText()=="") numDisplay.setText("0");
				}
			}
		});
		
		Button teclaMas = new Button(shell, SWT.NONE);
		teclaMas.setText("+");
		teclaMas.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaMas.setBounds(10, 387, 50, 50);
		teclaMas.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(numDisplay.getText()!=""){
					ultimaAccion = 'S';
					if(baseActual==10)
						try{
							memoria = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==2)
						try{
							memoria = new Binario(Long.parseLong(numDisplay.getText())).binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==8)
						try{
							memoria = new Octal(numDisplay.getText()).octBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==16)
						try{
							memoria = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}				
				}else{
					numDisplay.setText("0");
					memoria = new Decimal(0);
					baseActual = 10;
				}
			}
		});
		
		Button teclaMenos = new Button(shell, SWT.NONE);
		teclaMenos.setText("-");
		teclaMenos.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaMenos.setBounds(10, 331, 50, 50);
		teclaMenos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(numDisplay.getText()!=""){
					ultimaAccion = 'R';
					if(baseActual==10)
						try{
							memoria = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==2)
						try{
							memoria = new Binario(Long.parseLong(numDisplay.getText())).binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==8)
						try{
							memoria = new Octal(numDisplay.getText()).octBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==16)
						try{
							memoria = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
				}else{
					numDisplay.setText("0");
					memoria = new Decimal(0);
					baseActual = 10;
				}
			}
		});
		
		Button teclaPor = new Button(shell, SWT.NONE);
		teclaPor.setText("\u00D7");
		teclaPor.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaPor.setBounds(10, 275, 50, 50);
		teclaPor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(numDisplay.getText()!=""){
					ultimaAccion = 'M';	
					if(baseActual==10)
						try{
							memoria = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==2)
						try{
							memoria = new Binario(Long.parseLong(numDisplay.getText())).binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==8)
						try{
							memoria = new Octal(numDisplay.getText()).octBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==16)
						try{
							memoria = new Hexadecimal(numDisplay.getText()).hexBin().binDec();	
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
				}else{
					numDisplay.setText("0");
					memoria = new Decimal(0);
					baseActual = 10;
				}
			}
		});
		
		Button teclaDiv = new Button(shell, SWT.NONE);
		teclaDiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(numDisplay.getText()!=""){
					ultimaAccion = 'D';	
					if(baseActual==10)
						try{
							memoria = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==2)
						try{
							memoria = new Binario(Long.parseLong(numDisplay.getText())).binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==8)
						try{
							memoria = new Octal(numDisplay.getText()).octBin().binDec();
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
					else if(baseActual==16)
						try{
							memoria = new Hexadecimal(numDisplay.getText()).hexBin().binDec();	
						}catch(NumberFormatException nfe){
							memoria = new Decimal(0);
							numDisplay.setText("0");
							baseActual = 10;
							ultimaAccion = ' ';
						}
				}else{
					numDisplay.setText("0");
					memoria = new Decimal(0);
					baseActual = 10;
				}
			}
		});
		teclaDiv.setText("\u00F7");
		teclaDiv.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaDiv.setBounds(10, 219, 50, 50);
		
		Button teclaOp = new Button(shell, SWT.NONE);
		teclaOp.setText("=");
		teclaOp.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		teclaOp.setBounds(10, 443, 50, 50);
		teclaOp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ultimaAccion!=' '){					
					if(memoria==null)
						memoria = new Decimal(0);
					
					if(numDisplay.getText()=="")
						numDisplay.setText("0");
					
					if(ultimaAccion=='S'||ultimaAccion=='s'){
						if(numDisplay.getText()=="") numDisplay.setText("0");
						if(baseActual==10){
							int suma;
							try{
								suma = memoria.getValor()+Integer.parseInt(numDisplay.getText());
							}catch(NumberFormatException nfe){
								suma = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							if(suma>=0)
								numDisplay.setText(Integer.toString(suma));
							else
								numDisplay.setText("0");
						}else if(baseActual==2){
							Decimal sumando = new Binario(Long.parseLong(numDisplay.getText())).binDec();
							long suma;
							try{
								suma = memoria.getValor()+sumando.getValor();
							}catch(NumberFormatException nfe){
								suma = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(sumando.numValido() && suma>=0)
								numDisplay.setText(Long.toString(suma));
							else
								numDisplay.setText("0");
						}else if(baseActual==8){
							Decimal sumando = new Octal(numDisplay.getText()).octBin().binDec();
							int suma;
							try{
								suma = memoria.getValor()+sumando.getValor();
							}catch(NumberFormatException nfe){
								suma = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(sumando.numValido() && suma>=0)
								numDisplay.setText(Integer.toString(suma));
							else
								numDisplay.setText("0");
						}else if(baseActual==16){
							Decimal sumando = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
							int suma;
							try{
								suma = memoria.getValor()+sumando.getValor();
							}catch(NumberFormatException nfe){
								suma = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(sumando.numValido() && suma>=0)
								numDisplay.setText(Integer.toString(suma));
							else
								numDisplay.setText("0");
						}
					}else if(ultimaAccion=='R'||ultimaAccion=='r'){
						if(numDisplay.getText()=="") numDisplay.setText("0");
						if(baseActual==10){
							int resta;
							try{
								resta = memoria.getValor()-Integer.parseInt(numDisplay.getText());
							}catch(NumberFormatException nfe){
								resta = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							if(resta>=0)
								numDisplay.setText(Integer.toString(resta));
							else
								numDisplay.setText("0");
						}else if(baseActual==2){
							Decimal restando = new Binario(Long.parseLong(numDisplay.getText())).binDec();
							long resta;
							try{
								resta = memoria.getValor()-restando.getValor();
							}catch(NumberFormatException nfe){
								resta = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(restando.numValido() && resta>=0)
								numDisplay.setText(Long.toString(resta));
							else
								numDisplay.setText("0");
						}else if(baseActual==8){
							Decimal restando = new Octal(numDisplay.getText()).octBin().binDec();
							int resta;
							try{
								resta = memoria.getValor()-restando.getValor();
							}catch(NumberFormatException nfe){
								resta = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(restando.numValido() && resta>=0)
								numDisplay.setText(Integer.toString(resta));
							else
								numDisplay.setText("0");
						}else if(baseActual==16){
							Decimal restando = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
							int resta;
							try{
								resta = memoria.getValor()-restando.getValor();
							}catch(NumberFormatException nfe){
								resta = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(restando.numValido() && resta>=0)
								numDisplay.setText(Integer.toString(resta));
							else
								numDisplay.setText("0");
						}
					}else if(ultimaAccion=='M'||ultimaAccion=='m'){
						if(numDisplay.getText()=="") numDisplay.setText("0");
						if(baseActual==10){						
							int producto;
							try{
								producto = memoria.getValor()*Integer.parseInt(numDisplay.getText());
							}catch(NumberFormatException nfe){
								producto = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							numDisplay.setText(Integer.toString(producto));
						}else if(baseActual==2){
							Decimal multiplicando = new Binario(Long.parseLong(numDisplay.getText())).binDec();
							long producto;
							try{
								producto = memoria.getValor()*multiplicando.getValor();
							}catch(NumberFormatException nfe){
								producto = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(producto>=0){							
								numDisplay.setText(Long.toString(producto));
							}else{
								numDisplay.setText("0");
							}
						}else if(baseActual==8){
							Decimal multiplicando = new Octal(numDisplay.getText()).octBin().binDec();
							int producto;
							try{
								producto = memoria.getValor()*multiplicando.getValor();
							}catch(NumberFormatException nfe){
								producto = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(producto>=0){							
								numDisplay.setText(Integer.toString(producto));
							}else{
								numDisplay.setText("0");
							}
						}else if(baseActual==16){
							Decimal multiplicando = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
							int producto;
							try{
								producto = memoria.getValor()*multiplicando.getValor();
							}catch(NumberFormatException nfe){
								producto = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(producto>=0){							
								numDisplay.setText(Integer.toString(producto));
							}else{
								numDisplay.setText("0");
							}
						}
					}else if(ultimaAccion=='D'||ultimaAccion=='d'){
						if(numDisplay.getText()=="") numDisplay.setText("0");
						if(baseActual==10){						
							int cociente;
							try{
								cociente = memoria.getValor()/Integer.parseInt(numDisplay.getText());
							}catch(ArithmeticException ae){
								cociente = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								baseActual = 10;
								ultimaAccion = ' ';
							}catch(NumberFormatException nfe){
								cociente = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							numDisplay.setText(Integer.toString(cociente));
						}else if(baseActual==2){
							Decimal dividendo = new Binario(Long.parseLong(numDisplay.getText())).binDec();
							long cociente;
							try{
								cociente = memoria.getValor()/dividendo.getValor();
							}catch(ArithmeticException ae){
								cociente = 0;
								numDisplay.setText("0");
								baseActual = 10;
								ultimaAccion = ' ';
							}catch(NumberFormatException nfe){
								cociente = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(cociente>=0){							
								try{
									numDisplay.setText(Long.toString(cociente));
								}catch(ArithmeticException ae){
									cociente = 0;
									numDisplay.setText("0");
									baseActual = 10;
									ultimaAccion = ' ';
								}catch(NumberFormatException nfe){
									cociente = 0;
									memoria = new Decimal(0);
									numDisplay.setText("0");
									ultimaAccion = ' ';
								}
							}else{
								numDisplay.setText("0");
							}
						}else if(baseActual==8){
							Decimal dividendo = new Octal(numDisplay.getText()).octBin().binDec();
							int cociente;
							try{
								cociente = memoria.getValor()/dividendo.getValor();
							}catch(ArithmeticException ae){
								cociente = 0;
								numDisplay.setText("0");
								baseActual = 10;
								ultimaAccion = ' ';
							}catch(NumberFormatException nfe){
								cociente = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(cociente>=0){							
								numDisplay.setText(Integer.toString(cociente));
							}else{
								numDisplay.setText("0");
							}
						}else if(baseActual==16){
							Decimal dividendo = new Hexadecimal(numDisplay.getText()).hexBin().binDec();
							int cociente;
							try{
								cociente = memoria.getValor()/dividendo.getValor();
							}catch(ArithmeticException ae){
								cociente = 0;
								numDisplay.setText("0");
								baseActual = 10;
								ultimaAccion = ' ';
							}catch(NumberFormatException nfe){
								cociente = 0;
								memoria = new Decimal(0);
								numDisplay.setText("0");
								ultimaAccion = ' ';
							}
							baseActual = 10;
							if(cociente>=0){							
								numDisplay.setText(Integer.toString(cociente));
							}else{
								numDisplay.setText("0");
							}
						}
					}
					
					memoria = null;
					ultimaAccion = ' ';
					baseDisplay.setText("DEC");
					baseActual = 10;
					teclaA.setEnabled(false);
					teclaB.setEnabled(false);
					teclaC.setEnabled(false);
					teclaD.setEnabled(false);
					teclaE.setEnabled(false);
					teclaF.setEnabled(false);
					tecla2.setEnabled(true);
					tecla3.setEnabled(true);
					tecla4.setEnabled(true);
					tecla5.setEnabled(true);
					tecla6.setEnabled(true);
					tecla7.setEnabled(true);
					tecla8.setEnabled(true);
					tecla9.setEnabled(true);				
				}
			}
		});
		
		Button btnBinario = new Button(shell, SWT.NONE);
		btnBinario.setBounds(10, 138, 75, 25);
		btnBinario.setText("Binario");	
		
		btnBinario.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				baseDisplay.setText("BIN");
				tecla2.setEnabled(false);
				tecla3.setEnabled(false);
				tecla4.setEnabled(false);
				tecla5.setEnabled(false);
				tecla6.setEnabled(false);
				tecla7.setEnabled(false);
				tecla8.setEnabled(false);
				tecla9.setEnabled(false);
				teclaA.setEnabled(false);
				teclaB.setEnabled(false);
				teclaC.setEnabled(false);
				teclaD.setEnabled(false);
				teclaE.setEnabled(false);
				teclaF.setEnabled(false);
				if(baseActual==10){
					if(numDisplay.getText()!=""){
						Decimal d;
						try{
							d = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							d = new Decimal(0);
						}
						Binario b = d.decBin();
						if(b.numValido())
							numDisplay.setText(Long.toString(b.getValor()));
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==8){
					if(numDisplay.getText()!=""){
						Octal o = new Octal(numDisplay.getText());
						Binario b = o.octBin();
						if(b.numValido())
							numDisplay.setText(Long.toString(b.getValor()));
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}					
				}else if(baseActual==16){
					if(numDisplay.getText()!=""){
						Hexadecimal h = new Hexadecimal(numDisplay.getText());
						Binario b = h.hexBin();
						if(b.numValido())
							numDisplay.setText(Long.toString(b.getValor()));
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}						
				}
				baseActual=2;
			}
		});
		
		Button btnDecimal = new Button(shell, SWT.NONE);
		btnDecimal.setBounds(10, 76, 75, 25);
		btnDecimal.setText("Decimal");
		btnDecimal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				baseDisplay.setText("DEC");
				teclaA.setEnabled(false);
				teclaB.setEnabled(false);
				teclaC.setEnabled(false);
				teclaD.setEnabled(false);
				teclaE.setEnabled(false);
				teclaF.setEnabled(false);
				tecla2.setEnabled(true);
				tecla3.setEnabled(true);
				tecla4.setEnabled(true);
				tecla5.setEnabled(true);
				tecla6.setEnabled(true);
				tecla7.setEnabled(true);
				tecla8.setEnabled(true);
				tecla9.setEnabled(true);
				if(baseActual==2){
					if(numDisplay.getText()!=""){
						Binario b;
						try{
							b = new Binario(Long.parseLong(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							b = new Binario(0);
						}
						Decimal d = b.binDec();
						if(d.numValido())
							numDisplay.setText(Integer.toString(d.getValor()));
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}	
				}else if(baseActual==8){
					if(numDisplay.getText()!=""){
						Octal o = new Octal(numDisplay.getText());
						Binario b = o.octBin();
						Decimal d = b.binDec();
						if(d.numValido())
							numDisplay.setText(d.getValor()+"");
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==16){
					if(numDisplay.getText()!=""){
						Hexadecimal h = new Hexadecimal(numDisplay.getText());
						Binario b = h.hexBin();
						Decimal d = b.binDec();
						if(d.numValido())
							numDisplay.setText(Integer.toString(d.getValor()));
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}
				baseActual=10;
			}
		});
		
		Button btnHex = new Button(shell, SWT.NONE);
		btnHex.setBounds(10, 45, 75, 25);
		btnHex.setText("Hexadecimal");
		btnHex.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				baseDisplay.setText("HEX");
				tecla2.setEnabled(true);
				tecla3.setEnabled(true);
				tecla4.setEnabled(true);
				tecla5.setEnabled(true);
				tecla6.setEnabled(true);
				tecla7.setEnabled(true);
				tecla8.setEnabled(true);
				tecla9.setEnabled(true);
				teclaA.setEnabled(true);
				teclaB.setEnabled(true);
				teclaC.setEnabled(true);
				teclaD.setEnabled(true);
				teclaE.setEnabled(true);
				teclaF.setEnabled(true);
				if(baseActual==10){
					if(numDisplay.getText()!=""){
						Decimal d;
						try{
							d = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							d = new Decimal(0);
						}
						Binario b = d.decBin();
						Hexadecimal h = b.binHex();
						if(h.numValido())
							numDisplay.setText(h.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==2){
					if(numDisplay.getText()!=""){
						Binario b;
						try{
							b = new Binario(Long.parseLong(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							b = new Binario(0);
						}
						Hexadecimal h = b.binHex();
						if(h.numValido())
							numDisplay.setText(h.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==8){
					if(numDisplay.getText()!=""){
						Octal o = new Octal(numDisplay.getText());
						Binario b = o.octBin();
						Hexadecimal h = b.binHex();
						if(h.numValido())
							numDisplay.setText(h.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}
				baseActual = 16;
			}
		});
		
		Button btnOctal = new Button(shell, SWT.NONE);
		btnOctal.setBounds(10, 107, 75, 25);
		btnOctal.setText("Octal");	
		btnOctal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				baseDisplay.setText("OCT");
				teclaA.setEnabled(false);
				teclaB.setEnabled(false);
				teclaC.setEnabled(false);
				teclaD.setEnabled(false);
				teclaE.setEnabled(false);
				teclaF.setEnabled(false);
				tecla2.setEnabled(true);
				tecla3.setEnabled(true);
				tecla4.setEnabled(true);
				tecla5.setEnabled(true);
				tecla6.setEnabled(true);
				tecla7.setEnabled(true);
				tecla8.setEnabled(false);
				tecla9.setEnabled(false);
				if(baseActual==10){
					if(numDisplay.getText()!=""){
						Decimal d;
						try{
							d = new Decimal(Integer.parseInt(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							d = new Decimal(0);
						}
						Binario b = d.decBin();
						Octal o = b.binOct();
						if(o.numValido())
							numDisplay.setText(o.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==2){
					if(numDisplay.getText()!=""){
						Binario b;
						try{
							b = new Binario(Long.parseLong(numDisplay.getText()));
						}catch(NumberFormatException nfe){
							b = new Binario(0);
						}
						Octal o = b.binOct();
						if(o.numValido())
							numDisplay.setText(o.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}else if(baseActual==16){
					if(numDisplay.getText()!=""){
						Hexadecimal h = new Hexadecimal(numDisplay.getText());
						Binario b = h.hexBin();
						Octal o = b.binOct();
						if(o.numValido())
							numDisplay.setText(o.getValor());
						else
							numDisplay.setText("0");
					}else{
						numDisplay.setText("0");
					}
				}
				baseActual = 8;
			}
		});
		
		luz = true;
		Button btnTema = new Button(shell, SWT.NONE);
		btnTema.setBounds(10, 10, 25, 25);
		btnTema.setImage(SWTResourceManager.getImage("moon.png"));
		btnTema.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e){
				if(luz){
					btnTema.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					btnTema.setImage(SWTResourceManager.getImage("sun.png"));
					shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					baseDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					baseDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					versionDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					versionDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					btnHex.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					btnHex.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					btnOctal.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					btnOctal.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					btnDecimal.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					btnDecimal.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					btnBinario.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					btnBinario.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaMas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaMas.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaMenos.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaMenos.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaPor.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaPor.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaDiv.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaDiv.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaOp.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaOp.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla3.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla4.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla5.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla6.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla7.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla8.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla9.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla9.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					tecla0.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					tecla0.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaA.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaA.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaB.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaB.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaC.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaC.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaD.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaD.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaE.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaE.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaF.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaF.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaBorrar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaBorrar.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaRetro.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					teclaRetro.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					teclaRetro.setImage(SWTResourceManager.getImage("693774inv.png"));
					numDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
					numDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
					luz = false;
				}else{
					btnTema.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					btnTema.setImage(SWTResourceManager.getImage("moon.png"));
					shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
					baseDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
					baseDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					versionDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
					versionDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					btnHex.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					btnHex.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					btnOctal.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					btnOctal.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					btnDecimal.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					btnDecimal.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					btnBinario.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					btnBinario.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaMas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaMas.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaMenos.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaMenos.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaPor.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaPor.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaDiv.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaDiv.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaOp.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaOp.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));		
					tecla1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla3.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla4.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla5.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla6.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla7.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla8.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla9.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla9.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					tecla0.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					tecla0.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaA.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaA.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaB.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaB.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaC.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaC.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaD.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaD.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaE.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaE.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaF.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaF.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaBorrar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaBorrar.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaRetro.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					teclaRetro.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					teclaRetro.setImage(SWTResourceManager.getImage("693774.png"));
					numDisplay.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
					numDisplay.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
					luz = true;
				}
			}
		});
	}
}