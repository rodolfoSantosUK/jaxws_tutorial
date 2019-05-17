package main;

import ws.Demo;
import ws.DemoImplService;
import ws.DemoImplServiceLocator;
import ws.Produto;
import ws.ProdutoWS;
import ws.ProdutoWSImplService;
import ws.ProdutoWSImplServiceLocator;

public class Main {

    public static void main(String[] args) {

        try {
            DemoImplService demoImplService = new DemoImplServiceLocator();
            Demo demo  = demoImplService.getDemoImplPort();
            
            System.out.println(" demo.exibeHelloWorld() "  + demo.exibeHelloWorld() );
            System.out.println(" demo.exibeHelloWorld() "  + demo.exibeHi("Rodolfo") );
             
            ProdutoWSImplService produtoImplService  = new ProdutoWSImplServiceLocator();
            ProdutoWS produtoWS = produtoImplService.getProdutoWSImplPort();
            Produto produto = produtoWS.find();
            Produto [] listaProduto = produtoWS.findAll();
            
            System.out.println("Id: " + produto.getIdProduto());
            System.out.println("Nome: " + produto.getName());
            System.out.println("Preço: " + produto.getPrice());
            
            for(Produto p : listaProduto) {
                System.out.println("Id: " + p.getIdProduto());
                System.out.println("Name: " + p.getName());
                System.out.println("Preco " + p.getPrice());
                
                
            }
            
            
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
