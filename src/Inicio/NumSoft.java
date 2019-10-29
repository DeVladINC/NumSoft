
package Inicio;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import consola.Menu;
import consola.MenuCallback;
import metodos.*;

/**
 *
 * @author Jheyson V. Aburto Loa
 */
public class NumSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitulo("Inicio | NumbSoft");

        menu.agregar("Biseccion", new MenuCallback() {
            public void ejecutar() {
                Biseccion metodo = new Biseccion();
                metodo.consola();
            }
        });

        menu.agregar("Falsa Posicion", new MenuCallback() {
            public void ejecutar() {
                FalsaPosicion metodo = new FalsaPosicion();
                metodo.consola();
            }
        });
        menu.agregar("Newton Raphson", new MenuCallback() {
            public void ejecutar() {
                NewtonRaphson metodo = new NewtonRaphson();
                metodo.consola();
            }
        });
        menu.agregar("Secante", new MenuCallback() {
            public void ejecutar() {
                Secante metodo = new Secante();
                metodo.consola();
            }
        });
        menu.agregar("Gauss", new MenuCallback() {
            public void ejecutar() {
                Gauss metodo = new Gauss();
                metodo.consola();
            }
        });
        menu.agregar("Gauss-Jordan", new MenuCallback() {
            public void ejecutar() {
                GaussJordan metodo = new GaussJordan();
                metodo.consola();
            }
        });
        menu.agregar("Gauss-Seidel", new MenuCallback() {
            public void ejecutar() {
                GaussSeidel metodo = new GaussSeidel();
                metodo.consola();
            }
        });
        menu.agregar("Gauss-Jacobi", new MenuCallback() {
            public void ejecutar() {
                GaussJacobi metodo = new GaussJacobi();
                metodo.consola();
            }
        });
        menu.agregar("Interpolacion de Lagrange", new MenuCallback() {
            public void ejecutar() {
                Lagrange metodo = new Lagrange();
                metodo.consola();
            }
        });
        menu.agregar("Interpolacion de Newton", new MenuCallback() {
            public void ejecutar() {
                Newton metodo = new Newton();
                metodo.consola();
            }
        });




        menu.mostrar();
    }
}
