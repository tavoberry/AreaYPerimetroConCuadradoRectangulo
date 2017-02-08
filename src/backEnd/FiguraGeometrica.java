/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

/**
 *
 * @author gustavoreyeshdez
 */
public class FiguraGeometrica {
    //Atributos
    private String nombreFigura;
    private float base;
    private float altura;
    private float area;
    private float perimetro;
    
    //Constructor de la clase
    public FiguraGeometrica(){
        nombreFigura="";
        base=0;
        altura=0;
        area=0;
        perimetro=0;
    }

    /**
     * @return the nombreFigura
     */
    public String getNombreFigura() {
        return nombreFigura;
    }

    /**
     * @param nombreFigura the nombreFigura to set
     */
    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public float getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    /**
     * Este método calcula el área de una figura
     */
    public void calculaArea(){
        area = base * altura;
    }
    
    /**
     * Este método calcula el perímetro de una figura
     */
    public void calculaPerimetro(){
        perimetro = (2 * base) + (2 * altura);
    }
}
