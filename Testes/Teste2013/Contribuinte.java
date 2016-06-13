public interface Contribuinte {
    
    @SuppressWarnings("serial")
    class ContribuinteJaExiste extends Exception {
        public ContribuinteJaExiste(String message) {
                super(message);
            }
    }

    public String getNIF();
    
}

