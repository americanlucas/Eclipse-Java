package negocio;

public class Compra {
	
	//propriedades
	private String cartao = "";
	private int qtd;
	private String data = "";
	private Produto objProduto = null;
	
	//construtores
	public Compra() {
		super();
	}
	
	public Compra(String cartao, int qtd, String data, Produto objProduto) {
		super();
		this.cartao = cartao;
		this.qtd = qtd;
		this.data = data;
		this.objProduto = objProduto;
	}
	
	
	//metodos
	
	
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Produto getObjProduto() {
		return objProduto;
	}
	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}
	
	
}
