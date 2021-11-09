/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TelevisiJadul extends Elektronik{
    private final String modelInput;

    public TelevisiJadul(String modelInput, int voltase) {
        super(voltase);
        this.modelInput = modelInput;
    }
    public String getModelInput() {
        return modelInput;
    }
}
