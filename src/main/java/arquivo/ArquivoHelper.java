/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.arquivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author júlia
 */
public class ArquivoHelper {
    
    private Map<String, Object> parse(String  in){
        Map<String, Object> retorno = new HashMap<>(), aux;
        int command = Integer.parseInt(in.charAt(0)+"");
        String[] val;
        switch(command){
            case 0:
                retorno.put("comando", "Posicao");
                aux = new HashMap<>();
                val = in.substring(2).split(",");
                aux.put("velocidade", Integer.parseInt(val[0]));
                aux.put("garra", Integer.parseInt(val[1]));
                aux.put("pulso_sobe", Integer.parseInt(val[2]));
                aux.put("pulso_giro", Integer.parseInt(val[3]));
                aux.put("cotovelo", Integer.parseInt(val[4]));
                aux.put("ombro", Integer.parseInt(val[5]));
                aux.put("cintura", Integer.parseInt(val[6]));
                retorno.put("posicao", aux);
            break;
            case 1:
                retorno.put("comando", "Sequencia");
                List<Map<String, Object>> sequencia = new ArrayList<>();
                String[] pos = in.substring(2).split("/");
                for(int i = 0; i < pos.length; i++){
                    val = pos[i].split(",");
                    aux = new HashMap<>();
                    aux.put("velocidade", Integer.parseInt(val[0]));
                    aux.put("garra", Integer.parseInt(val[1]));
                    aux.put("pulso_sobe", Integer.parseInt(val[2]));
                    aux.put("pulso_giro", Integer.parseInt(val[3]));
                    aux.put("cotovelo", Integer.parseInt(val[4]));
                    aux.put("ombro", Integer.parseInt(val[5]));
                    aux.put("cintura", Integer.parseInt(val[6]));
                    sequencia.add(aux);
                }
                retorno.put("sequencia", sequencia);
            break;
            case 2:
                retorno.put("comando", "Iniciar");
            break;
            case 3:
                retorno.put("comando", "Parar");
            break;
        }
        
        
        return retorno;
    }
}
