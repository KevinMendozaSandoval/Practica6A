import java.awt.Color;

public class MastermindGrafico
{
    private Circle circulo;
    private Canvas graficoMastermind;
    
    /**
     * Crea un objeto MastermindView para procesar la parte
     * gráfica del juego de Mastermind
     */
    public MastermindGrafico()
    {
        graficoMastermind = new Canvas("Mastermind", 360, 620);
    }    
//Dibuja los los circulos donde estaran los colores
    public void dibujarCirculo(int pos, int intento, Color color){
        circulo = new Circle(20+(pos*40),580-(40*(intento-1)),30,color, graficoMastermind);
    }
 //Dibuja los los circulos donde estaran las verificaciones(pd: cambiar color para que se vean los aciertos)
    public void dibujarCirculoPequeño(int pos, int intento, Color color){
        circulo = new Circle(257+(pos*17),590-(40*(intento-1)),7,color, graficoMastermind);
    }
    
 //Dibuja las casillas
    public void dibujarCasillas(int tamaño)
    {
        for(int i=1; i<=15;i++){
            for(int j=0; j<tamaño;j++){
                dibujarCirculo(j,i,Color.BLACK);
                dibujarCirculoPequeño(j,i,Color.BLACK);
            }
        }
    }  
//Limpia pantalla aun no se si funciona
    public void limpiarPantalla(){
        graficoMastermind.erase();
    }

}