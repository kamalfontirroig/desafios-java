package main;
import biblioteca.Logger;
import easyprinter.So;
import biblioteca.Bibliotecario;
import menu.Menu;

public class Main {

  public static void main(String[] args) {
    
//    
//    Bibliotecario seņorsmith = Bibliotecario.invocarBibliotecario();
//    seņorsmith.obtenerArticulos();
//    ;
//    seņorsmith.buscarArticulo("a");
//    seņorsmith.actualizarArticulos();
    Logger newUser = new Logger();
    while (!newUser.permitirAcceso) {
    if (newUser.LogIn()) {
     So.pln();
      So.pln("Ingreso exitoso. Bienvenido, " + newUser.getUser() +"!");
      So.pln();
      Menu menu = new Menu();
      menu.printMenu();
    

    } else So.pln("Usuario o clave incorrectos\n");
  } 
  }

}
