package associacao_de_classe;

public class ContaBancaria {
    private  String numConta;
    private double saldo;

    public ContaBancaria(String numConta) {
        this.numConta = numConta;
        this.saldo = 0;
        }
    
        public String getNumConta() {
            return numConta;
        }
        
        public void setNumConta(String numConta) {
            this.numConta = numConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }
