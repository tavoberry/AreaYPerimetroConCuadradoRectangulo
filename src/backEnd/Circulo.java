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
public class Circulo extends FiguraGeometrica{
    
    private float radio;
    
    public Circulo(){
        super();
        radio=0;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //Redefinir el método calculaArea()
    /**
     * Calcula el área de un círculo
     */
    @Override
    public void calculaArea(){
        super.setArea (  (float) (Math.PI * Math.pow(radio, 2)));
    }
    
    /**
     * Calcula el perímetro de un circulo
     */
    @Override
    public void calculaPerimetro(){
        super.setPerimetro((float)Math.PI*(2*radio));
    }
}
