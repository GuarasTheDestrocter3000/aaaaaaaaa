
package padaria.pkgdo.guaras;


public class Padaria {

   
    public static void main(String[] args) {
        Frios f1 = new Frios();
        f1.setNome("Salamera");
        f1.setQuantidade(10);
        f1.setValor(12.50);
        
        Paozinho p1 = new Paozinho();
        p1.setNome("Broa");
        p1.setQuantidade(100);
        p1.setValor(5.99);
        
        Doces d1 = new Doces();
        d1.setNome("Doce");
        d1.setQuantidade(100);
        d1.setValor(200.00);
        
        
        Pedido p = new Pedido();
        p.setP1(f1);
        p.setP2(p1);
        p.setP3(d1);
        
        
    }
    
}
