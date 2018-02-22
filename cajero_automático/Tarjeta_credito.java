/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automático;

/**
 *
 * @author infor05
 */
public class Tarjeta_credito extends Tarjeta {
    private int saldo_disponible;
    private int credito_disponible;
    
    public Tarjeta_credito(){
        
    }

    public Tarjeta_credito(int saldo_disponible, int credito_disponible) {
        super();
        this.saldo_disponible = saldo_disponible;
        this.credito_disponible = credito_disponible;
    }
    
    public Tarjeta_credito(Tarjeta_credito copia){
        copia.saldo_disponible = saldo_disponible;
        copia.credito_disponible = credito_disponible;
    }

    public int getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    public int getCredito_disponible() {
        return credito_disponible;
    }

    public void setCredito_disponible(int credito_disponible) {
        this.credito_disponible = credito_disponible;
    }
}
