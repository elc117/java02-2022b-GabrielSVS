class Shrek {
	    private int cebola;
	    private float camada;
	    public Shrek() {
	        cebola = 1;
	        camada = 2.3f;
	        //Scanner sc = new Scanner(System.in);
	    }
	    public int get_cebola() {
	        return cebola;
	    }
	    public float get_camada() {
	        return camada;
	    }
	    public void set_cebola() {
	        cebola = 5;
	    }
	    public void set_camada() {
	        camada = 4f;
	    }
	    public float soma() {
	        return cebola+camada;
	    }
	}
