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
    public StringB (int c, int v, String [][] m, int l){
        env = ""+c;
        if(m.length > 1) env += "/" + l;
        for(int i = 0; i < m.length; i++){
            if(!m[i][0].equals("null")){
                env = env+"/"+v+","+m[i][0];
                for(int j = 1; j < m[0].length;j++){
                    env = env+","+m[i][j];
                }        
            }
        }
    }
    
    public StringB (){
        
    }
    public String getString(){
        return env;
    }
    
}
