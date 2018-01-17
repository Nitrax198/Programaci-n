/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidad;

/**
 *
 * @author daw
 */
public class Calculadora {

    private int op1;
    private int op2;
    private int res;

    public int getRes() {
        return res;
    }

    public void setRes(int Res) {
        this.res = Res;
    }
    

    public Calculadora(int op1, int op2, int res) {
        this.op1 = op1;
        this.op2 = op2;
        this.res = res;
    }
    
    

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
    
    public int sumar(){
        return this.op1+this.op2;
    }
    public int restar(){
        return this.op1-this.op2;
    }
    public int restarMayor(){
        if (this.op1>this.op2) {
             this.res = this.op1-this.op2;
        }
        else{
            this.res = this.op2-this.op1;
        }
        return this.res;
    }
    
}
