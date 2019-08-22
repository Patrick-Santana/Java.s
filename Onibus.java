/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patric
 */
public class Onibus {
    int preco;
    String motor;
    String suspencao;
    String TipoDeOnibus;
    float Qpneus;
    int TemperaturaDeArCondicionado;
    Empresa empresa;
    int cnpj;
    float patrimonio;
    String TipoDeEmpresa;
    String NomeDaEmpresa;
    
    
    public static void main(String[] args) {
        
        Empresa e1 = new Empresa();
        
        e1.cnpj =(int) 217487245;
        e1.patrimonio =(float) 1075000;
        e1.TipoDeEmpresa ="microempresa";
        e1.NomeDaEmpresa ="Organizacao tabajara";
        
        Onibus o2 = new Onibus();
        
        o2.Qpneus = (int) 6;
        o2.suspencao = "Hidraulica";
        o2.motor = "Scania";
        o2.TemperaturaDeArCondicionado = (int) 16;
        o2.preco = (int) 728000; //preço do onibus
        o2.TipoDeOnibus = "Leito";
        
        System.out.println("nome da empresa: " +  e1.NomeDaEmpresa);
        System.out.println("cnpj da Empresa: " +  e1.cnpj);
        System.out.println("patriomonio da empresa: " +  e1.patrimonio);
        System.out.println("cnpj da Empresa: " +  e1.TipoDeEmpresa);
        
        System.out.println("nome da empresa: " +  o2.Qpneus);
        System.out.println("cnpj da Empresa: " +  o2.suspencao);
        System.out.println("patriomonio da empresa: " +  o2.motor);
        System.out.println("cnpj da Empresa: " +  o2.TemperaturaDeArCondicionado);
        
    }
}
