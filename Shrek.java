class Shrek {
	    private int cebola;
	    private float camada;
	    public Shrek() {
	        cebola = 1;
	        camada = 2.3f;
	    }
	    public int getCebola() {
	        return cebola;
	    }
	    public float getCamada() {
	        return camada;
	    }
	    public void setCebola() {
	        this.cebola = 5;
	    }
	    public void setCamada() {
	        this.camada = 4f;
	    }
	    public float soma() {
	        return cebola+camada;
	    }
	}

/* 
A classe deve conter atributos de pelo menos 2 tipos diferentes (algumas possibilidades: String, int, double, boolean, etc.).
A classe deve conter um construtor (pode haver mais de um, com diferentes argumentos).
A classe deve conter métodos com prefixo get e set, respectivamente para obter e alterar cada atributo.
A classe deve conter um método que implemente alguma operação com um ou mais atributos (por exemplo, um teste de condição, um cálculo, uma operação com strings, etc.). 
*/
