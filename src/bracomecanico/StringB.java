/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracomecanico;

/**
 *
 * @author Mateus
 */
public class StringB {
    private String env = "";
    public StringB (int c, int [][] m){
        env = ""+c;
        for(int i = 0; i < m.length; i++){
            env = env+"/"+m[i][0];
            for(int j = 1; j < 7;j++){
                env = env+","+m[i][j];
            }        
        }
    }
    public String getString(){
        return env;
    }
    
}
