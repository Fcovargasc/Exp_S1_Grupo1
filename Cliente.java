
package exp_s1_grupo1;


public class Cliente {
    private String rut,nombre,apellidoPaterno,apellidoMaterno,domicilio,comuna;
    private int telefono,cuenta,saldo,deposito,giro;
    
  //constructor sin atributos  
public Cliente(){} 

//cosntructor con atributos
public Cliente(String rut,String nombre , String apellidoPaterno,String apellidoMaterno,String domicilio,
               String comuna,int telefono,int cuenta,int saldo,int deposito , int giro){

               this.rut=rut;
               this.nombre=nombre;
               this.apellidoPaterno=apellidoPaterno;
               this.apellidoMaterno=apellidoMaterno;
               this.domicilio=domicilio;
               this.comuna=comuna;
               this.telefono=telefono;
               this.cuenta=cuenta;
               this.saldo=saldo;
               this.deposito=deposito;
               this.giro=giro;
                       }
//creando setters and getters
    public String getRut(){
        return rut;
}
    public void setRut(String rut){
        this.rut=rut;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
        
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio (String domicilio){
        this.nombre=nombre;
        
    }
    public String getComuna(){
        return comuna;
    }
    public void setComuna(String comuna){
        this.comuna=comuna;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getCuenta(){
        return cuenta;
    }
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getDeposito(){
        return deposito;
    }
    public void setDeposito(int deposito){
        this.deposito=deposito;
    }
    public int getGiro(){
        return giro;
    }
    public void setGiro(int giro){
        this.giro=giro;
    }
    
    //creacion de metodos
    
    public void depositar(){
        System.out.println("¡Deposito realizado de manera exitosa! ");
        

    }
    public void girar (){
        System.out.println("¡Giro Realizado de manera exitosa!");
        
    }
    public void consultaSaldo(){
        System.out.println("Saldo Actual $ "+getSaldo());
    }


}
