package unidade_1;
import java.text.NumberFormat;

//Declara��o da Classe
class Guitarra {
	
	// Atributos (Privados)
	private String numeroSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	// M�todo Constructor
	public Guitarra(String numeroSerie, String fabricante, 
			String modelo, String tipo, String madeira, double preco) {
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.madeira = madeira;
		this.preco = preco;
	}
	
	// Met�dos Getters e Setters
	// Gerar autom�ticamente utilizando Eclipse:
	// Bot�o direito -> Source -> Generate Getters and Setters
	
	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMadeira() {
		return madeira;
	}

	public void setMadeira(String madeira) {
		this.madeira = madeira;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimirFichaTecnica() {
		System.out.println("****** FICHA T�CNICA **********");
		System.out.println("N� S�rie..: " + this.getNumeroSerie());
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo....: " + this.getModelo());
		System.out.println("Tipo......: " + this.getTipo());
		System.out.println("Madeira...: " + this.getMadeira());
		//System.out.println("Pre�o R$..: " + this.getPreco());
		System.out.println("Pre�o.....: " + NumberFormat.getCurrencyInstance().format(this.getPreco()));
		System.out.println("******************************");
	}

	// M�todo Main
	public static void main(String[] args) {
		
		   // Criando o Objeto minhaGuitarra do tipo -> Guitarra
		   Guitarra minhaGuitarra = new Guitarra("93200", "Les Paul", "Standard Sunburst","El�trica","Mogno", 2237000.00);
		 
		   // Testando dados do Objeto + M�todos Gets
		   minhaGuitarra.imprimirFichaTecnica();
	}

}