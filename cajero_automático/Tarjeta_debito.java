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
public class Tarjeta_debito extends Tarjeta {
    private int saldo_disponible;
    
    public Tarjeta_debito(){
        
    }

    public Tarjeta_debito(int saldo_disponible) {
        super();
        this.saldo_disponible = saldo_disponible;
    }
    
    public Tarjeta_debito(Tarjeta_debito copia){
        copia.saldo_disponible = saldo_disponible;
    }

    public int getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }
}
