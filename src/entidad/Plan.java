/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author JULIO
 */
public class Plan {
  private double GB;
  private int secondLine;
  private int messages;
  private double cost;
  private String operator;

    public Plan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getGB() {
        return GB;
    }

    public void setGB(float GB) {
        this.GB = GB;
    }

    public float getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(int secondLine) {
        this.secondLine = secondLine;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Plan(  double GB, int secondLine, int messages, double cost, String operator) {
        this.GB = GB;
        this.secondLine = secondLine;
        this.messages = messages;
        this.cost = cost;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "plan{" + "GB=" + GB + ", secondLine=" + secondLine + ", messages=" + messages + ", cost=" + cost + ", operator=" + operator + '}';
    }

}
